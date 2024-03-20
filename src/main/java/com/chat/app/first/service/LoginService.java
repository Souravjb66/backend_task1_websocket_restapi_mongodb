package com.chat.app.first.service;

import com.chat.app.first.model.Login;
import com.chat.app.first.model.User;
import com.chat.app.first.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class LoginService {
    @Autowired
    private LoginRepository userRepository;
    public String SaveUser(User user){

        if(userRepository.findByByUsername(user.getUsername())==null){
            userRepository.insert(user);
            return "saved";

        }
        return "already available change username";

    }
    public Boolean LoginUser(Login login){
        var i=userRepository.findByByUsername(login.getUsername());
        for(var b:i){
            if(Objects.equals(b.getPassword(), login.getPassword()) && Objects.equals(b.getUsername(), login.getUsername())){
                return true;

            }
        }
        return false;


    }

}
