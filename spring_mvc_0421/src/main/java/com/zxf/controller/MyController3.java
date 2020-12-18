package com.zxf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/my3")
public class MyController3 {

    @RequestMapping("/ok3/{name}/{age}")
    public String ok3(@PathVariable("name")String name,@PathVariable("age") Integer age){
        System.out.println("name:"+name+",age:"+age);
       return "ok1";
    }
}
