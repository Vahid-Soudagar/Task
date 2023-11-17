package com.example.gweiland_task.models;

import com.google.gson.annotations.SerializedName;

import java.sql.Timestamp;

public class Status {

    @SerializedName("timestamp")
    private Timestamp timestamp;
    @SerializedName("error_code")
    private int errorCode;
    @SerializedName("error_message")
    private String errorMessage;
    @SerializedName("elapsed")
    private int elapsed;
    @SerializedName("credit_count")
    private int creditCount;
    @SerializedName("notice")
    private String notice;
    @SerializedName("total_count")
    private int totalCount;

    public Status() {
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public int getElapsed() {
        return elapsed;
    }

    public void setElapsed(int elapsed) {
        this.elapsed = elapsed;
    }

    public int getCreditCount() {
        return creditCount;
    }

    public void setCreditCount(int creditCount) {
        this.creditCount = creditCount;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public String toString() {
        return "Status{" +
                "timestamp=" + timestamp +
                ", errorCode=" + errorCode +
                ", errorMessage='" + errorMessage + '\'' +
                ", elapsed=" + elapsed +
                ", creditCount=" + creditCount +
                ", notice='" + notice + '\'' +
                ", totalCount=" + totalCount +
                '}';
    }
}
