package com.j0k3r.springdatajpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.j0k3r.springdatajpa.models.RolEntity;

public interface RolRepository extends JpaRepository<RolEntity,String>{
    

    @Query(
        "Select r.id from RolEntity r where r.name = :name"
    )
    String findIdByName(@Param("name") String name);

}
