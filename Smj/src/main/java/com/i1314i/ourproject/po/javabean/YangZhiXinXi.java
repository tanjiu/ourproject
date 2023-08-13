package com.i1314i.ourproject.po.javabean;

import java.util.Date;

public class YangZhiXinXi {
    private Integer shengChuId;

    private String shengChuMingCheng;

    private Integer chuLanLiang;

    private Double beiyong1;

    private Integer beiyong2;

    private String beiyong3;

    private Date shijian;

    public Integer getShengChuId() {
        return shengChuId;
    }

    public void setShengChuId(Integer shengChuId) {
        this.shengChuId = shengChuId;
    }

    public String getShengChuMingCheng() {
        return shengChuMingCheng;
    }

    public void setShengChuMingCheng(String shengChuMingCheng) {
        this.shengChuMingCheng = shengChuMingCheng == null ? null : shengChuMingCheng.trim();
    }

    public Integer getChuLanLiang() {
        return chuLanLiang;
    }

    public void setChuLanLiang(Integer chuLanLiang) {
        this.chuLanLiang = chuLanLiang;
    }

    public Double getBeiyong1() {
        return beiyong1;
    }

    public void setBeiyong1(Double beiyong1) {
        this.beiyong1 = beiyong1;
    }

    public Integer getBeiyong2() {
        return beiyong2;
    }

    public void setBeiyong2(Integer beiyong2) {
        this.beiyong2 = beiyong2;
    }

    public String getBeiyong3() {
        return beiyong3;
    }

    public void setBeiyong3(String beiyong3) {
        this.beiyong3 = beiyong3 == null ? null : beiyong3.trim();
    }

    public Date getShijian() {
        return shijian;
    }

    public void setShijian(Date shijian) {
        this.shijian = shijian;
    }
}