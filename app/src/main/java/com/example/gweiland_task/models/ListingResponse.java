package com.example.gweiland_task.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListingResponse {
    @SerializedName("status")
    private Status status;
    @SerializedName("data")
    private List<Cryptocurrency> data;

    public ListingResponse() {
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Cryptocurrency> getData() {
        return data;
    }

    public void setData(List<Cryptocurrency> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ApiResponse{" +
                "status='" + status + '\'' +
                ", data=" + data +
                '}';
    }
}
