package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(){
        super();
    }
}
