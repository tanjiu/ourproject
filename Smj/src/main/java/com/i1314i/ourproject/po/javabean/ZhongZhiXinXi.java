package com.i1314i.ourproject.po.javabean;

import java.util.Date;

public class ZhongZhiXinXi {
    private Integer jieDaoId;

    private String jieDaoMingCheng;

    private Double boZhongMianJi;

    private Double danChan;

    private Date shijian;

    private Double beiyong1;

    private Double beiyong2;

    private String beiyong3;

    private String beiyong4;

    public Integer getJieDaoId() {
        return jieDaoId;
    }

    public void setJieDaoId(Integer jieDaoId) {
        this.jieDaoId = jieDaoId;
    }

    public String getJieDaoMingCheng() {
        return jieDaoMingCheng;
    }

    public void setJieDaoMingCheng(String jieDaoMingCheng) {
        this.jieDaoMingCheng = jieDaoMingCheng == null ? null : jieDaoMingCheng.trim();
    }

    public Double getBoZhongMianJi() {
        return boZhongMianJi;
    }

    public void setBoZhongMianJi(Double boZhongMianJi) {
        this.boZhongMianJi = boZhongMianJi;
    }

    public Double getDanChan() {
        return danChan;
    }

    public void setDanChan(Double danChan) {
        this.danChan = danChan;
    }

    public Date getShijian() {
        return shijian;
    }

    public void setShijian(Date shijian) {
        this.shijian = shijian;
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

    public String getBeiyong4() {
        return beiyong4;
    }

    public void setBeiyong4(String beiyong4) {
        this.beiyong4 = beiyong4 == null ? null : beiyong4.trim();
    }
}