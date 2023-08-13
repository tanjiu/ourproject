package com.i1314i.ourproject.po.service;

public class ParkIndustryChain {
    private Integer parkIndustryChainId;

    private String supplierId;

    private String demanderId;

    private String product;

    private String productAmount;

    private String productUnit;

    private String productValue;

    private String comment;

    private Integer parkEnterpriseId;

    public Integer getParkIndustryChainId() {
        return parkIndustryChainId;
    }

    public void setParkIndustryChainId(Integer parkIndustryChainId) {
        this.parkIndustryChainId = parkIndustryChainId;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId == null ? null : supplierId.trim();
    }

    public String getDemanderId() {
        return demanderId;
    }

    public void setDemanderId(String demanderId) {
        this.demanderId = demanderId == null ? null : demanderId.trim();
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product == null ? null : product.trim();
    }

    public String getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(String productAmount) {
        this.productAmount = productAmount == null ? null : productAmount.trim();
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit == null ? null : productUnit.trim();
    }

    public String getProductValue() {
        return productValue;
    }

    public void setProductValue(String productValue) {
        this.productValue = productValue == null ? null : productValue.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Integer getParkEnterpriseId() {
        return parkEnterpriseId;
    }

    public void setParkEnterpriseId(Integer parkEnterpriseId) {
        this.parkEnterpriseId = parkEnterpriseId;
    }
}