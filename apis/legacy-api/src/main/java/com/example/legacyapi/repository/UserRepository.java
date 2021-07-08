package com.example.legacyapi.repository;

import com.example.legacyapi.model.User;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class UserRepository {
    public User getUser(Map<String, Object> paramMap){
        User user = new User();
        user.setMemNo((Long) paramMap.get("memNo"));
        return user;
    }
}
