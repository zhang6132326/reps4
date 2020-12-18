package com.zxf.controller;

import com.zxf.domain.User;
import com.zxf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
@RestController
@RequestMapping("api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;
     @RequestMapping("save")
    public Object save(){
        User user=new User();
           user.setName("zhang3");
           user.setPwd("abc123");
           user.setCreate_time(new Date());
           user.setPhone("1789238734");
           user.setHead_img("aabbddd.jpg");
        userService.save(user);
        return user;
    }
}
