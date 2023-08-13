package com.i1314i.ourproject.po.wechatMenu;

import java.io.Serializable;
import java.util.List;

/**
 * 二级菜单
 * @author 平行时空
 * @created 2018-09-30 16:36
 **/
public class Sub_button implements Serializable{
    private String type;
    private String name;
    private String key;
    private String url;
    private List<Sub_button> sub_button;


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public List<Sub_button> getSub_button() {
        return sub_button;
    }

    public void setSub_button(List<Sub_button> sub_button) {
        this.sub_button = sub_button;
    }

    @Override
    public String toString() {
        return "Sub_button{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", key='" + key + '\'' +
                ", url='" + url + '\'' +
                ", sub_button=" + sub_button +
                '}';
    }
}
