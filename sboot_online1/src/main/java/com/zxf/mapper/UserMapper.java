package com.zxf.mapper;

import com.zxf.domain.User;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserMapper {
    private static Map<String , User>userMap=new HashMap<>();
    static {
        userMap.put("zhang",new User(1,"zhang","123"));
        userMap.put("xdclass-lw",new User(2,"xdclass-lw","123456"));
        userMap.put("zxf",new User(3,"zxf","abc"));
        userMap.put("xf",new User(4,"xf","qwer"));
        userMap.put("zhang613",new User(5,"zhang613","asdf"));
        userMap.put("z_613",new User(6,"z_613","qazxsw"));
        userMap.put("zxf_1981",new User(7,"zxf_1981","typeucdos_"));
    }
    public User login(String username,String pwd){
        User user=userMap.get(username);
        if(user==null){
            return null;
        }
        if(user.getPwd().equals(pwd)){
            return user;
        }
        return null;
    }
    public List<User> litUser(){
        List<User> list=new ArrayList<>();
        list.addAll(userMap.values());
        return list;
    }

}
