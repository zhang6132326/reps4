package com.zxf;

import com.zxf.mapper.Users1Mapper;
import com.zxf.pojo.Users;
import com.zxf.pojo.Users1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Test2 {
    @Autowired
    private Users1Mapper users1Mapper;

    @Test
    public void saveUser(){
        Users1 u1=new Users1();
        //	u1.setUserid(1);
        u1.setUsername("wangha");
        u1.setUserage(23);
        u1.setText("wo shi benb");
        int insert = users1Mapper.insert(u1);
        System.out.println("********"+insert);
    }

}
