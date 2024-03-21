package com.chat.app.first.controller;

import com.chat.app.first.model.Login;
import com.chat.app.first.model.Message;
import com.chat.app.first.model.User;
import com.chat.app.first.service.ChatService;
import com.chat.app.first.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class InfoController {

    private Login userlogin;

    private ChatService chatService;

    private LoginService loginService;
    public InfoController(){}
    @Autowired
    public InfoController(Login login,ChatService chat,LoginService service){
        this.userlogin=login;
        this.chatService=chat;
        this.loginService=service;
    }
    @PostMapping("/register")
    public String registerUser(@RequestBody User user){
        return loginService.SaveUser(user);

    }
    @PostMapping("/login")
    public String loginUser(@RequestBody Login login){
        var yes=loginService.LoginUser(login);
        if(yes){
            userlogin.setUsername(login.getUsername());
            return "redirect:/getMessage";

        }
        else{
            return "problem";

        }

    }
    @GetMapping("/my-message/{user}")
    public List<String>getUserMessage(@PathVariable String user){
        var i=chatService.giveUserMsg(user);
        List<String>all=new ArrayList<>();
        for(var a:i){
            all.add(a.getUsername()+" "+a.getChat());
        }
        return all;
    }

}
