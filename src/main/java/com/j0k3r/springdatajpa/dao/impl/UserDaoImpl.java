package com.j0k3r.springdatajpa.dao.impl;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.j0k3r.springdatajpa.dao.UserDao;
import com.j0k3r.springdatajpa.models.UserEntity;
import com.j0k3r.springdatajpa.models.dto.UserDtoLogin;
import com.j0k3r.springdatajpa.repositories.UserRepository;

@Component
public class UserDaoImpl implements UserDao{

    @Autowired
    private UserRepository userRepository;

    @Override
    public Map<String,Object> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public UserDtoLogin findByUsernameDtoLogin(String username) {
        return userRepository.findByUsernameDtoLogin(username);
    }

    @Override
    public void save(UserEntity user) {
        userRepository.save(user);
    }
    
}
