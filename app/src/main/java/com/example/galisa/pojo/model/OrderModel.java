package com.example.galisa.pojo.model;

public class OrderModel {

    String index,age,date,time,sum;

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public OrderModel(String index, String age, String date, String time, String sum) {
        this.index = index;
        this.age = age;
        this.date = date;
        this.time = time;
        this.sum = sum;
    }
}
