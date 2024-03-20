package com.chat.app.first.controller;

import com.chat.app.first.model.Login;
import com.chat.app.first.model.Message;
import com.chat.app.first.model.User;
import com.chat.app.first.service.ChatService;
import com.chat.app.first.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class MessageController {
    @Autowired
    private Login login;

    @Autowired
    private ChatService chatService;

    @MessageMapping("/message")
    @SendTo("/topic/get")
    public Message getContent(@RequestBody Message msg){
        msg.setUsername(login.getUsername());
        chatService.SaveChat(msg);
        return msg;                                                      //user1 and user2
    }

    @GetMapping("/chat")
    public String getMessage(){
        return "index.html";
    }



}
