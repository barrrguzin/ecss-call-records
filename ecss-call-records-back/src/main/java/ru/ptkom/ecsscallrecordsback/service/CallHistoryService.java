package ru.ptkom.ecsscallrecordsback.service;

import org.springframework.stereotype.Service;
import ru.ptkom.ecsscallrecordsback.model.CallWithRecord;

import java.util.List;


public interface CallHistoryService {

    public List<CallWithRecord> getCallRecordsByNumberAndDay(String number, String day);

}
