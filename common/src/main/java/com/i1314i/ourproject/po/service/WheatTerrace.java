package com.i1314i.ourproject.po.service;

public class WheatTerrace {
    private Integer wheatTerraceId;

    private String terraceName;

    private String adress;

    private String information;

    private Double x;

    private Double y;

    private String reserve1;

    private String reserve2;

    public Integer getWheatTerraceId() {
        return wheatTerraceId;
    }

    public void setWheatTerraceId(Integer wheatTerraceId) {
        this.wheatTerraceId = wheatTerraceId;
    }

    public String getTerraceName() {
        return terraceName;
    }

    public void setTerraceName(String terraceName) {
        this.terraceName = terraceName == null ? null : terraceName.trim();
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress == null ? null : adress.trim();
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information == null ? null : information.trim();
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1 == null ? null : reserve1.trim();
    }

    public String getReserve2() {
        return reserve2;
    }

    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2 == null ? null : reserve2.trim();
    }
}