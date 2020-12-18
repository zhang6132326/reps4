package com.zxf.controller;

import com.zxf.domain.User;
import com.zxf.service.UserService;
import com.zxf.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;
    /*
    @PostMapping("login")
    public JsonData login(String pwd,String username){
        System.out.println(username+"===>"+pwd);
        return JsonData.buildSuccess(username+"===>"+pwd);
    }
     */
    @PostMapping("login")
   public JsonData login(@RequestBody User user){
        System.out.println(user);
        String token = userService.login(user.getUsername(), user.getPwd());
                return token!=null? JsonData.buildSuccess(token) :JsonData.buildError("用户名密码错误！");
   }
    /**
     * 列出全部用户
     * @return
     */
    @GetMapping("list")
    public JsonData listUser(){
        return JsonData.buildSuccess(userService.listUser());
    }


}
