package com.zxf.service.impl;

import com.zxf.mapper.UsersMapper;
import com.zxf.pojo.Users;
import com.zxf.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;


    public void addUser(Users users) {
        usersMapper.insertUser(users);
    }
}
