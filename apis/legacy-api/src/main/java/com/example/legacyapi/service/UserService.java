package com.example.legacyapi.service;

import com.example.legacyapi.model.User;
import com.example.legacyapi.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UserService {
    private final UserRepository userRepository;

    private UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User getUser(Long id, String strDateOrdered){
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("memNo", id);
        paramMap.put("dateOrdered", strDateOrdered);
        return userRepository.getUser(paramMap);
    }
}
