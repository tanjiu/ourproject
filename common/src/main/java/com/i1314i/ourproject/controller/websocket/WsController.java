package com.i1314i.ourproject.controller.websocket;

import com.i1314i.ourproject.po.webSocket.WebSocketMessage;
import com.i1314i.ourproject.po.webSocket.WebSocketResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * @author 平行时空
 * @created 2018-10-12 8:41
 **/
//@Controller
public class WsController {
    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public WebSocketResponse say(WebSocketMessage message)throws Exception{
        Thread.sleep(3000);
        return new WebSocketResponse("welcome"+message.getName());
    }
}
