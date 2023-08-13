package com.i1314i.ourproject.po.javabean;

public class BasicaFarmland {
    private String nongtianId;

    private String type;

    private String name;

    private Double area;

    private String location;

    private String quanshuDanwei;

    private String quanshuXingzhi;

    private String zulinren;

    private String zhengshu;

    private String liuzhuanqingkuang;

    public String getNongtianId() {
        return nongtianId;
    }

    public void setNongtianId(String nongtianId) {
        this.nongtianId = nongtianId == null ? null : nongtianId.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getQuanshuDanwei() {
        return quanshuDanwei;
    }

    public void setQuanshuDanwei(String quanshuDanwei) {
        this.quanshuDanwei = quanshuDanwei == null ? null : quanshuDanwei.trim();
    }

    public String getQuanshuXingzhi() {
        return quanshuXingzhi;
    }

    public void setQuanshuXingzhi(String quanshuXingzhi) {
        this.quanshuXingzhi = quanshuXingzhi == null ? null : quanshuXingzhi.trim();
    }

    public String getZulinren() {
        return zulinren;
    }

    public void setZulinren(String zulinren) {
        this.zulinren = zulinren == null ? null : zulinren.trim();
    }

    public String getZhengshu() {
        return zhengshu;
    }

    public void setZhengshu(String zhengshu) {
        this.zhengshu = zhengshu == null ? null : zhengshu.trim();
    }

    public String getLiuzhuanqingkuang() {
        return liuzhuanqingkuang;
    }

    public void setLiuzhuanqingkuang(String liuzhuanqingkuang) {
        this.liuzhuanqingkuang = liuzhuanqingkuang == null ? null : liuzhuanqingkuang.trim();
    }
}