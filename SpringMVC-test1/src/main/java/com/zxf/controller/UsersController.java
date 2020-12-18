package com.zxf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "users")
public class UsersController {

    @RequestMapping(value = "u1.do")
    public String t1(Users users){
        System.out.println(users.getAddress());
        System.out.println(users.getAge());
        System.out.println(users.getUsername());
        System.out.println(users.getBirthday());
        return "ok";
    }
}
