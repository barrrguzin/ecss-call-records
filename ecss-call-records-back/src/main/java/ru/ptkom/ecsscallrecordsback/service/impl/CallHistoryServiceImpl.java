package ru.ptkom.ecsscallrecordsback.service.impl;

import org.springframework.stereotype.Service;
import ru.ptkom.ecsscallrecordsback.dao.ECSSAPIDAO;
import ru.ptkom.ecsscallrecordsback.model.CallWithRecord;
import ru.ptkom.ecsscallrecordsback.service.CallHistoryService;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class CallHistoryServiceImpl implements CallHistoryService {

    private final ECSSAPIDAO ecssapidao;

    public CallHistoryServiceImpl(ECSSAPIDAO ecssapidao) {
        this.ecssapidao = ecssapidao;
    }


    public List<CallWithRecord> getCallRecordsByNumberAndDay(String number, String day){

        try {
            Date inputStartDate = new SimpleDateFormat("yyyy-MM-dd").parse(day);
            String fromDate = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(inputStartDate);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(inputStartDate);
            calendar.add(Calendar.DAY_OF_YEAR, 1);

            String toDate = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(calendar.getTime());

            return ecssapidao.callRecordDataToUser(number, fromDate, toDate);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
