package com.zxf.spring4.dao.impl;

import com.zxf.spring4.dao.UserDao;
import com.zxf.spring4.entity.User;
import org.springframework.stereotype.Component;

@Component("userDaoImpl")
public class UserDaoImpl implements UserDao {
    public User getUserByName(String name) {
        System.out.println("用户查找中。。。"+name);

        return new User();
    }
}
