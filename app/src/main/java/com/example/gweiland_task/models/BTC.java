package com.example.gweiland_task.models;

import com.google.gson.annotations.SerializedName;

public class BTC {

    @SerializedName("price")
    private double price;
    @SerializedName("volume_24h")
    private double volume24h;

    @SerializedName("volume_change_24h")
    private Double volumeChange24h; // Adjust the type based on the actual data type

    @SerializedName("percent_change_1h")
    private Double percentChange1h; // Adjust the type based on the actual data type

    @SerializedName("percent_change_24h")
    private Double percentChange24h; // Adjust the type based on the actual data type

    @SerializedName("percent_change_7d")
    private Double percentChange7d; // Adjust the type based on the actual data type

    @SerializedName("market_cap")
    private Double marketCap; // Adjust the type based on the actual data type

    @SerializedName("market_cap_dominance")
    private int marketCapDominance;

    @SerializedName("fully_diluted_market_cap")
    private Double fullyDilutedMarketCap; // Adjust the type based on the actual data type

    @SerializedName("last_updated")
    private String lastUpdated;

    public BTC() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVolume24h() {
        return volume24h;
    }

    public void setVolume24h(double volume24h) {
        this.volume24h = volume24h;
    }

    public Double getVolumeChange24h() {
        return volumeChange24h;
    }

    public void setVolumeChange24h(Double volumeChange24h) {
        this.volumeChange24h = volumeChange24h;
    }

    public Double getPercentChange1h() {
        return percentChange1h;
    }

    public void setPercentChange1h(Double percentChange1h) {
        this.percentChange1h = percentChange1h;
    }

    public Double getPercentChange24h() {
        return percentChange24h;
    }

    public void setPercentChange24h(Double percentChange24h) {
        this.percentChange24h = percentChange24h;
    }

    public Double getPercentChange7d() {
        return percentChange7d;
    }

    public void setPercentChange7d(Double percentChange7d) {
        this.percentChange7d = percentChange7d;
    }

    public Double getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(Double marketCap) {
        this.marketCap = marketCap;
    }

    public int getMarketCapDominance() {
        return marketCapDominance;
    }

    public void setMarketCapDominance(int marketCapDominance) {
        this.marketCapDominance = marketCapDominance;
    }

    public Double getFullyDilutedMarketCap() {
        return fullyDilutedMarketCap;
    }

    public void setFullyDilutedMarketCap(Double fullyDilutedMarketCap) {
        this.fullyDilutedMarketCap = fullyDilutedMarketCap;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return "BTC{" +
                "price=" + price +
                ", volume24h=" + volume24h +
                ", volumeChange24h=" + volumeChange24h +
                ", percentChange1h=" + percentChange1h +
                ", percentChange24h=" + percentChange24h +
                ", percentChange7d=" + percentChange7d +
                ", marketCap=" + marketCap +
                ", marketCapDominance=" + marketCapDominance +
                ", fullyDilutedMarketCap=" + fullyDilutedMarketCap +
                ", lastUpdated='" + lastUpdated + '\'' +
                '}';
    }
}
