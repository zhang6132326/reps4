package com.zxf.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController2 {
    /*
         如果取配置文件的内容用${}
         如果给配置文件的属性动态赋值用#{} #{9==2} #{23+45} 等
     */
    @Value("${emp.name}") //这样就可以在取出配置文件的内容了。
    private String name;
    @RequestMapping("/h2")
    public String h2(){
        return "你好啊:"+name; //把配置文件的内容动态在这里显示在页面上
    }
}
