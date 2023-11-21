package com.j0k3r.springdatajpa.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.j0k3r.springdatajpa.dao.RolDao;
import com.j0k3r.springdatajpa.models.RolEntity;
import com.j0k3r.springdatajpa.services.RolService;

@Service
public class RolServiceImpl implements RolService{

    @Autowired
    private RolDao rolDao;

    @Override
    public String findIdByName(String name) throws Exception {
        if (name == null || name.isEmpty()) throw new Exception("El nombre no puede ir vacio");
        return rolDao.findIdByName(name);
    }

    @Override
    public void save(String name) throws Exception {
        if (name == null || name.isEmpty()) throw new Exception("El nombre no puede ir vacio");
        rolDao.save(RolEntity.builder()
                .name(name)
                .build());
    }
    
}
