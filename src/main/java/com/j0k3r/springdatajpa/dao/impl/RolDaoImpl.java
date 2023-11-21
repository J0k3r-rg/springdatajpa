package com.j0k3r.springdatajpa.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.j0k3r.springdatajpa.dao.RolDao;
import com.j0k3r.springdatajpa.models.RolEntity;
import com.j0k3r.springdatajpa.repositories.RolRepository;

@Component
public class RolDaoImpl implements RolDao{

    @Autowired
    private RolRepository rolRepository;

    @Override
    public String findIdByName(String name) {
        return rolRepository.findIdByName(name);
    }

    @Override
    public void save(RolEntity rol) {
        rolRepository.save(rol);
    }
    
}
