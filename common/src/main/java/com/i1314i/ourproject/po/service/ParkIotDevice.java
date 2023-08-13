package com.i1314i.ourproject.po.service;

public class ParkIotDevice {
    private Integer parkIotDeviceId;

    private String parameter;

    private String value;

    private String category;

    private String x;

    private String y;

    private String ownerId;

    private String comment;

    private Integer parkRuralComplexId;

    public Integer getParkIotDeviceId() {
        return parkIotDeviceId;
    }

    public void setParkIotDeviceId(Integer parkIotDeviceId) {
        this.parkIotDeviceId = parkIotDeviceId;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter == null ? null : parameter.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
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