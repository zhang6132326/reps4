package com.zxf.web.controller;

import com.zxf.web.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@Controller
public class MyController1 {
    @RequestMapping("c1")
    public String execute1(){
        System.out.println("c1方法");
        return "ok.jsp";
    }
    @RequestMapping("c2")
    public String execute2(String name,int age){
        System.out.println("c2方法:"+name+","+age);
        return "ok.jsp";
    }
    @RequestMapping("c3")
    public String execute3(Users users){
        System.out.println("c3方法:"+users.getName()+","+users.getAge());
        return "ok.jsp";
    }
    @RequestMapping("c4")
    public String execute4(Users users, HttpServletRequest req){
        System.out.println("c4方法:"+users.getName()+","+users.getAge());
        req.setAttribute("uname",users.getName());
        return "ok.jsp";
    }
    @RequestMapping("c5")
    public String execute5(@RequestParam("che")List<String> lists){//对应多选
       System.out.println(lists);
        return "ok.jsp";
    }
    @RequestMapping("c6/{a1}/{a2}") // a1 a2随便写，但要和@PathVariable(value = "a1")对应上
    public String execute6(@PathVariable(value = "a1") String zhang1, @PathVariable(value = "a2") String zhang2){
      System.out.println(zhang1+"  "+zhang2);
        return "/ok.jsp";
    }
    @RequestMapping("c7")
    @ResponseBody
    public String execute7(){
        Users users=new Users();
        users.setAge(23);
        users.setName("zhang");
         return  "users";
    }
    @RequestMapping("c8")
    public String execute8(){//对应多选
        System.out.println("c8....execute8");
        return "ok2";
    }
}
