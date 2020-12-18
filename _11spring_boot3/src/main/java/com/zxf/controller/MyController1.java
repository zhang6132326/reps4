package com.zxf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
//@Controller
public class MyController1 {
    //@ResponseBody
    @RequestMapping("/h1")
    public Map<String,Object> h1(){
        Map<String,Object> map=new HashMap<>();
        map.put("msg","你好啊！！！");
        return map;
    }
}
