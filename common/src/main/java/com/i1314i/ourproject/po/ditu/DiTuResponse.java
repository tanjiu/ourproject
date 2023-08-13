package com.i1314i.ourproject.po.ditu;

import java.util.List;

/**
 * @author 平行时空
 * @created 2018-11-28 17:00
 **/
public class DiTuResponse {
    private DiTiparameters parameters;
    private List<DiTiItem>routes;
    private List<DiTiSimple>simple;
    private String distance;
    private String duration;
    private String routelatlon;
    private Mapinfo mapinfo;

    public DiTiparameters getParameters() {
        return parameters;
    }

    public void setParameters(DiTiparameters parameters) {
        this.parameters = parameters;
    }

    public List<DiTiItem> getRoutes() {
        return routes;
    }

    public void setRoutes(List<DiTiItem> routes) {
        this.routes = routes;
    }

    public List<DiTiSimple> getSimple() {
        return simple;
    }

    public void setSimple(List<DiTiSimple> simple) {
        this.simple = simple;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getRoutelatlon() {
        return routelatlon;
    }

    public void setRoutelatlon(String routelatlon) {
        this.routelatlon = routelatlon;
    }

    public Mapinfo getMapinfo() {
        return mapinfo;
    }

    public void setMapinfo(Mapinfo mapinfo) {
        this.mapinfo = mapinfo;
    }
}
