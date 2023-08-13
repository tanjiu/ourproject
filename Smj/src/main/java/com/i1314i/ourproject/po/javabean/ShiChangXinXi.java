package com.i1314i.ourproject.po.javabean;

public class ShiChangXinXi {
    private Integer zuoWuId;

    private String zuoWuMingCheng;

    private Double zhongZhiMianJi;

    private Double beiyong1;

    private Double beiyong2;

    private String beiyong3;

    private String danwei;

    public Integer getZuoWuId() {
        return zuoWuId;
    }

    public void setZuoWuId(Integer zuoWuId) {
        this.zuoWuId = zuoWuId;
    }

    public String getZuoWuMingCheng() {
        return zuoWuMingCheng;
    }

    public void setZuoWuMingCheng(String zuoWuMingCheng) {
        this.zuoWuMingCheng = zuoWuMingCheng == null ? null : zuoWuMingCheng.trim();
    }

    public Double getZhongZhiMianJi() {
        return zhongZhiMianJi;
    }

    public void setZhongZhiMianJi(Double zhongZhiMianJi) {
        this.zhongZhiMianJi = zhongZhiMianJi;
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

    public String getDanwei() {
        return danwei;
    }

    public void setDanwei(String danwei) {
        this.danwei = danwei == null ? null : danwei.trim();
    }
}