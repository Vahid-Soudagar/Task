package com.example.gweiland_task.models;

import com.google.gson.annotations.SerializedName;

public class MetaDataResponse {

    @SerializedName("status")
    private Status status;
    @SerializedName("data")
    private CryptoData cryptoData;
}
