package com.jayo.ec03.model;

public class Region extends Platos {
    private int region;


    public Region(String name, String imgUrl, int season) {
        super(name, imgUrl);
        this.region = season;
    }

    public int getSeason() {
        return region;
    }

    public void setSeason(int season) {
        this.region = season;
    }
}
