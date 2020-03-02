package com.example.galisa.pojo.model;

public class NotificationModel {
    private int im;
    String noti_text;
    String noti_time;

    public int getIm() {
        return im;
    }

    public void setIm(int im) {
        this.im = im;
    }

    public String getNoti_text() {
        return noti_text;
    }

    public void setNoti_text(String noti_text) {
        this.noti_text = noti_text;
    }

    public String getNoti_time() {
        return noti_time;
    }

    public void setNoti_time(String noti_time) {
        this.noti_time = noti_time;
    }

    public NotificationModel(int im, String noti_text, String noti_time) {
        this.im = im;
        this.noti_text = noti_text;
        this.noti_time = noti_time;
    }
}
