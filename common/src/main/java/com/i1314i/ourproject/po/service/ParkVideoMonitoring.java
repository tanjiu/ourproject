package com.i1314i.ourproject.po.service;

public class ParkVideoMonitoring {
    private Integer parkVideoMonitoringId;

    private String url;

    private String address;

    private String x;

    private String y;

    private String ownerId;

    private String comment;

    private Integer parkRuralComplexId;

    public Integer getParkVideoMonitoringId() {
        return parkVideoMonitoringId;
    }

    public void setParkVideoMonitoringId(Integer parkVideoMonitoringId) {
        this.parkVideoMonitoringId = parkVideoMonitoringId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x == null ? null : x.trim();
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y == null ? null : y.trim();
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId == null ? null : ownerId.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Integer getParkRuralComplexId() {
        return parkRuralComplexId;
    }

    public void setParkRuralComplexId(Integer parkRuralComplexId) {
        this.parkRuralComplexId = parkRuralComplexId;
    }
}