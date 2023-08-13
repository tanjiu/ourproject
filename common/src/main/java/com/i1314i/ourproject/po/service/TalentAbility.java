package com.i1314i.ourproject.po.service;

public class TalentAbility {
    private Integer talentAbilityId;

    private String talentName;

    private Integer talentTypeId;

    private String sex;

    private Integer age;

    private String selectedYear;

    private String workUnit;

    private String requestCompany;

    private String companyAdress;

    private Double x;

    private Double y;

    private Integer imageId;

    private Integer affirsInformationId;

    private String reserve1;

    private String reserve2;

    public Integer getTalentAbilityId() {
        return talentAbilityId;
    }

    public void setTalentAbilityId(Integer talentAbilityId) {
        this.talentAbilityId = talentAbilityId;
    }

    public String getTalentName() {
        return talentName;
    }

    public void setTalentName(String talentName) {
        this.talentName = talentName == null ? null : talentName.trim();
    }

    public Integer getTalentTypeId() {
        return talentTypeId;
    }

    public void setTalentTypeId(Integer talentTypeId) {
        this.talentTypeId = talentTypeId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSelectedYear() {
        return selectedYear;
    }

    public void setSelectedYear(String selectedYear) {
        this.selectedYear = selectedYear == null ? null : selectedYear.trim();
    }

    public String getWorkUnit() {
        return workUnit;
    }

    public void setWorkUnit(String workUnit) {
        this.workUnit = workUnit == null ? null : workUnit.trim();
    }

    public String getRequestCompany() {
        return requestCompany;
    }

    public void setRequestCompany(String requestCompany) {
        this.requestCompany = requestCompany == null ? null : requestCompany.trim();
    }

    public String getCompanyAdress() {
        return companyAdress;
    }

    public void setCompanyAdress(String companyAdress) {
        this.companyAdress = companyAdress == null ? null : companyAdress.trim();
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public Integer getAffirsInformationId() {
        return affirsInformationId;
    }

    public void setAffirsInformationId(Integer affirsInformationId) {
        this.affirsInformationId = affirsInformationId;
    }

    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1 == null ? null : reserve1.trim();
    }

    public String getReserve2() {
        return reserve2;
    }

    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2 == null ? null : reserve2.trim();
    }
}