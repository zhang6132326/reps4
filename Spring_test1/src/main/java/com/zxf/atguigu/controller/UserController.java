package com.zxf.atguigu.controller;

import com.zxf.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    public void save_user(){
        userService.save();
        System.out.print("Controller层的save_user()方法执行了");
    }

    public UserController() {
        System.out.println("UserController");
    }
}
