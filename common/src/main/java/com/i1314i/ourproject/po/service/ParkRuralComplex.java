package com.i1314i.ourproject.po.service;

public class ParkRuralComplex {
    private Integer parkRuralComplexId;

    private String name;

    private String adress;

    private String district;

    private String area;

    private String tel;

    private String contact;

    private String investor;

    private String investment;

    private String comment;

    private Integer parkSpatialLayout;

    private Integer parkIntroductionId;

    public Integer getParkRuralComplexId() {
        return parkRuralComplexId;
    }

    public void setParkRuralComplexId(Integer parkRuralComplexId) {
        this.parkRuralComplexId = parkRuralComplexId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress == null ? null : adress.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getInvestor() {
        return investor;
    }

    public void setInvestor(String investor) {
        this.investor = investor == null ? null : investor.trim();
    }

    public String getInvestment() {
        return investment;
    }

    public void setInvestment(String investment) {
        this.investment = investment == null ? null : investment.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Integer getParkSpatialLayout() {
        return parkSpatialLayout;
    }

    public void setParkSpatialLayout(Integer parkSpatialLayout) {
        this.parkSpatialLayout = parkSpatialLayout;
    }

    public Integer getParkIntroductionId() {
        return parkIntroductionId;
    }

    public void setParkIntroductionId(Integer parkIntroductionId) {
        this.parkIntroductionId = parkIntroductionId;
    }
}