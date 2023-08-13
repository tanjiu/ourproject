package com.i1314i.ourproject.po.javabean;

import java.util.Date;

public class Hudong {
    private Integer hudongId;

    private Date time;

    private String content;

    private Integer shichang;

    public Integer getHudongId() {
        return hudongId;
    }

    public void setHudongId(Integer hudongId) {
        this.hudongId = hudongId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getShichang() {
        return shichang;
    }

    public void setShichang(Integer shichang) {
        this.shichang = shichang;
    }
}