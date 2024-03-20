package com.chat.app.first.service;

import com.chat.app.first.model.Message;
import com.chat.app.first.repository.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatService {
    @Autowired
    private ChatRepository repository;
    public void SaveChat(Message msg){
        repository.insert(msg);
        System.out.println("stored");

    }
    public List<Message>giveUserMsg(String username){
        return repository.findByUsername(username);

    }
}
