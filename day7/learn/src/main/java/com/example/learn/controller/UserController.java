package com.example.learn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/user")
public class UserController {
    
    @GetMapping("/getuser")
    public String getMethodName() {
        return "hello";
    }
    
}
