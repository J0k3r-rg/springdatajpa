package com.j0k3r.springdatajpa.services;

import java.util.Map;

import com.j0k3r.springdatajpa.models.dto.UserDtoLogin;
import com.j0k3r.springdatajpa.models.dto.UserDtoRequest;

public interface UserService {
    
    UserDtoLogin findByUsernameDtoLogin(String username);

    Map<String,Object> findByUsername(String username);

    void save(UserDtoRequest user);

}
