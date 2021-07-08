package com.example.legacyapi.controller;

import com.example.legacyapi.model.User;
import com.example.legacyapi.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;

@RestController
@RequestMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {
    private final UserService userService;

    private UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping(value = "/{id}/{strDateOrdered}")
    @ResponseBody
    public User getUser(@PathVariable Long id, @PathVariable String strDateOrdered){
        User user = userService.getUser(id, strDateOrdered);
        return user;
    }
}
