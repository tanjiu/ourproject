package com.i1314i.ourproject.po.service;

public class ParkSpatialLayout {
    private Integer parkSpatialLayoutId;

    private String name;

    private String category;

    private String comments;

    public Integer getParkSpatialLayoutId() {
        return parkSpatialLayoutId;
    }

    public void setParkSpatialLayoutId(Integer parkSpatialLayoutId) {
        this.parkSpatialLayoutId = parkSpatialLayoutId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }
}