package com.i1314i.ourproject.po.service;

public class TalentType {
    private Integer talentTypeId;

    private String talentTypeName;

    private String reserve1;

    private String reserve2;

    public Integer getTalentTypeId() {
        return talentTypeId;
    }

    public void setTalentTypeId(Integer talentTypeId) {
        this.talentTypeId = talentTypeId;
    }

    public String getTalentTypeName() {
        return talentTypeName;
    }

    public void setTalentTypeName(String talentTypeName) {
        this.talentTypeName = talentTypeName == null ? null : talentTypeName.trim();
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