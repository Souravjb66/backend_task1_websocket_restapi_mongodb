package com.chat.app.first.model;

import org.springframework.stereotype.Component;

@Component
public class Login {
    private String Username;
    private String Password;
    public Login(String username,String password){
        this.Password=password;
        this.Username=username;
    }
    public String getUsername(){return Username;}
    public String getPassword(){return Password;}
    public void setUsername(String name){
        this.Username=name;
    }
    public void setPassword(String password){
        this.Password=password;
    }
}
