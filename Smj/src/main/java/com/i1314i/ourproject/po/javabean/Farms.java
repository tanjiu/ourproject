package com.i1314i.ourproject.po.javabean;

import java.util.Date;

public class Farms {
    private Integer yangzhiId;

    private String name;

    private String zhenJie;

    private String address;

    private String type;

    private Date year;

    private String cunLanGuimo;

    private String nianChulanLiang;

    private String fuzeren;

    private String lianxiren;

    private String lianxirenTel;

    private Double x;

    private Double y;

    public Integer getYangzhiId() {
        return yangzhiId;
    }

    public void setYangzhiId(Integer yangzhiId) {
        this.yangzhiId = yangzhiId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getZhenJie() {
        return zhenJie;
    }

    public void setZhenJie(String zhenJie) {
        this.zhenJie = zhenJie == null ? null : zhenJie.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public String getCunLanGuimo() {
        return cunLanGuimo;
    }

    public void setCunLanGuimo(String cunLanGuimo) {
        this.cunLanGuimo = cunLanGuimo == null ? null : cunLanGuimo.trim();
    }

    public String getNianChulanLiang() {
        return nianChulanLiang;
    }

    public void setNianChulanLiang(String nianChulanLiang) {
        this.nianChulanLiang = nianChulanLiang == null ? null : nianChulanLiang.trim();
    }

    public String getFuzeren() {
        return fuzeren;
    }

    public void setFuzeren(String fuzeren) {
        this.fuzeren = fuzeren == null ? null : fuzeren.trim();
    }

    public String getLianxiren() {
        return lianxiren;
    }

    public void setLianxiren(String lianxiren) {
        this.lianxiren = lianxiren == null ? null : lianxiren.trim();
    }

    public String getLianxirenTel() {
        return lianxirenTel;
    }

    public void setLianxirenTel(String lianxirenTel) {
        this.lianxirenTel = lianxirenTel == null ? null : lianxirenTel.trim();
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