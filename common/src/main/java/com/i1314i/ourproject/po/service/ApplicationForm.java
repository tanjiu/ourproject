package com.i1314i.ourproject.po.service;

public class ApplicationForm {
    private Integer applicationFormId;

    private String applicationFormName;

    private String illustration;

    private String tableDownload;

    private String exampleDownload;

    private String reserve1;

    private String reserve2;

    public Integer getApplicationFormId() {
        return applicationFormId;
    }

    public void setApplicationFormId(Integer applicationFormId) {
        this.applicationFormId = applicationFormId;
    }

    public String getApplicationFormName() {
        return applicationFormName;
    }

    public void setApplicationFormName(String applicationFormName) {
        this.applicationFormName = applicationFormName == null ? null : applicationFormName.trim();
    }

    public String getIllustration() {
        return illustration;
    }

    public void setIllustration(String illustration) {
        this.illustration = illustration == null ? null : illustration.trim();
    }

    public String getTableDownload() {
        return tableDownload;
    }

    public void setTableDownload(String tableDownload) {
        this.tableDownload = tableDownload == null ? null : tableDownload.trim();
    }

    public String getExampleDownload() {
        return exampleDownload;
    }

    public void setExampleDownload(String exampleDownload) {
        this.exampleDownload = exampleDownload == null ? null : exampleDownload.trim();
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