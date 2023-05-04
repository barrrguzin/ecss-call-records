package ru.ptkom.ecsscallrecordsback.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.ptkom.ecsscallrecordsback.model.CallWithRecord;
import ru.ptkom.ecsscallrecordsback.service.CallHistoryService;

import java.util.List;

@RestController
public class BitrixCallRecordController {

    private final CallHistoryService callHistoryService;

    public BitrixCallRecordController(CallHistoryService callHistoryService) {
        this.callHistoryService = callHistoryService;
    }

    @CrossOrigin
    @PostMapping("/")
    public ResponseEntity<List<CallWithRecord>> getCallHistoryWithRecords(@RequestParam String number, @RequestParam String date) {

        Integer num = (Integer.parseInt(number.replace("832627b4f6", ""))/3463246);

        if (110<num || num<200) {
            String trueNumber = num.toString();
            HttpHeaders headers = new HttpHeaders();
            headers.set("X-Frame-Options", "ALLOW-FROM https://crm.ptkom.ru/");
            headers.set("Content-Security-Policy", "frame-ancestors 'self' https://crm.ptkom.ru/");

            List<CallWithRecord> callsWithRecords = callHistoryService.getCallRecordsByNumberAndDay(trueNumber,date);

            return ResponseEntity.ok().headers(headers).body(callsWithRecords);

        } else {
            return ResponseEntity.internalServerError().build();
        }
    }


    @GetMapping("/{number}")
    public ResponseEntity<List<CallWithRecord>> getCallHistoryWithRecordsTest(@PathVariable String number) {

        Integer num = (Integer.parseInt(number.replace("832627b4f6", ""))/3463246);

        if (110<num || num<200) {
            String trueNumber = num.toString();
            HttpHeaders headers = new HttpHeaders();
            headers.set("X-Frame-Options", "ALLOW-FROM https://crm.ptkom.ru/");
            headers.set("Content-Security-Policy", "frame-ancestors 'self' https://crm.ptkom.ru/");

            List<CallWithRecord> callsWithRecords = callHistoryService.getCallRecordsByNumberAndDay(trueNumber,"2023-03-27");

            return ResponseEntity.ok().headers(headers).body(callsWithRecords);

        } else {
            return ResponseEntity.internalServerError().build();
        }
    }
}
