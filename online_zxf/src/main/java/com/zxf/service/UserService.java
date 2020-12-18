package com.zxf.service;

import com.zxf.model.entity.User;

import java.util.Map;

public interface UserService {
    /*
        新增用户
     */
    public int save(Map<String,String>userInfo);

    public String findByPhoneAndPwd(String phone, String pwd);

    public User findByUsesrId(Integer userId);
}
