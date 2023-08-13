package com.i1314i.ourproject.po.ditu;

import java.util.List;

/**
 * @author 平行时空
 * @created 2018-12-14 20:33
 **/
public class MapUrlManger {
    private Integer id;
    private Integer pid;
    private String cname;
    private String ename;
    private String href;
    private String desc;
    private List<MapUrlManger>child;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<MapUrlManger> getChild() {
        return child;
    }

    public void setChild(List<MapUrlManger> child) {
        this.child = child;
    }
}
