package com.i1314i.ourproject.po.javabean;

import java.util.Date;

public class NongYeShengChanZiLiao {
    private Integer shangPinId;

    private String shangpinMingcheng;

    private String leibie;

    private String guiGeDengJi;

    private String jiLiangDanWei;

    private Double price;

    private String caiBaoJiaDanWei;

    private String zhiBiaoJieShi;

    private String beizhu;

    private Date shijian;

    private Integer bumen;

    public Integer getShangPinId() {
        return shangPinId;
    }

    public void setShangPinId(Integer shangPinId) {
        this.shangPinId = shangPinId;
    }

    public String getShangpinMingcheng() {
        return shangpinMingcheng;
    }

    public void setShangpinMingcheng(String shangpinMingcheng) {
        this.shangpinMingcheng = shangpinMingcheng == null ? null : shangpinMingcheng.trim();
    }

    public String getLeibie() {
        return leibie;
    }

    public void setLeibie(String leibie) {
        this.leibie = leibie == null ? null : leibie.trim();
    }

    public String getGuiGeDengJi() {
        return guiGeDengJi;
    }

    public void setGuiGeDengJi(String guiGeDengJi) {
        this.guiGeDengJi = guiGeDengJi == null ? null : guiGeDengJi.trim();
    }

    public String getJiLiangDanWei() {
        return jiLiangDanWei;
    }

    public void setJiLiangDanWei(String jiLiangDanWei) {
        this.jiLiangDanWei = jiLiangDanWei == null ? null : jiLiangDanWei.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCaiBaoJiaDanWei() {
        return caiBaoJiaDanWei;
    }

    public void setCaiBaoJiaDanWei(String caiBaoJiaDanWei) {
        this.caiBaoJiaDanWei = caiBaoJiaDanWei == null ? null : caiBaoJiaDanWei.trim();
    }

    public String getZhiBiaoJieShi() {
        return zhiBiaoJieShi;
    }

    public void setZhiBiaoJieShi(String zhiBiaoJieShi) {
        this.zhiBiaoJieShi = zhiBiaoJieShi == null ? null : zhiBiaoJieShi.trim();
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

    public Integer getBumen() {
        return bumen;
    }

    public void setBumen(Integer bumen) {
        this.bumen = bumen;
    }
}