package com.i1314i.ourproject.po.javabean;

public class ManagementEnterprises {
    private Integer jingyingId;

    private String name;

    private String address;

    private String type;

    private String farenTelphone;

    private String legalRepresentative;

    private Double y;

    private Double x;

    public Integer getJingyingId() {
        return jingyingId;
    }

    public void setJingyingId(Integer jingyingId) {
        this.jingyingId = jingyingId;
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

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }
}