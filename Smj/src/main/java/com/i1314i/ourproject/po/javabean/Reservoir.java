package com.i1314i.ourproject.po.javabean;

public class Reservoir {
    private Integer shuikuId;

    private String name;

    private String address;

    private Double allCapacity;

    private Double xingliWaterLevel;

    private Double waterStorage;

    private Double xunxianWaterLevel;

    private Double nowWaterLevel;

    private Double nowStorage;

    private Double x;

    private Double y;

    public Integer getShuikuId() {
        return shuikuId;
    }

    public void setShuikuId(Integer shuikuId) {
        this.shuikuId = shuikuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Double getAllCapacity() {
        return allCapacity;
    }

    public void setAllCapacity(Double allCapacity) {
        this.allCapacity = allCapacity;
    }

    public Double getXingliWaterLevel() {
        return xingliWaterLevel;
    }

    public void setXingliWaterLevel(Double xingliWaterLevel) {
        this.xingliWaterLevel = xingliWaterLevel;
    }

    public Double getWaterStorage() {
        return waterStorage;
    }

    public void setWaterStorage(Double waterStorage) {
        this.waterStorage = waterStorage;
    }

    public Double getXunxianWaterLevel() {
        return xunxianWaterLevel;
    }

    public void setXunxianWaterLevel(Double xunxianWaterLevel) {
        this.xunxianWaterLevel = xunxianWaterLevel;
    }

    public Double getNowWaterLevel() {
        return nowWaterLevel;
    }

    public void setNowWaterLevel(Double nowWaterLevel) {
        this.nowWaterLevel = nowWaterLevel;
    }

    public Double getNowStorage() {
        return nowStorage;
    }

    public void setNowStorage(Double nowStorage) {
        this.nowStorage = nowStorage;
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