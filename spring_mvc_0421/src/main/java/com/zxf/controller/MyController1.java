package com.zxf.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller//表示controller请求处理层
public class MyController1 {
    @RequestMapping("ok1") //请求的名字
    public String bean1(){
        System.out.println("ok1....执行了");
        return "ok1"; //试图名称

    }
}
