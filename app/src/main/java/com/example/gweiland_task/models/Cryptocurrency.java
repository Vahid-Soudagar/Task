package com.example.gweiland_task.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Cryptocurrency {
    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    @SerializedName("symbol")
    private String symbol;

    @SerializedName("slug")
    private String slug;

    @SerializedName("cmc_rank")
    private int cmcRank;

    @SerializedName("num_market_pairs")
    private int numMarketPairs;

    @SerializedName("circulating_supply")
    private double circulatingSupply;

    @SerializedName("total_supply")
    private double totalSupply;

    @SerializedName("max_supply")
    private double maxSupply;

    @SerializedName("infinite_supply")
    private Object infiniteSupply; // Adjust the type based on the actual data type

    @SerializedName("last_updated")
    private String lastUpdated;

    @SerializedName("date_added")
    private String dateAdded;

    @SerializedName("tags")
    private List<String> tags;

    @SerializedName("platform")
    private Object platform; // Adjust the type based on the actual data type

    @SerializedName("self_reported_circulating_supply")
    private Object selfReportedCirculatingSupply; // Adjust the type based on the actual data type

    @SerializedName("self_reported_market_cap")
    private Object selfReportedMarketCap; // Adjust the type based on the actual data type

    @SerializedName("quote")
    private Quote quote;

    public Cryptocurrency() {
    }

    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public int getCmcRank() {
        return cmcRank;
    }

    public void setCmcRank(int cmcRank) {
        this.cmcRank = cmcRank;
    }

    public int getNumMarketPairs() {
        return numMarketPairs;
    }

    public void setNumMarketPairs(int numMarketPairs) {
        this.numMarketPairs = numMarketPairs;
    }

    public double getCirculatingSupply() {
        return circulatingSupply;
    }

    public void setCirculatingSupply(double circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }

    public double getTotalSupply() {
        return totalSupply;
    }

    public void setTotalSupply(double totalSupply) {
        this.totalSupply = totalSupply;
    }

    public double getMaxSupply() {
        return maxSupply;
    }

    public void setMaxSupply(double maxSupply) {
        this.maxSupply = maxSupply;
    }

    public Object getInfiniteSupply() {
        return infiniteSupply;
    }

    public void setInfiniteSupply(Object infiniteSupply) {
        this.infiniteSupply = infiniteSupply;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Object getPlatform() {
        return platform;
    }

    public void setPlatform(Object platform) {
        this.platform = platform;
    }

    public Object getSelfReportedCirculatingSupply() {
        return selfReportedCirculatingSupply;
    }

    public void setSelfReportedCirculatingSupply(Object selfReportedCirculatingSupply) {
        this.selfReportedCirculatingSupply = selfReportedCirculatingSupply;
    }

    public Object getSelfReportedMarketCap() {
        return selfReportedMarketCap;
    }

    public void setSelfReportedMarketCap(Object selfReportedMarketCap) {
        this.selfReportedMarketCap = selfReportedMarketCap;
    }

    public Quote getQuote() {
        return quote;
    }

    public void setQuote(Quote quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "Cryptocurrency{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", slug='" + slug + '\'' +
                ", cmcRank=" + cmcRank +
                ", numMarketPairs=" + numMarketPairs +
                ", circulatingSupply=" + circulatingSupply +
                ", totalSupply=" + totalSupply +
                ", maxSupply=" + maxSupply +
                ", infiniteSupply=" + infiniteSupply +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", dateAdded='" + dateAdded + '\'' +
                ", tags=" + tags +
                ", platform=" + platform +
                ", selfReportedCirculatingSupply=" + selfReportedCirculatingSupply +
                ", selfReportedMarketCap=" + selfReportedMarketCap +
                ", quote=" + quote +
                '}';
    }
}

