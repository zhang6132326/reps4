package com.zxf.atguigu.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl2222 implements UserDao {
    public UserDaoImpl2222() {
        System.out.println("UserDaoImpl2222构造()方法执行了");
    }

    public void save() {
        System.out.println("UserDaoImpl2222中的save()方法执行了");
    }
}
