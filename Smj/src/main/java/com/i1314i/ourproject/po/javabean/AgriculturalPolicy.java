package com.i1314i.ourproject.po.javabean;

import java.util.Date;

public class AgriculturalPolicy {
    private Integer zhengceId;

    private String name;

    private String content;

    private String type;

    private Date fabushijian;

    private String fabudanwei;

    private Integer bumen;

    public Integer getZhengceId() {
        return zhengceId;
    }

    public void setZhengceId(Integer zhengceId) {
        this.zhengceId = zhengceId;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getFabushijian() {
        return fabushijian;
    }

    public void setFabushijian(Date fabushijian) {
        this.fabushijian = fabushijian;
    }

    public String getFabudanwei() {
        return fabudanwei;
    }

    public void setFabudanwei(String fabudanwei) {
        this.fabudanwei = fabudanwei == null ? null : fabudanwei.trim();
    }

    public Integer getBumen() {
        return bumen;
    }

    public void setBumen(Integer bumen) {
        this.bumen = bumen;
    }
}