package com.example.gweiland_task.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Urls {

    @SerializedName("website")
    private List<String> website;
    @SerializedName("twitter")
    private List<String> twitter;
    @SerializedName("message_board")
    private List<String> messageBoard;
    @SerializedName("chat")
    private List<String> chat;
    @SerializedName("facebook")
    private List<String> facebook;
    @SerializedName("explorer")
    private List<String> explorer;
    @SerializedName("reddit")
    private List<String> reddit;
    @SerializedName("technical_doc")
    private List<String> technicalDoc;
    @SerializedName("source_code")
    private List<String> sourceCode;

    public Urls() {

    }

    public List<String> getWebsite() {
        return website;
    }

    public void setWebsite(List<String> website) {
        this.website = website;
    }

    public List<String> getTwitter() {
        return twitter;
    }

    public void setTwitter(List<String> twitter) {
        this.twitter = twitter;
    }

    public List<String> getMessageBoard() {
        return messageBoard;
    }

    public void setMessageBoard(List<String> messageBoard) {
        this.messageBoard = messageBoard;
    }

    public List<String> getChat() {
        return chat;
    }

    public void setChat(List<String> chat) {
        this.chat = chat;
    }

    public List<String> getFacebook() {
        return facebook;
    }

    public void setFacebook(List<String> facebook) {
        this.facebook = facebook;
    }

    public List<String> getExplorer() {
        return explorer;
    }

    public void setExplorer(List<String> explorer) {
        this.explorer = explorer;
    }

    public List<String> getReddit() {
        return reddit;
    }

    public void setReddit(List<String> reddit) {
        this.reddit = reddit;
    }

    public List<String> getTechnicalDoc() {
        return technicalDoc;
    }

    public void setTechnicalDoc(List<String> technicalDoc) {
        this.technicalDoc = technicalDoc;
    }

    public List<String> getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(List<String> sourceCode) {
        this.sourceCode = sourceCode;
    }

    @Override
    public String toString() {
        return "Urls{" +
                "website=" + website +
                ", twitter=" + twitter +
                ", messageBoard=" + messageBoard +
                ", chat=" + chat +
                ", facebook=" + facebook +
                ", explorer=" + explorer +
                ", reddit=" + reddit +
                ", technicalDoc=" + technicalDoc +
                ", sourceCode=" + sourceCode +
                '}';
    }
}
