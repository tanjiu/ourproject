package com.i1314i.ourproject.po.service;

public class ParkEnterprise {
    private Integer parkEnterpriseId;

    private String name;

    private String address;

    private String contact;

    private String industrialType;

    private String product;

    private String isLeading;

    private String x;

    private String y;

    private String comments;

    private Integer parkIntroductionId;

    private Integer parkImageId;

    public Integer getParkEnterpriseId() {
        return parkEnterpriseId;
    }

    public void setParkEnterpriseId(Integer parkEnterpriseId) {
        this.parkEnterpriseId = parkEnterpriseId;
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getIndustrialType() {
        return industrialType;
    }

    public void setIndustrialType(String industrialType) {
        this.industrialType = industrialType == null ? null : industrialType.trim();
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product == null ? null : product.trim();
    }

    public String getIsLeading() {
        return isLeading;
    }

    public void setIsLeading(String isLeading) {
        this.isLeading = isLeading == null ? null : isLeading.trim();
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

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    public Integer getParkIntroductionId() {
        return parkIntroductionId;
    }

    public void setParkIntroductionId(Integer parkIntroductionId) {
        this.parkIntroductionId = parkIntroductionId;
    }

    public Integer getParkImageId() {
        return parkImageId;
    }

    public void setParkImageId(Integer parkImageId) {
        this.parkImageId = parkImageId;
    }
}