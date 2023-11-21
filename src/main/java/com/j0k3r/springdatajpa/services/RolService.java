package com.j0k3r.springdatajpa.services;

public interface RolService {
    
    String findIdByName(String name);

    void save(String name);

}
