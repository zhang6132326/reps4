package com.zxf.spring4.dao;

import com.zxf.spring4.entity.User;

public interface UserDao {
    public User getUserByName(String  name);
}
