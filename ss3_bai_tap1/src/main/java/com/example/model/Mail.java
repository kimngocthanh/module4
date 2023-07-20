package com.example.model;

public class Mail {
    private int id;
    private String languages;
    private int pageSize;
    private boolean spamsFiller;
    private String signature;

    public Mail() {
    }

    public Mail(int id, String languages, int pageSize, boolean spamsFiller, String signature) {
        this.id = id;
        this.languages = languages;
        this.pageSize = pageSize;
        this.spamsFiller = spamsFiller;
        this.signature = signature;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isSpamsFiller() {
        return spamsFiller;
    }

    public void setSpamsFiller(boolean spamsFiller) {
        this.spamsFiller = spamsFiller;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "id=" + id +
                ", languages='" + languages + '\'' +
                ", pageSize=" + pageSize +
                ", spamsFiller=" + spamsFiller +
                ", signature='" + signature + '\'' +
                '}';
    }
}
