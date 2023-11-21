package com.j0k3r.springdatajpa.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDtoLogin {
    private String username;

    private String password;

    private String rol;

}
