package com.hardcore.accounting.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("v1/greeting/{name}")
    public String sayHello(@PathVariable("name") String name){
        return String.format("Hello,%s",name);
    }
}
