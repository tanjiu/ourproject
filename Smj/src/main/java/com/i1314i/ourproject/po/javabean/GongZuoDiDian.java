package com.i1314i.ourproject.po.javabean;

public class GongZuoDiDian {
    private Integer gongzuoId;

    private String shi;

    private String jieZhen;

    private String shequ;

    private String beiyong1;

    private String beiyong2;

    public Integer getGongzuoId() {
        return gongzuoId;
    }

    public void setGongzuoId(Integer gongzuoId) {
        this.gongzuoId = gongzuoId;
    }

    public String getShi() {
        return shi;
    }

    public void setShi(String shi) {
        this.shi = shi == null ? null : shi.trim();
    }

    public String getJieZhen() {
        return jieZhen;
    }

    public void setJieZhen(String jieZhen) {
        this.jieZhen = jieZhen == null ? null : jieZhen.trim();
    }

    public String getShequ() {
        return shequ;
    }

    public void setShequ(String shequ) {
        this.shequ = shequ == null ? null : shequ.trim();
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