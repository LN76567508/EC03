package com.jayo.ec03.model;

public class Tipo extends Platos {

    private String tipoName;
    public Tipo(String name, String imgUrl, String tipoName) {
        super(name, imgUrl);
        this.tipoName = tipoName;
    }

    public String getSagaName() {
        return tipoName;
    }

    public void setSagaName(String tipoName) {
        this.tipoName = tipoName;
    }
}
