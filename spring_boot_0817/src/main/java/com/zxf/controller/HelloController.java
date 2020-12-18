package com.zxf.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//@Controller//处理层注解配置
@RestController//这注解包含2层:1@Controller  2@ResponseBody
public class HelloController {
  //  @ResponseBody//回写到客户端中
    @RequestMapping("hello") //配置访问的路径
    public String hello(){
        return "**第一个SpringBoot项目!!!"; //页面显示的内容
    }
}