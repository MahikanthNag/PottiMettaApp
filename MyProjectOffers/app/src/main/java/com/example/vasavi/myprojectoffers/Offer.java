package com.example.vasavi.myprojectoffers;

/**
 * Created by vasavi on 3/31/2017.
 */



public class Offer {
    private String title, desc, percent;

    public Offer() {
    }

    public Offer(String title, String desc, String percent) {
        this.title = title;
        this.desc = desc;
        this.percent = percent;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }
}
