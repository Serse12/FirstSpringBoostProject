package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.testing.ParametersMonitor;
import com.example.demo.testing.TimeMonitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Vector;

@RestController
public class UserController {
    @Autowired
    private User user;

    @TimeMonitor
    @ParametersMonitor
    @GetMapping(value="/divertiti")
    public void uselessFuntion(){
        Vector<Integer> x = new Vector<Integer>(2000);

        for(int i=0;i<2000;i++){
            x.add(i);
        }
        for(int i=0;i<2000;i++){
            x.set(i,x.get(i)+1);
        }

    }

}
