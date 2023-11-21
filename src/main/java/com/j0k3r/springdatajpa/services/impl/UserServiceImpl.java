package com.j0k3r.springdatajpa.services.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.j0k3r.springdatajpa.dao.UserDao;
import com.j0k3r.springdatajpa.models.UserEntity;
import com.j0k3r.springdatajpa.models.dto.UserDtoLogin;
import com.j0k3r.springdatajpa.models.dto.UserDtoRequest;
import com.j0k3r.springdatajpa.services.UserService;
import com.j0k3r.springdatajpa.utils.Validation;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;


    @Override
    public UserDtoLogin findByUsernameDtoLogin(String username) throws Exception {
        if (username == null || username.isEmpty()) throw new Exception("El nombre no puede ir vacio");
        return userDao.findByUsernameDtoLogin(username);
    }

    @Override
    public Map<String,Object> findByUsername(String username) throws Exception {
        if (username == null || username.isEmpty()) throw new Exception("El nombre no puede ir vacio");
        return userDao.findByUsername(username);
    }

    @Override
    public void save(UserDtoRequest user) throws Exception{
        if (Validation.validateStrings(user.getName(),user.getLastname(),user.getUsername(), 
                        user.getPassword(), user.getRol_id())){
            throw new Exception("Todos los campos son obligatorios");
        }
        userDao.save(UserEntity.builder()
                .username(user.getUsername())
                .password(user.getPassword())
                .name(user.getName())
                .lastname(user.getLastname())
                .rol_id(user.getRol_id())
                .build());
    }
}
