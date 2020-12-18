package com.zxf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
//配置支持跨域请求。。
//@CrossOrigin(origins = "*",allowedHeaders = "*",methods = {},allowCredentials = "true")
public class TestController {
    @RequestMapping("/auth/login1")
    public String hello(){
        System.out.println("!***************************!");
        return "";
    }
}
