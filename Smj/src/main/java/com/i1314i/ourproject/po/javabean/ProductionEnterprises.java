package com.i1314i.ourproject.po.javabean;

public class ProductionEnterprises {
    private Integer shengchanId;

    private String name;

    private String address;

    private String type;

    private String jingyingFangshi;

    private String farenTelphone;

    private String legalRepresentative;

    private String lianxiren;

    private String lianxirenTel;

    private Double x;

    private Double y;

    public Integer getShengchanId() {
        return shengchanId;
    }

    public void setShengchanId(Integer shengchanId) {
        this.shengchanId = shengchanId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public String getJingyingFangshi() {
        return jingyingFangshi;
    }

    public void setJingyingFangshi(String jingyingFangshi) {
        this.jingyingFangshi = jingyingFangshi == null ? null : jingyingFangshi.trim();
    }

    public String getFarenTelphone() {
        return farenTelphone;
    }

    public void setFarenTelphone(String farenTelphone) {
        this.farenTelphone = farenTelphone == null ? null : farenTelphone.trim();
    }

    public String getLegalRepresentative() {
        return legalRepresentative;
    }

    public void setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative == null ? null : legalRepresentative.trim();
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