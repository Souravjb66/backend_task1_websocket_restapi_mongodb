package com.chat.app.first.controller;

import com.chat.app.first.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class MessageController {
    @Autowired
    private Message msg;
//    @PostMapping("/message")
    @MessageMapping("/message")
    @SendTo("/topic/get")
    public Message getContent(@Payload Message msg){
        this.msg.setChat(msg.getChat());
        return msg;
    }
    @GetMapping("/hot")
    public String getMessage(){
        return "index.html";
    }


}
