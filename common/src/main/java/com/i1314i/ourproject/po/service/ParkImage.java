package com.i1314i.ourproject.po.service;

public class ParkImage {
    private Integer parkImageId;

    private String url;

    private String ownerId;

    private String comment;

    public Integer getParkImageId() {
        return parkImageId;
    }

    public void setParkImageId(Integer parkImageId) {
        this.parkImageId = parkImageId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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
}