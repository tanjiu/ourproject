package com.i1314i.ourproject.po.service;

import java.util.Date;

public class ParkIntroduction {
    private Integer parkIntroductionId;

    private String title;

    private String publisher;

    private Date time;

    private String content;

    private String owerId;

    private String comment;

    private Integer parkImageId;

    public Integer getParkIntroductionId() {
        return parkIntroductionId;
    }

    public void setParkIntroductionId(Integer parkIntroductionId) {
        this.parkIntroductionId = parkIntroductionId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
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

    public String getOwerId() {
        return owerId;
    }

    public void setOwerId(String owerId) {
        this.owerId = owerId == null ? null : owerId.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Integer getParkImageId() {
        return parkImageId;
    }

    public void setParkImageId(Integer parkImageId) {
        this.parkImageId = parkImageId;
    }
}