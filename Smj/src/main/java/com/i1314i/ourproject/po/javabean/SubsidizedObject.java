package com.i1314i.ourproject.po.javabean;

import java.util.Date;

public class SubsidizedObject {
    private Integer butieId;

    private String butieMingcheng;

    private String shenqing;

    private String fafangBumen;

    private String fafangXingshi;

    private Date fafangShijian;

    public Integer getButieId() {
        return butieId;
    }

    public void setButieId(Integer butieId) {
        this.butieId = butieId;
    }

    public String getButieMingcheng() {
        return butieMingcheng;
    }

    public void setButieMingcheng(String butieMingcheng) {
        this.butieMingcheng = butieMingcheng == null ? null : butieMingcheng.trim();
    }

    public String getShenqing() {
        return shenqing;
    }

    public void setShenqing(String shenqing) {
        this.shenqing = shenqing == null ? null : shenqing.trim();
    }

    public String getFafangBumen() {
        return fafangBumen;
    }

    public void setFafangBumen(String fafangBumen) {
        this.fafangBumen = fafangBumen == null ? null : fafangBumen.trim();
    }

    public String getFafangXingshi() {
        return fafangXingshi;
    }

    public void setFafangXingshi(String fafangXingshi) {
        this.fafangXingshi = fafangXingshi == null ? null : fafangXingshi.trim();
    }

    public Date getFafangShijian() {
        return fafangShijian;
    }

    public void setFafangShijian(Date fafangShijian) {
        this.fafangShijian = fafangShijian;
    }
}