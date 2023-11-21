package com.j0k3r.springdatajpa.models.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDtoRequest {
    private String username;

    private String password;

    private String name;

    private String lastname;

    private String rol_id;
}
