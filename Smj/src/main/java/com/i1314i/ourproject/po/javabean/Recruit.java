package com.i1314i.ourproject.po.javabean;

import java.util.Date;

public class Recruit {
    private String zhaogongId;

    private String name;

    private String address;

    private String station;

    private String demand;

    private String telphone;

    private String type;

    private Date fabutiem;

    public String getZhaogongId() {
        return zhaogongId;
    }

    public void setZhaogongId(String zhaogongId) {
        this.zhaogongId = zhaogongId == null ? null : zhaogongId.trim();
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

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station == null ? null : station.trim();
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getFabutiem() {
        return fabutiem;
    }

    public void setFabutiem(Date fabutiem) {
        this.fabutiem = fabutiem;
    }
}