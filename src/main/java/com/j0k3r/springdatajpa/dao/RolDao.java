package com.j0k3r.springdatajpa.dao;

import com.j0k3r.springdatajpa.models.RolEntity;

public interface RolDao {
    
    String findIdByName(String name);

    void save(RolEntity name);

}
