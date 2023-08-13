package com.i1314i.ourproject.po.javabean;

import java.util.Date;

public class ShuiLiSheShi {
    private Integer shuiLiId;

    private String shuiLiMingCheng;

    private Integer shuiLiNum;

    private Integer beiyong1;

    private Double beiyong2;

    private String beiyong3;

    private Date time;

    public Integer getShuiLiId() {
        return shuiLiId;
    }

    public void setShuiLiId(Integer shuiLiId) {
        this.shuiLiId = shuiLiId;
    }

    public String getShuiLiMingCheng() {
        return shuiLiMingCheng;
    }

    public void setShuiLiMingCheng(String shuiLiMingCheng) {
        this.shuiLiMingCheng = shuiLiMingCheng == null ? null : shuiLiMingCheng.trim();
    }

    public Integer getShuiLiNum() {
        return shuiLiNum;
    }

    public void setShuiLiNum(Integer shuiLiNum) {
        this.shuiLiNum = shuiLiNum;
    }

    public Integer getBeiyong1() {
        return beiyong1;
    }

    public void setBeiyong1(Integer beiyong1) {
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