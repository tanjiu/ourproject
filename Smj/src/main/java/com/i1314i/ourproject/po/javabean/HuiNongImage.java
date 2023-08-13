package com.i1314i.ourproject.po.javabean;

import com.i1314i.ourproject.utils.common.TemplateUtils;

public class HuiNongImage {
    private Integer imageId;

    private String shuming;

    private String imageUrl;

    private String imageUrls;

    private String beiyong1;

    private String beiyong2;

    public void setImageUrls(String imageUrls) {
        this.imageUrls = imageUrls;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public String getShuming() {
        return shuming;
    }

    public void setShuming(String shuming) {
        this.shuming = shuming == null ? null : shuming.trim();
    }

    public String getImageUrl() {
        String path1= imageUrl;
        return path1;
    }


    public String getImageUrls() {
        String path1= TemplateUtils.getPropertiesdata("other.properties","ckeditor.image.service.baseurl")+imageUrl;
        return path1;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    public String getBeiyong1() {
        return beiyong1;
    }

    public void setBeiyong1(String beiyong1) {
        this.beiyong1 = beiyong1 == null ? null : beiyong1.trim();
    }

    public String getBeiyong2() {
        return beiyong2;
    }

    public void setBeiyong2(String beiyong2) {
        this.beiyong2 = beiyong2 == null ? null : beiyong2.trim();
    }
}