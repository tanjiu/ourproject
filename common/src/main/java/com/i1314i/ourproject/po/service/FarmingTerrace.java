package com.i1314i.ourproject.po.service;

public class FarmingTerrace {
    private Integer farmingTerraceId;

    private String terraceName;

    private String setupUnit;

    private String adress;

    private String principal;

    private String principalTelephont;

    private String technologyScorp;

    private String content;

    private Double x;

    private Double y;

    private String reserve1;

    private String reserve2;

    public Integer getFarmingTerraceId() {
        return farmingTerraceId;
    }

    public void setFarmingTerraceId(Integer farmingTerraceId) {
        this.farmingTerraceId = farmingTerraceId;
    }

    public String getTerraceName() {
        return terraceName;
    }

    public void setTerraceName(String terraceName) {
        this.terraceName = terraceName == null ? null : terraceName.trim();
    }

    public String getSetupUnit() {
        return setupUnit;
    }

    public void setSetupUnit(String setupUnit) {
        this.setupUnit = setupUnit == null ? null : setupUnit.trim();
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress == null ? null : adress.trim();
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal == null ? null : principal.trim();
    }

    public String getPrincipalTelephont() {
        return principalTelephont;
    }

    public void setPrincipalTelephont(String principalTelephont) {
        this.principalTelephont = principalTelephont == null ? null : principalTelephont.trim();
    }

    public String getTechnologyScorp() {
        return technologyScorp;
    }

    public void setTechnologyScorp(String technologyScorp) {
        this.technologyScorp = technologyScorp == null ? null : technologyScorp.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1 == null ? null : reserve1.trim();
    }

    public String getReserve2() {
        return reserve2;
    }

    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2 == null ? null : reserve2.trim();
    }
}