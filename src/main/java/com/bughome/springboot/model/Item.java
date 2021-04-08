package com.bughome.springboot.model;

import java.util.Date;

/**
 * @Author Zgh
 * @Date 2021/3/8 16:10
 */
public class Item {
    private Integer id;
    private String uname;
    private String utel;
    private String price;
    private Integer number;
    private String address;
    private Date datetime;
    private String other;

    @Override
    public String toString() {
        return "Item{" +
                "uname='" + uname + '\'' +
                ", utel='" + utel + '\'' +
                ", price='" + price + '\'' +
                ", number=" + number +
                ", address='" + address + '\'' +
                ", datetime=" + datetime +
                ", other='" + other + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUtel() {
        return utel;
    }

    public void setUtel(String utel) {
        this.utel = utel;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}
