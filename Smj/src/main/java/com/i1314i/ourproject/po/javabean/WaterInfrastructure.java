package com.i1314i.ourproject.po.javabean;

public class WaterInfrastructure {
    private String shuiliJd;

    private String name;

    private String location;

    private String beizhu;

    private Double x;

    private Double y;

    public String getShuiliJd() {
        return shuiliJd;
    }

    public void setShuiliJd(String shuiliJd) {
        this.shuiliJd = shuiliJd == null ? null : shuiliJd.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
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
}