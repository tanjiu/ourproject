package com.i1314i.ourproject.po.javabean;

import java.util.Date;

public class LvHuaMiaoMu {
    private Integer miaoMuId;

    private String mingcheng;

    private String guiGe;

    private Double danJia;

    private String beizhu;

    private Date shijian;

    private Integer imageId;

    private String zhiBiaoFang;

    private Integer bumen;

    //图片路径
    private String imageUrl;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getMiaoMuId() {
        return miaoMuId;
    }

    public void setMiaoMuId(Integer miaoMuId) {
        this.miaoMuId = miaoMuId;
    }

    public String getMingcheng() {
        return mingcheng;
    }

    public void setMingcheng(String mingcheng) {
        this.mingcheng = mingcheng == null ? null : mingcheng.trim();
    }

    public String getGuiGe() {
        return guiGe;
    }

    public void setGuiGe(String guiGe) {
        this.guiGe = guiGe == null ? null : guiGe.trim();
    }

    public Double getDanJia() {
        return danJia;
    }

    public void setDanJia(Double danJia) {
        this.danJia = danJia;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }

    public Date getShijian() {
        return shijian;
    }

    public void setShijian(Date shijian) {
        this.shijian = shijian;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public String getZhiBiaoFang() {
        return zhiBiaoFang;
    }

    public void setZhiBiaoFang(String zhiBiaoFang) {
        this.zhiBiaoFang = zhiBiaoFang == null ? null : zhiBiaoFang.trim();
    }

    public Integer getBumen() {
        return bumen;
    }

    public void setBumen(Integer bumen) {
        this.bumen = bumen;
    }
}