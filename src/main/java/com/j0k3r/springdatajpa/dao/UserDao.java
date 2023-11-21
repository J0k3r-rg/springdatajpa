package com.j0k3r.springdatajpa.dao;

import java.util.Map;

import com.j0k3r.springdatajpa.models.UserEntity;
import com.j0k3r.springdatajpa.models.dto.UserDtoLogin;

public interface UserDao {

    UserDtoLogin findByUsernameDtoLogin(String username);
    
    Map<String,Object> findByUsername(String username);

    void save(UserEntity user);
    
}
