package com.chat.app.first.model;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "chat_store")
public class Message {
    private String Username;
    private String Chat;
    public Message(){}
    public Message(String chat){
        this.Chat=chat;
    }
    public String getChat(){
        return Chat;
    }
    public void setChat(String chat){
        this.Chat=chat;
    }
    public String getUsername(){return Username;}
    public void setUsername(String username){
        this.Username=username;
    }
}
