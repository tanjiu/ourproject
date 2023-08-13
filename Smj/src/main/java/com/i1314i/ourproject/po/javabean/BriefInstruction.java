package com.i1314i.ourproject.po.javabean;

import java.util.Date;

public class BriefInstruction {
    private Integer shichangId;

    private String name;

    private String address;

    private String product;

    private String telphone;

    private String gongXu;

    private String jieshao;

    private Date fabutime;

    private Double x;

    private Double y;

    public Integer getShichangId() {
        return shichangId;
    }

    public void setShichangId(Integer shichangId) {
        this.shichangId = shichangId;
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

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product == null ? null : product.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public String getGongXu() {
        return gongXu;
    }

    public void setGongXu(String gongXu) {
        this.gongXu = gongXu == null ? null : gongXu.trim();
    }

    public String getJieshao() {
        return jieshao;
    }

    public void setJieshao(String jieshao) {
        this.jieshao = jieshao == null ? null : jieshao.trim();
    }

    public Date getFabutime() {
        return fabutime;
    }

    public void setFabutime(Date fabutime) {
        this.fabutime = fabutime;
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