package com.zxf.eduservice.controller;

import com.zxf.commonutils.R;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/eduservice/user")
@CrossOrigin  //解决跨域问题
public class EduLoginController {

    @PostMapping("login")
    public R login(){
        System.out.println("******");
        return R.ok().data("token","admin");
    }

    @GetMapping("info")
    public R info(){
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!");
        return R.ok().data("roles","[admin]").data("name","admin").data("avatar","https://www.baidu.com/img/PCtm_d9c8750bed0b3c7d089fa7d55720d6cf.png");

    }

}
