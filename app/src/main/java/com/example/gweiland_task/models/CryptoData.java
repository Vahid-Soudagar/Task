package com.example.gweiland_task.models;

import com.google.gson.annotations.SerializedName;

import java.sql.Timestamp;
import java.util.List;

public class CryptoData {

    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;
    @SerializedName("symbol")
    private String symbol;
    @SerializedName("category")
    private String category;
    @SerializedName("description")
    private String description;
    @SerializedName("slug")
    private String slug;
    @SerializedName("logo")
    private String logo;
    @SerializedName("subreddit")
    private String subreddit;
    @SerializedName("notice")
    private String notice;
    @SerializedName("tags")
    private List<String> tags;
    @SerializedName("tag-names")
    private List<String> tagNames;
    @SerializedName("tag-groups")
    private List<String> tagGroups;
    @SerializedName("urls")
    private Urls urls;
    @SerializedName("platform")
    private Object platform;
    @SerializedName("date_added")
    private Timestamp dateAdded;
    @SerializedName("twitter_username")
    private String twitterUserName;
    @SerializedName("is_hidden")
    private int isHidden;
    @SerializedName("date_launched")
    private Timestamp dateLaunched;
    @SerializedName("contract_address")
    private List<ContractAddress> contractAddresses;
    @SerializedName("self_reported_circulating_supply")
    private String selfReportedCirculatingSupply;
    @SerializedName("self_reported_market_cap")
    private String selfReportedMarketCap;
    @SerializedName("self_reported_tags")
    private String selfReportedTags;
    @SerializedName("infinite_supply")
    private boolean infiniteSupply;


    public CryptoData() {
    }

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getSubreddit() {
        return subreddit;
    }

    public void setSubreddit(String subreddit) {
        this.subreddit = subreddit;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<String> getTagNames() {
        return tagNames;
    }

    public void setTagNames(List<String> tagNames) {
        this.tagNames = tagNames;
    }

    public List<String> getTagGroups() {
        return tagGroups;
    }

    public void setTagGroups(List<String> tagGroups) {
        this.tagGroups = tagGroups;
    }

    public Urls getUrls() {
        return urls;
    }

    public void setUrls(Urls urls) {
        this.urls = urls;
    }

    public Object getPlatform() {
        return platform;
    }

    public void setPlatform(Object platform) {
        this.platform = platform;
    }

    public Timestamp getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Timestamp dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getTwitterUserName() {
        return twitterUserName;
    }

    public void setTwitterUserName(String twitterUserName) {
        this.twitterUserName = twitterUserName;
    }

    public int getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(int isHidden) {
        this.isHidden = isHidden;
    }

    public Timestamp getDateLaunched() {
        return dateLaunched;
    }

    public void setDateLaunched(Timestamp dateLaunched) {
        this.dateLaunched = dateLaunched;
    }

    public List<ContractAddress> getContractAddresses() {
        return contractAddresses;
    }

    public void setContractAddresses(List<ContractAddress> contractAddresses) {
        this.contractAddresses = contractAddresses;
    }

    public String getSelfReportedCirculatingSupply() {
        return selfReportedCirculatingSupply;
    }

    public void setSelfReportedCirculatingSupply(String selfReportedCirculatingSupply) {
        this.selfReportedCirculatingSupply = selfReportedCirculatingSupply;
    }

    public String getSelfReportedMarketCap() {
        return selfReportedMarketCap;
    }

    public void setSelfReportedMarketCap(String selfReportedMarketCap) {
        this.selfReportedMarketCap = selfReportedMarketCap;
    }

    public String getSelfReportedTags() {
        return selfReportedTags;
    }

    public void setSelfReportedTags(String selfReportedTags) {
        this.selfReportedTags = selfReportedTags;
    }

    public boolean isInfiniteSupply() {
        return infiniteSupply;
    }

    public void setInfiniteSupply(boolean infiniteSupply) {
        this.infiniteSupply = infiniteSupply;
    }

    @Override
    public String toString() {
        return "CryptoData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", slug='" + slug + '\'' +
                ", logo='" + logo + '\'' +
                ", subreddit='" + subreddit + '\'' +
                ", notice='" + notice + '\'' +
                ", tags=" + tags +
                ", tagNames=" + tagNames +
                ", tagGroups=" + tagGroups +
                ", urls=" + urls +
                ", platform=" + platform +
                ", dateAdded=" + dateAdded +
                ", twitterUserName='" + twitterUserName + '\'' +
                ", isHidden=" + isHidden +
                ", dateLaunched=" + dateLaunched +
                ", contractAddresses=" + contractAddresses +
                ", selfReportedCirculatingSupply='" + selfReportedCirculatingSupply + '\'' +
                ", selfReportedMarketCap='" + selfReportedMarketCap + '\'' +
                ", selfReportedTags='" + selfReportedTags + '\'' +
                ", infiniteSupply=" + infiniteSupply +
                '}';
    }
}
