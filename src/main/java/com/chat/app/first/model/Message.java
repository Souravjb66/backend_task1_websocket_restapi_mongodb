package com.chat.app.first.model;

import org.springframework.stereotype.Component;

@Component
public class Message {
    private String chat;
    public String getChat(){
        return chat;
    }
    public void setChat(String chat){
        this.chat=chat;
    }
}
