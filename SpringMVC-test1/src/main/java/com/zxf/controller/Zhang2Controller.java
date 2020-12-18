package com.zxf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping(value = "/root")  //一级路径
public class Zhang2Controller {

    @RequestMapping("/t1.do")
    public String t1(){
        System.out.println("t1.dao执行了");//2级路径
        return "ok";
    }
    @RequestMapping("/t2.do")
    public String t2(){
        System.out.println("t2.dao执行了");//2级路径
        return "ok";
    }
}
