package com.i1314i.ourproject.po.service;

public class RequiredDocument {
    private Integer requiredDocumentId;

    private String requiredDocumentName;

    private String description;

    private String tableDownload;

    private String reserve1;

    private String reserve2;

    public Integer getRequiredDocumentId() {
        return requiredDocumentId;
    }

    public void setRequiredDocumentId(Integer requiredDocumentId) {
        this.requiredDocumentId = requiredDocumentId;
    }

    public String getRequiredDocumentName() {
        return requiredDocumentName;
    }

    public void setRequiredDocumentName(String requiredDocumentName) {
        this.requiredDocumentName = requiredDocumentName == null ? null : requiredDocumentName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getTableDownload() {
        return tableDownload;
    }

    public void setTableDownload(String tableDownload) {
        this.tableDownload = tableDownload == null ? null : tableDownload.trim();
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