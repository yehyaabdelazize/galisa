package com.example.galisa.pojo.model;

public class HomeModel {
    private int im;
    String name;
    String ratingbar;
    String views;
    String rating;

    public HomeModel(int im, String name, String ratingbar, String views, String rating) {
        this.im = im;
        this.name = name;
        this.ratingbar = ratingbar;
        this.views = views;
        this.rating = rating;
    }

    public HomeModel(int im, String name, String views, String rating) {
        this.im = im;
        this.name = name;
        this.views = views;
        this.rating = rating;
    }

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

    public String getRatingbar() {
        return ratingbar;
    }

    public void setRatingbar(String ratingbar) {
        this.ratingbar = ratingbar;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
