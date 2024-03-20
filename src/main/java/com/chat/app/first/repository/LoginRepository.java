package com.chat.app.first.repository;

import com.chat.app.first.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoginRepository extends MongoRepository<User,Object> {
    List<User>findByByUsername(String Username);

}
