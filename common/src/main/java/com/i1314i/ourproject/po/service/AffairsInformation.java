package com.i1314i.ourproject.po.service;

public class AffairsInformation {
    private Integer affairsId;

    private String affirsName;

    private String tarnsactAgency;

    private String timeLimit;

    private Integer applicationFormId;

    private Integer requiredDocumentId;

    private String reserve1;

    private String reserve2;

    public Integer getAffairsId() {
        return affairsId;
    }

    public void setAffairsId(Integer affairsId) {
        this.affairsId = affairsId;
    }

    public String getAffirsName() {
        return affirsName;
    }

    public void setAffirsName(String affirsName) {
        this.affirsName = affirsName == null ? null : affirsName.trim();
    }

    public String getTarnsactAgency() {
        return tarnsactAgency;
    }

    public void setTarnsactAgency(String tarnsactAgency) {
        this.tarnsactAgency = tarnsactAgency == null ? null : tarnsactAgency.trim();
    }

    public String getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(String timeLimit) {
        this.timeLimit = timeLimit == null ? null : timeLimit.trim();
    }

    public Integer getApplicationFormId() {
        return applicationFormId;
    }

    public void setApplicationFormId(Integer applicationFormId) {
        this.applicationFormId = applicationFormId;
    }

    public Integer getRequiredDocumentId() {
        return requiredDocumentId;
    }

    public void setRequiredDocumentId(Integer requiredDocumentId) {
        this.requiredDocumentId = requiredDocumentId;
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