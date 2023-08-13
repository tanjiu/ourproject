package com.i1314i.ourproject.po.javabean;

public class PlantingStructure {
    private Integer jiegouId;

    private String name;

    private String category;

    private String area;

    private String address;

    public Integer getJiegouId() {
        return jiegouId;
    }

    public void setJiegouId(Integer jiegouId) {
        this.jiegouId = jiegouId;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}