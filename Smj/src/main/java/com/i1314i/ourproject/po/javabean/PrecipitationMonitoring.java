package com.i1314i.ourproject.po.javabean;

import java.util.Date;

public class PrecipitationMonitoring {
    private Integer jiangshuiId;

    private Date starttime;

    private Date endtime;

    private String unit;

    private String name;

    private Double number;

    private Double x;

    private Double y;

    public Integer getJiangshuiId() {
        return jiangshuiId;
    }

    public void setJiangshuiId(Integer jiangshuiId) {
        this.jiangshuiId = jiangshuiId;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }
}