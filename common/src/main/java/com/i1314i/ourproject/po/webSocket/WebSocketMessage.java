package com.i1314i.ourproject.po.webSocket;

import java.io.Serializable;

/**
 * @author 平行时空
 * @created 2018-10-12 8:38
 **/
public class WebSocketMessage implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
