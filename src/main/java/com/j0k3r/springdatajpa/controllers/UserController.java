package com.j0k3r.springdatajpa.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.j0k3r.springdatajpa.models.dto.UserDtoLogin;
import com.j0k3r.springdatajpa.models.dto.UserDtoRequest;
import com.j0k3r.springdatajpa.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public String save(@RequestBody UserDtoRequest user){
        try{
            userService.save(user);
            return "User saved";
        } catch(Exception e){
            return "Error saving user";
        }
    }

    @GetMapping("/findUserByUsername")
    public UserDtoLogin findUserByUsername(@RequestParam("username") String username){
        return userService.findByUsernameDtoLogin(username);
    }

    @GetMapping("/findUserByUsernamev2")
    public Map<String,Object> findUserByUsernamev2(@RequestParam("username") String username){
        return userService.findByUsername(username);
    }
}
