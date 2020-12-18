package com.zxf.service.impl;
import com.zxf.domain.User;
import com.zxf.mapper.UserMapper;
import com.zxf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional  //实现事务的时候要在业务类中加入该注解
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int save(User user) {
        int f= userMapper.save(user);
      //  int x=5/0;
        return f;
    }
}
