package com.zxf.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping(value = "/my2")
public class MyController2 {
    @RequestMapping(value = "/*/an?/**/ok1")
    /*
          * 任意字符
          ? 任意一个字符
          ** 任意多层目录
     */
    public String ok1(){
        System.out.println("MyController2...ok1");
        return "ok1";
    }
}