package com.zxf.service;

import com.zxf.domain.User;

import java.util.List;

public interface UserService {
    String login(String username,String pwd);
    List<User> listUser();
}
