package com.i1314i.ourproject.po.javabean;

public class SoilTypeDistribution {
    private String leixingId;

    private String type;

    private String region;

    public String getLeixingId() {
        return leixingId;
    }

    public void setLeixingId(String leixingId) {
        this.leixingId = leixingId == null ? null : leixingId.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }
}