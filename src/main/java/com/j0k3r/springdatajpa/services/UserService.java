package com.j0k3r.springdatajpa.services;

import java.util.Map;

import com.j0k3r.springdatajpa.models.dto.UserDtoLogin;
import com.j0k3r.springdatajpa.models.dto.UserDtoRequest;

public interface UserService {
    
    UserDtoLogin findByUsernameDtoLogin(String username) throws Exception;

    Map<String,Object> findByUsername(String username) throws Exception;

    void save(UserDtoRequest user) throws Exception;

}
