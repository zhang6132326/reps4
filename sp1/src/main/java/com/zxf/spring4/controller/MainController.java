package com.zxf.spring4.controller;

import com.zxf.spring4.entity.User;
import com.zxf.spring4.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component("mainController")
public class MainController {

    @Autowired
    private MainService srv;

    public String list(){
        String logName="zhang";
        String logPwd="abc";
        User user = srv.login(logName, logPwd);
        if(user==null){
            return "登录失败";
        }else {
            return "登录成功";
        }

    }
}
