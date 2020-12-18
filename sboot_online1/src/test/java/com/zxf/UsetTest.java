package com.zxf;

import com.zxf.controller.UserController;
import com.zxf.domain.User;
import com.zxf.utils.JsonData;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})
public class UsetTest {
    @Autowired
    private UserController userController;
     @Test
    public void loginTest(){
        User user=new User();
        user.setUsername("xdclass-lw");
        user.setPwd("1a23456");
        JsonData jsonData=userController.login(user);
       // System.out.println(jsonData.toString());
       // System.out.println(jsonData.getCode());
         System.out.println("code:"+jsonData.getCode());
        TestCase.assertEquals(-1,jsonData.getCode());

    }
}
