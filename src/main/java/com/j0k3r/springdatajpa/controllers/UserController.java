package com.j0k3r.springdatajpa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.j0k3r.springdatajpa.models.dto.UserDtoRequest;
import com.j0k3r.springdatajpa.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody UserDtoRequest user){
        try{
            userService.save(user);
            return ResponseEntity.ok("user saved");
        } catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());        }
    }

    @GetMapping("/findDtopLoginByUsername")
    public ResponseEntity<?> findDtoLoginByUsername(@RequestParam("username") String username){
        try {
            return ResponseEntity.ok(userService.findByUsernameDtoLogin(username));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/findUserDtoByUsernamev2")
    public ResponseEntity<?> findUserDtoByUsernamev2(@RequestParam("username") String username){
        try {
            return ResponseEntity.ok(userService.findByUsername(username));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
}
