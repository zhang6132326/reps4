package com.zxf.test;

import com.zxf.demo6.Customer;
import com.zxf.demo6.SpringConfig6;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig6.class)
public class TestDemo6 {
    @Autowired
    private Customer customer;

    @Test
    public void test1(){
        customer.save();
    }

}
