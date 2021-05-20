package com.example.demo.payload.response;

import lombok.Getter;

@Getter
public class InvalidLoginResponse {

    private String username;
    private String password;

    public InvalidLoginResponse(){
        this.password = "Invalid  Password";
        this.username = "Invalid Username";
    }
}
