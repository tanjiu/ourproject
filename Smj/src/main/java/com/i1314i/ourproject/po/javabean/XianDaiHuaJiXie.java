package com.i1314i.ourproject.po.javabean;

import java.util.Date;

public class XianDaiHuaJiXie {
    private Integer mianJiId;

    private String mianJiMingCheng;

    private Double mianJiNum;

    private Double beiyong1;

    private Double beiyong2;

    private String beiyong3;

    private Date time;

    public Integer getMianJiId() {
        return mianJiId;
    }

    public void setMianJiId(Integer mianJiId) {
        this.mianJiId = mianJiId;
    }

    public String getMianJiMingCheng() {
        return mianJiMingCheng;
    }

    public void setMianJiMingCheng(String mianJiMingCheng) {
        this.mianJiMingCheng = mianJiMingCheng == null ? null : mianJiMingCheng.trim();
    }

    public Double getMianJiNum() {
        return mianJiNum;
    }

    public void setMianJiNum(Double mianJiNum) {
        this.mianJiNum = mianJiNum;
    }

    public Double getBeiyong1() {
        return beiyong1;
    }

    public void setBeiyong1(Double beiyong1) {
        this.beiyong1 = beiyong1;
    }

    public Double getBeiyong2() {
        return beiyong2;
    }

    public void setBeiyong2(Double beiyong2) {
        this.beiyong2 = beiyong2;
    }

    public String getBeiyong3() {
        return beiyong3;
    }

    public void setBeiyong3(String beiyong3) {
        this.beiyong3 = beiyong3 == null ? null : beiyong3.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}