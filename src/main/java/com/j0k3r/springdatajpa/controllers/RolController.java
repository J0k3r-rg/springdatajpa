package com.j0k3r.springdatajpa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.j0k3r.springdatajpa.models.dto.RolDtoRequest;
import com.j0k3r.springdatajpa.services.RolService;

@RestController
@RequestMapping("/rol")
public class RolController {
    
    @Autowired
    private RolService rolService;

    @PostMapping("/save")
    public String save(@RequestBody RolDtoRequest rol){
        try{
            rolService.save(rol.getName());
            return "Rol saved";
        } catch (Exception e){
            return "Error: " + e.getMessage();
        }
    }

    @GetMapping("/findIdByName")
    public String findIdByName(@RequestParam("name") String name){
        System.out.println("name: " + name);
        try{
            return "Rol id: " + rolService.findIdByName(name);
        } catch (Exception e){
            return "Error: " + e.getMessage();
        }
    }

}
