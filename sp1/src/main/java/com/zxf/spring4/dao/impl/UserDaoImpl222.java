package com.zxf.spring4.dao.impl;

import com.zxf.spring4.dao.UserDao;
import com.zxf.spring4.entity.User;
import org.springframework.stereotype.Component;

@Component("userDaoImpl222")
public class UserDaoImpl222 implements UserDao {
    public User getUserByName(String name) {
        System.out.println("我是22222dao");

        return new User();
    }
}
