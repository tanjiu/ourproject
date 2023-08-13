package com.i1314i.ourproject.po.ditu;

/**
 * @author 平行时空
 * @created 2018-11-28 17:03
 **/
public class DiTiItem {
    private String id;
    private String strguide;
    private String streetName;
    private String signage;
    private String nextStreetName;
    private String tollStatus;
    private String turnlatlon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSignage() {
        return signage;
    }

    public void setSignage(String signage) {
        this.signage = signage;
    }

    public String getStrguide() {
        return strguide;
    }

    public void setStrguide(String strguide) {
        this.strguide = strguide;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getNextStreetName() {
        return nextStreetName;
    }

    public void setNextStreetName(String nextStreetName) {
        this.nextStreetName = nextStreetName;
    }

    public String getTollStatus() {
        return tollStatus;
    }

    public void setTollStatus(String tollStatus) {
        this.tollStatus = tollStatus;
    }

    public String getTurnlatlon() {
        return turnlatlon;
    }

    public void setTurnlatlon(String turnlatlon) {
        this.turnlatlon = turnlatlon;
    }
}
