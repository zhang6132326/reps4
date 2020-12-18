package com.zxf.web.controller;

import com.zxf.web.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class MyController2 {
    @RequestMapping("/saveUsers")
    public String saveUsers(Users users){
        System.out.println(users.getName());
        System.out.println(users.getAge());
        System.out.println(users.getPwd());
        return "ok2";
    }
}
