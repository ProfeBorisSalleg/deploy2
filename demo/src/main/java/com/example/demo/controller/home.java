package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class home {
    @GetMapping(value="/")
    public String homeA(){
        System.out.println("HOme A");
        return "Home A";
    }
    @GetMapping(value="/home")
    public String homeB(){
        System.out.println("HOme B");
        return "Home B";
    }


}
