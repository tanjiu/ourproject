package com.i1314i.ourproject.po.javabean;

public class JobWanted {
    private Integer qiuzhiId;

    private String name;

    private String station;

    private String speciality;

    private String demand;

    private String telphone;

    public Integer getQiuzhiId() {
        return qiuzhiId;
    }

    public void setQiuzhiId(Integer qiuzhiId) {
        this.qiuzhiId = qiuzhiId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station == null ? null : station.trim();
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality == null ? null : speciality.trim();
    }

    public String getDemand() {
        return demand;
    }

    public void setDemand(String demand) {
        this.demand = demand == null ? null : demand.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }
}