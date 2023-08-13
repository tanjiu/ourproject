package com.i1314i.ourproject.po.javabean;

public class SlaughterHouse {
    private Integer tuzaiId;

    private String name;

    private String address;

    private String type;

    private String faren;

    private String tel;

    private Integer number;

    private String x;

    private String y;

    public Integer getTuzaiId() {
        return tuzaiId;
    }

    public void setTuzaiId(Integer tuzaiId) {
        this.tuzaiId = tuzaiId;
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

    public String getFaren() {
        return faren;
    }

    public void setFaren(String faren) {
        this.faren = faren == null ? null : faren.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x == null ? null : x.trim();
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y == null ? null : y.trim();
    }
}