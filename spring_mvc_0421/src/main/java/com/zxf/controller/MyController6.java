package com.zxf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController6 {
    @RequestMapping(value = "/my6",method = RequestMethod.POST)
    public String character(String username){
        System.out.println(username);

        return "ok1";
    }
}
