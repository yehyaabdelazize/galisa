package com.example.galisa.pojo.model;

public class OrderHomeGalisaModel {
     private  String age,time,date,sum;

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public OrderHomeGalisaModel(String age, String date, String time,String sum) {
        this.age = age;
        this.time = time;
        this.date = date;
        this.sum=sum;
    }
}
