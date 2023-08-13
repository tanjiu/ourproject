package com.i1314i.ourproject.po.javabean;

import java.util.Date;

public class LhmmZhiBiao {
    private Integer zhiBiaoFangId;

    private String zhiBiaoDanWei;

    private Date shijian;

    private String beiyong1;

    private String beiyong2;

    public Integer getZhiBiaoFangId() {
        return zhiBiaoFangId;
    }

    public void setZhiBiaoFangId(Integer zhiBiaoFangId) {
        this.zhiBiaoFangId = zhiBiaoFangId;
    }

    public String getZhiBiaoDanWei() {
        return zhiBiaoDanWei;
    }

    public void setZhiBiaoDanWei(String zhiBiaoDanWei) {
        this.zhiBiaoDanWei = zhiBiaoDanWei == null ? null : zhiBiaoDanWei.trim();
    }

    public Date getShijian() {
        return shijian;
    }

    public void setShijian(Date shijian) {
        this.shijian = shijian;
    }

    public String getBeiyong1() {
        return beiyong1;
    }

    public void setBeiyong1(String beiyong1) {
        this.beiyong1 = beiyong1 == null ? null : beiyong1.trim();
    }

    public String getBeiyong2() {
        return beiyong2;
    }

    public void setBeiyong2(String beiyong2) {
        this.beiyong2 = beiyong2 == null ? null : beiyong2.trim();
    }
}