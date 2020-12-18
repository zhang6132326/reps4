package com.zxf.mapper;

import com.zxf.model.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    public int save(User user);
    public User findByPhone(@Param("phone")String  phone);

    public User findByPhoneAndPwd(@Param("phone") String phone, @Param("pwd") String pwd);

    public User findByUserId(@Param("user_id") Integer userId);
}
