package com.zxf.atguigu.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    public UserDaoImpl() {
        System.out.println("UserDaoImpl");
    }

    public void save() {
        System.out.println("dao层的save()方法执行了。");
    }
}
