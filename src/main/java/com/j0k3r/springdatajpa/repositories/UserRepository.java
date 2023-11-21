package com.j0k3r.springdatajpa.repositories;

import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.j0k3r.springdatajpa.models.UserEntity;
import com.j0k3r.springdatajpa.models.dto.UserDtoLogin;

public interface UserRepository extends JpaRepository<UserEntity,String>{
    
    @Query("SELECT new com.j0k3r.springdatajpa.models.dto.UserDtoLogin(u.username," +
    " u.password, u.rol_id) FROM UserEntity u WHERE u.username = :username")
    UserDtoLogin findByUsernameDtoLogin(@Param("username") String username);

    @Query("SELECT new map(u.username as username, u.password as password, u.rol_id as rolId)" +
    " FROM UserEntity u WHERE u.username = :username")
    Map<String, Object> findByUsername(@Param("username") String username);
}
