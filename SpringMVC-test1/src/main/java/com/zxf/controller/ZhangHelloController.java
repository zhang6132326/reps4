package com.zxf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ZhangHelloController {

    @RequestMapping(value = "/zhang.do")
    public String sayHello(){
        System.out.println("ZhangHelloController...sayHello()");
       // return "/WEB-INF/page/ok.jsp";
        return "ok";
    }
}
