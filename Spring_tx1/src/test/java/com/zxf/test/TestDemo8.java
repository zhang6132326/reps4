package com.zxf.test;

import com.zxf.demo8.EmpService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext_demo8.xml")
public class TestDemo8 {
    @Autowired
    private EmpService empService;

    @Test
    public void test1(){
       empService.save();
    }
}
