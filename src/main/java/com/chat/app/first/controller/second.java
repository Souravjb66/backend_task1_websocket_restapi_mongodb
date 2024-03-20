package com.chat.app.first.controller;

import com.chat.app.first.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class second {
    @Autowired
    private Message msg;
    @GetMapping("/after")
    public String getMes(){
        return msg.getChat();
    }
}
