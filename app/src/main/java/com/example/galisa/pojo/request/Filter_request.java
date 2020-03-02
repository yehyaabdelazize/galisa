package com.example.galisa.pojo.request;

public class Filter_request {
    int age_from ,age_to,time_from,time_to,price_from,price_to;
    String datefrom,dateto;

    public int getAge_from() {
        return age_from;
    }

    public void setAge_from(int age_from) {
        this.age_from = age_from;
    }

    public int getAge_to() {
        return age_to;
    }

    public void setAge_to(int age_to) {
        this.age_to = age_to;
    }

    public int getTime_from() {
        return time_from;
    }

    public void setTime_from(int time_from) {
        this.time_from = time_from;
    }

    public int getTime_to() {
        return time_to;
    }

    public void setTime_to(int time_to) {
        this.time_to = time_to;
    }

    public int getPrice_from() {
        return price_from;
    }

    public void setPrice_from(int price_from) {
        this.price_from = price_from;
    }

    public int getPrice_to() {
        return price_to;
    }

    public void setPrice_to(int price_to) {
        this.price_to = price_to;
    }

    public String getDatefrom() {
        return datefrom;
    }

    public void setDatefrom(String datefrom) {
        this.datefrom = datefrom;
    }

    public String getDateto() {
        return dateto;
    }

    public void setDateto(String dateto) {
        this.dateto = dateto;
    }
}
