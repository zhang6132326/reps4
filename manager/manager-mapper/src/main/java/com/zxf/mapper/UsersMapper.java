package com.zxf.mapper;

import com.zxf.pojo.Users;

import java.util.List;

public interface UsersMapper {
    void insertUser(Users users);
    List<Users> selectUserAll();
}
