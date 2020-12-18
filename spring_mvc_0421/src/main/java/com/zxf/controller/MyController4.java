package com.zxf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController4 {

    @RequestMapping(value = "/ok4/{id}",method = RequestMethod.GET)
    public String ok4_get(@PathVariable("id")Integer id){
        System.out.println("get请求:"+id);
        return "ok1";
    }
    @RequestMapping(value = "/ok4",method = RequestMethod.POST)
    public String ok4_post(){
        System.out.println("post请求:");
        return "ok1";
    }
    @RequestMapping(value = "/ok4",method = RequestMethod.PUT)
    public String ok4_put(){
        System.out.println("put请求...:");
        return "ok1";
    }
    @RequestMapping(value = "/ok4",method = RequestMethod.DELETE)
    public String ok4_del(){
        System.out.println("del请求...:");
        return "ok1";
    }
}
