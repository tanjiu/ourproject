package com.i1314i.ourproject.po.ditu;

/**
 * @author 平行时空
 * @created 2018-11-28 16:07
 **/
public class DiRequest {
    private String orig;
    private String dest;
    private Integer style;
    private String mid;

    public String getOrig() {
        return orig;
    }

    public void setOrig(String orig) {
        this.orig = orig;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public Integer getStyle() {
        return style;
    }

    public void setStyle(Integer style) {
        this.style = style;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    @Override
    public String toString() {
        return "DiRequest{" +
                "orig='" + orig + '\'' +
                ", dest='" + dest + '\'' +
                ", style=" + style +
                ", mid='" + mid + '\'' +
                '}';
    }
}
