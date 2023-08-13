package com.i1314i.ourproject.po.javabean;

public class HuiNongChanPinZhongLei {
    private Integer chanPinZhongLeiId;

    private String chanPinMingCheng;

    private String leiBie;

    private String beiyong1;

    private String beiyong2;

    private String beiyong3;

    public Integer getChanPinZhongLeiId() {
        return chanPinZhongLeiId;
    }

    public void setChanPinZhongLeiId(Integer chanPinZhongLeiId) {
        this.chanPinZhongLeiId = chanPinZhongLeiId;
    }

    public String getChanPinMingCheng() {
        return chanPinMingCheng;
    }

    public void setChanPinMingCheng(String chanPinMingCheng) {
        this.chanPinMingCheng = chanPinMingCheng == null ? null : chanPinMingCheng.trim();
    }

    public String getLeiBie() {
        return leiBie;
    }

    public void setLeiBie(String leiBie) {
        this.leiBie = leiBie == null ? null : leiBie.trim();
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

    public String getBeiyong3() {
        return beiyong3;
    }

    public void setBeiyong3(String beiyong3) {
        this.beiyong3 = beiyong3 == null ? null : beiyong3.trim();
    }
}