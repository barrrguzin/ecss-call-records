package ru.ptkom.ecsscallrecordsback.dao;


import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import ru.ptkom.ecsscallrecordsback.exception.EltexHttpTerminalErrorException;
import ru.ptkom.ecsscallrecordsback.exception.EltexInvalidCredentialsException;
import ru.ptkom.ecsscallrecordsback.model.CallHistoryModel.*;
import ru.ptkom.ecsscallrecordsback.model.CallWithRecord;


import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringReader;
import java.io.StringWriter;


import javax.net.ssl.*;
import javax.xml.bind.Unmarshaller;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Component
public class ECSSAPIDAO {

    private final RestTemplate restTemplate;

    public ECSSAPIDAO(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    private static String TOKEN = "empty";
    private static String LOGIN = "aosunitskii";
    private static String PASSWORD = "321qWe98_";
    private String ADDRESS = "10.60.0.114";
    private String URL = "https://10.60.0.114:9999";
    private String DOMAIN_NAME = "voip.ptk.loc";
    private final String CALL_HISTORY_SUFFIX = "/commands/calls_history";
    private final String LOGIN_SUFFIX = "/system/login";
    private final static String AUTH_REQUEST_CONST = "<in><login user = \"%s\" password=\"%s\" /></in>";
    private final static String CALLS_LIMIT = "250";
    private static String AUTH_REQUEST;


    static {
        disableSslVerification();
        AUTH_REQUEST = String.format(AUTH_REQUEST_CONST, LOGIN, PASSWORD);
    }





    @PostConstruct
    private void authenticate() {
        HttpEntity requestEntity = new HttpEntity(AUTH_REQUEST);
        ResponseEntity response = restTemplate.exchange(URL + LOGIN_SUFFIX, HttpMethod.POST, requestEntity, String.class);

        HttpStatus statusCode = response.getStatusCode();

        if (statusCode.is2xxSuccessful()) {
            String token = response.getHeaders().getFirst("Set-Cookie");
            TOKEN = token;
        } else if (statusCode.is4xxClientError()) {
            //log
            System.out.println("Invalid credentials: " + statusCode);
        }


    }


    public List<CallWithRecord> callRecordDataToUser(String number, String fromDate, String toDate) {

        List<CallType> fullDataFromCallHistoryWithRecord = getCallHistoryWithRecords(number, fromDate, toDate);
        List<CallWithRecord> callsWithRecordsToUser = new ArrayList<>(fullDataFromCallHistoryWithRecord.size());

        for (CallType call : fullDataFromCallHistoryWithRecord) {
            callsWithRecordsToUser.add(new CallWithRecord(call.getAddrA(), call.getAddrB(), call.getStartTime(), call.getDurationTime(), setCallRecordUrl(call)));
        }

        return callsWithRecordsToUser;
    }


    private String setCallRecordUrl(CallType call) {

        if (call.getCallRecordA() != null) {
            String callRecordUrl = call.getCallRecordA();
            return callRecordUrl.replace("127.0.0.1", ADDRESS);

        } else {
            String callRecordUrl = call.getCallRecordB();
            return callRecordUrl.replace("127.0.0.1", ADDRESS);
        }
    }


    private List<CallType> getCallHistoryWithRecords(String number, String fromDate, String toDate) {

        List<CallType> listOfCallsWithRecord = getCallHistory(number, fromDate, toDate, CALLS_LIMIT).stream()
                .filter(call -> call.getCallRecordA() != null || call.getCallRecordB() != null)
                .collect(Collectors.toList());

        return listOfCallsWithRecord;
    }


    private List<CallType> getCallHistory(String number, String fromDate, String toDate, String callsOnPage) {       //13.04.2023 12:00:00 --- Date format

        In callHistoryRequest = new In(DOMAIN_NAME, callsOnPage, fromDate, toDate, number, CallsTypeType.HISTORY);
        String requestBody = marshalToXmlString(callHistoryRequest, In.class);
        ResponseEntity callHistoryResponse = sendRequestAndReAuthenticateIfFirstTryIsUnsuccessful(requestBody, CALL_HISTORY_SUFFIX);
        Out callHistory = unmarshallCallHistoryResponse(callHistoryResponse.getBody().toString());

        return callHistory.getResponse().getDomain().getCall();
    }


    private String marshalToXmlString(Object objectToMarshal, Class objectClass) {
        StringWriter outputXmlStringWriter = new StringWriter();

        try {
            JAXBContext context = JAXBContext.newInstance(objectClass);
            Marshaller marshaller = context.createMarshaller();
            marshaller.marshal(objectToMarshal, outputXmlStringWriter);
            String xml = outputXmlStringWriter.toString();
            return xml;

        } catch (JAXBException e) {
            //log
            System.out.println("Marshalling end with error: " + e.getMessage());
            throw new RuntimeException("Marshalling end with error: " + e.getMessage());

        }
    }


    private Out unmarshallCallHistoryResponse(String xmlString) {

        try {
            JAXBContext context = JAXBContext.newInstance(Out.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            StringReader xml = new StringReader(xmlString);
            Out callHistory = (Out) unmarshaller.unmarshal(xml);
            return callHistory;

        } catch (JAXBException e) {
            //log
            System.out.println("Unmarshalling end with error: " + e.getMessage());
            throw new RuntimeException("Unmarshalling end with error: " + e.getMessage());

        }
    }


    private ResponseEntity sendRequest(String requestBody, String urlSuffix) throws EltexInvalidCredentialsException, EltexHttpTerminalErrorException {

        HttpHeaders headers = new HttpHeaders();
        headers.add("Cookie", TOKEN);
        HttpEntity httpEntity = new HttpEntity(requestBody, headers);
        ResponseEntity response = restTemplate.exchange(URL + urlSuffix, HttpMethod.POST, httpEntity, String.class);

        HttpStatus statusCode = response.getStatusCode();

        if (statusCode.is2xxSuccessful()) {
            return response;

        } else if (statusCode.is4xxClientError()) {
            throw new EltexInvalidCredentialsException("Credentials is invalid, check it in config file");

        } else {
            throw new EltexHttpTerminalErrorException("ECSS-10 return error with code " + statusCode + ". It says: " + response.getBody());
        }
    }


    private ResponseEntity sendRequestAndReAuthenticateIfFirstTryIsUnsuccessful(String requestBody, String urlSuffix) {
        try {
            ResponseEntity serverResponse = sendRequest(requestBody, urlSuffix);
            return serverResponse;

        } catch (EltexInvalidCredentialsException e) {
            authenticate();

            try {
                ResponseEntity serverResponse = sendRequest(requestBody, urlSuffix);
                return serverResponse;

            } catch (EltexInvalidCredentialsException ex) {
                throw new RuntimeException(ex);

            } catch (EltexHttpTerminalErrorException ex) {
                throw new RuntimeException(ex);
            }

        } catch (EltexHttpTerminalErrorException e) {
            throw new RuntimeException(e);
        }
    }





    private static void disableSslVerification() {
        try {
            // Create a trust manager that does not validate certificate chains
            TrustManager[] trustAllCerts = new TrustManager[] {new X509TrustManager() {
                public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                    return null;
                }
                public void checkClientTrusted(X509Certificate[] certs, String authType) {
                }
                public void checkServerTrusted(X509Certificate[] certs, String authType) {
                }
            }
            };

            // Install the all-trusting trust manager
            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

            // Create all-trusting host name verifier
            HostnameVerifier allHostsValid = new HostnameVerifier() {
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            };

            // Install the all-trusting host verifier
            HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        }
    }

}
