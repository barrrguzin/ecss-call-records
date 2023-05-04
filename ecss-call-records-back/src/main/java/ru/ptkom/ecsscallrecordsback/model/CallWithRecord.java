package ru.ptkom.ecsscallrecordsback.model;

import java.math.BigInteger;

public class CallWithRecord {

    private String numberA;
    private String numberB;
    private String startTime;
    private String duration;
    private String callRecordUrl;




    public CallWithRecord(String numberA, String numberB, String startTime, String duration, String callRecordUrl) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.startTime = startTime;
        this.duration = duration;
        this.callRecordUrl = callRecordUrl;
    }

    public CallWithRecord(String numberA, String numberB, String startTime, BigInteger duration, String callRecordUrl) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.startTime = startTime;
        this.duration = duration.toString();
        this.callRecordUrl = callRecordUrl;
    }

    public CallWithRecord() {}




    public String getNumberA() {
        return numberA;
    }

    public void setNumberA(String numberA) {
        this.numberA = numberA;
    }

    public String getNumberB() {
        return numberB;
    }

    public void setNumberB(String numberB) {
        this.numberB = numberB;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getCallRecordUrl() {
        return callRecordUrl;
    }

    public void setCallRecordUrl(String callRecordUrl) {
        this.callRecordUrl = callRecordUrl;
    }
}
