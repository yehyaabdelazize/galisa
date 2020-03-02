package com.example.galisa.pojo.model;

public class MessageModel {

    private int im;
    String name;
    String mess_text;
    String mess_time;

    public int getIm() {
        return im;
    }

    public void setIm(int im) {
        this.im = im;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMess_text() {
        return mess_text;
    }

    public void setMess_text(String mess_text) {
        this.mess_text = mess_text;
    }

    public String getMess_time() {
        return mess_time;
    }

    public void setMess_time(String mess_time) {
        this.mess_time = mess_time;
    }

    public MessageModel(int im, String name, String mess_text, String mess_time) {
        this.im = im;
        this.name = name;
        this.mess_text = mess_text;
        this.mess_time = mess_time;
    }
}
