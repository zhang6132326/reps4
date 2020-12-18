package com.zxf.atguigu.service;

import com.zxf.atguigu.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier(value = "userDaoImpl2222")//这里的名字必须是 类的首字母小写
    private UserDao userDao;
    public UserServiceImpl() {
        System.out.print("UserServiceImpl");
    }

    public void save() {
        userDao.save();
        System.out.println("Service层的save()方法调用了。");
    }
}
