package com.j0k3r.springdatajpa.services;

public interface RolService {
    
    String findIdByName(String name) throws Exception;

    void save(String name) throws Exception;

}
