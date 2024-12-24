package com.micien.pattern.creational.prototype;

import java.util.Date;

public class Mail implements Cloneable {
    private String name;
    private String content;
    private Date date;
    private String address;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
