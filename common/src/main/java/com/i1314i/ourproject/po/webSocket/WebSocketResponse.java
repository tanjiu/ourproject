package com.i1314i.ourproject.po.webSocket;

import java.io.Serializable;

/**
 * @author 平行时空
 * @created 2018-10-12 8:39
 **/
public class WebSocketResponse implements Serializable {
    private String responseMessage;

    public WebSocketResponse(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }
}
