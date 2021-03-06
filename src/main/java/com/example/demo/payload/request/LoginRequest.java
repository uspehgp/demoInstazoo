package com.example.demo.payload.request;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class LoginRequest {

    @NotEmpty(message = "Username can't be empty")
    private String username;
    @NotEmpty(message = "Password can't be empty")
    private String password;

}
