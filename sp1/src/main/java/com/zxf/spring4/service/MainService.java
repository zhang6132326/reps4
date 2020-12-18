package com.zxf.spring4.service;

import com.zxf.spring4.dao.UserDao;
import com.zxf.spring4.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component  //注册Bean <bean id="
public class MainService {
    @Autowired
    @Qualifier("userDaoImpl")
    UserDao userDao;
    public User login(String logName,String pwd){
        System.out.println("Service 接收到了"+logName+","+pwd);

        return userDao.getUserByName(logName);
    }
}
