package com.example.gweiland_task.models;

import com.google.gson.annotations.SerializedName;

public class Quote {

    @SerializedName("USD")
    private USD usd;
    @SerializedName("BTC")
    private BTC btc;

    public Quote() {
    }

    public USD getUsd() {
        return usd;
    }

    public void setUsd(USD usd) {
        this.usd = usd;
    }

    public BTC getBtc() {
        return btc;
    }

    public void setBtc(BTC btc) {
        this.btc = btc;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "usd=" + usd +
                ", btc=" + btc +
                '}';
    }
}
