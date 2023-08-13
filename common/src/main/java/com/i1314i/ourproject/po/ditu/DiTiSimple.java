package com.i1314i.ourproject.po.ditu;

/**
 * @author 平行时空
 * @created 2018-11-28 17:06
 **/
public class DiTiSimple {
    private String id;
    private String strguide;
    private String streetNames;
    private String linkStreetName;
    private String tollStatus;
    private String turnlatlon;
    private String streetLatLon;
    private String segmentNumber;
    private  String lastStreetName;
    private String streetDistance;
    private String signage;

    public String getSignage() {
        return signage;
    }

    public String getStreetDistance() {
        return streetDistance;
    }

    public void setStreetDistance(String streetDistance) {
        this.streetDistance = streetDistance;
    }

    public void setSignage(String signage) {
        this.signage = signage;
    }

    public String getLastStreetName() {
        return lastStreetName;
    }

    public void setLastStreetName(String lastStreetName) {
        this.lastStreetName = lastStreetName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTollStatus(String tollStatus) {
        this.tollStatus = tollStatus;
    }

    public String getStrguide() {
        return strguide;
    }

    public void setStrguide(String strguide) {
        this.strguide = strguide;
    }

    public String getStreetNames() {
        return streetNames;
    }

    public String getTollStatus() {
        return tollStatus;
    }

    public void setStreetNames(String streetNames) {
        this.streetNames = streetNames;
    }

    public String getLinkStreetName() {
        return linkStreetName;
    }

    public void setLinkStreetName(String linkStreetName) {
        this.linkStreetName = linkStreetName;
    }


    public String getTurnlatlon() {
        return turnlatlon;
    }

    public void setTurnlatlon(String turnlatlon) {
        this.turnlatlon = turnlatlon;
    }

    public String getStreetLatLon() {
        return streetLatLon;
    }

    public void setStreetLatLon(String streetLatLon) {
        this.streetLatLon = streetLatLon;
    }

    public String getSegmentNumber() {
        return segmentNumber;
    }

    public void setSegmentNumber(String segmentNumber) {
        this.segmentNumber = segmentNumber;
    }
}
