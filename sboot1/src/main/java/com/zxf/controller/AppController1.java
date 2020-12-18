package com.zxf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController1 {
    @RequestMapping("h1")
    public String hello(){
        return "abc123";
    }
}
