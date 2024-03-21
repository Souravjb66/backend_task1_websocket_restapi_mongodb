package com.chat.app.first.model;

import org.bson.codecs.pojo.annotations.BsonId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
//import org.springframework.data.annotation.Id;


@Document(collection = "register_user")
public class User {
    private String Name;
    @Id
    private String Username;
    private String Password;
    public User(){}
    public User(String name,String username,String password){
        this.Name=name;
        this.Password=password;
        this.Username=username;

    }
    public String getName(){
        return Name;
    }
    public String getUsername(){
        return Username;
    }
    public String getPassword(){
        return Password;
    }
    public void setName(String name){
        this.Name=name;
    }
    public void setUsername(String username){
        this.Username=username;
    }
    public void setPassword(String password){
        this.Password=password;
    }
}
