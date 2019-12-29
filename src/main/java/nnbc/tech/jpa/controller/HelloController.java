package nnbc.tech.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    @GetMapping("/hello")
    public String hello(){
        return "hello2";
    }
}
