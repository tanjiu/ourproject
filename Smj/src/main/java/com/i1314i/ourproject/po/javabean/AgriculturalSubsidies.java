package com.i1314i.ourproject.po.javabean;

import java.util.Date;

public class AgriculturalSubsidies {
    private Integer butieId;

    private String name;

    private String content;

    private String fangfangdanwei;

    private Date fafangtime;

    private String shouYiQunTi;

    private String fafangXingshi;

    private Double money;

    private Date fabuShijian;

    private Integer bumen;

    public Integer getButieId() {
        return butieId;
    }

    public void setButieId(Integer butieId) {
        this.butieId = butieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getFangfangdanwei() {
        return fangfangdanwei;
    }

    public void setFangfangdanwei(String fangfangdanwei) {
        this.fangfangdanwei = fangfangdanwei == null ? null : fangfangdanwei.trim();
    }

    public Date getFafangtime() {
        return fafangtime;
    }

    public void setFafangtime(Date fafangtime) {
        this.fafangtime = fafangtime;
    }

    public String getShouYiQunTi() {
        return shouYiQunTi;
    }

    public void setShouYiQunTi(String shouYiQunTi) {
        this.shouYiQunTi = shouYiQunTi == null ? null : shouYiQunTi.trim();
    }

    public String getFafangXingshi() {
        return fafangXingshi;
    }

    public void setFafangXingshi(String fafangXingshi) {
        this.fafangXingshi = fafangXingshi == null ? null : fafangXingshi.trim();
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Date getFabuShijian() {
        return fabuShijian;
    }

    public void setFabuShijian(Date fabuShijian) {
        this.fabuShijian = fabuShijian;
    }

    public Integer getBumen() {
        return bumen;
    }

    public void setBumen(Integer bumen) {
        this.bumen = bumen;
    }
}