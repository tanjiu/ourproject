package com.i1314i.ourproject.po.service;

public class TrainingInformation {
    private Integer trainigId;

    private String name;

    private String time;

    private String adress;

    private String introduction;

    private Integer talentId;

    private Integer talentAbility;

    private String reserve1;

    private String reserve2;

    public Integer getTrainigId() {
        return trainigId;
    }

    public void setTrainigId(Integer trainigId) {
        this.trainigId = trainigId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress == null ? null : adress.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public Integer getTalentId() {
        return talentId;
    }

    public void setTalentId(Integer talentId) {
        this.talentId = talentId;
    }

    public Integer getTalentAbility() {
        return talentAbility;
    }

    public void setTalentAbility(Integer talentAbility) {
        this.talentAbility = talentAbility;
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