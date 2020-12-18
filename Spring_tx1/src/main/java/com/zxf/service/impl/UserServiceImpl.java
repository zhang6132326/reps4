package com.zxf.service.impl;

import com.zxf.service.UserService;

public class UserServiceImpl implements UserService {
    public void hello() {
        System.out.println("Hello");
    }
    public UserServiceImpl() {
        System.out.println("对象创建了。。。");
    }

    public void init(){
        System.out.println("初始化了啊。。。。。！！！！！！！！。");
    }
}
