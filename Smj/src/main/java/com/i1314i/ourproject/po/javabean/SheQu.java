package com.i1314i.ourproject.po.javabean;

public class SheQu {
    private Integer sheQuId;

    private String sheQuMingCheng;

    private Integer jieDaoId;

    private String beiyong1;

    private String beiyong2;

    //额外增加
    private String jieDaoMingCheng;

    public String getJieDaoMingCheng() {
        return jieDaoMingCheng;
    }

    public void setJieDaoMingCheng(String jieDaoMingCheng) {
        this.jieDaoMingCheng = jieDaoMingCheng;
    }

    public Integer getSheQuId() {
        return sheQuId;
    }

    public void setSheQuId(Integer sheQuId) {
        this.sheQuId = sheQuId;
    }

    public String getSheQuMingCheng() {
        return sheQuMingCheng;
    }

    public void setSheQuMingCheng(String sheQuMingCheng) {
        this.sheQuMingCheng = sheQuMingCheng == null ? null : sheQuMingCheng.trim();
    }

    public Integer getJieDaoId() {
        return jieDaoId;
    }

    public void setJieDaoId(Integer jieDaoId) {
        this.jieDaoId = jieDaoId;
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