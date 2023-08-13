package com.i1314i.ourproject.po.javabean;

public class ProductPrice {
    private Integer jiageId;

    private String name;

    private String category;

    private String monavalent;

    private String unit;

    private String market;

    public Integer getJiageId() {
        return jiageId;
    }

    public void setJiageId(Integer jiageId) {
        this.jiageId = jiageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getMonavalent() {
        return monavalent;
    }

    public void setMonavalent(String monavalent) {
        this.monavalent = monavalent == null ? null : monavalent.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market == null ? null : market.trim();
    }
}