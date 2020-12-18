package com.zxf;
import org.junit.After;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})
public class ApplicationTests {

    @After
    public void af() {
        System.out.println("我是开始");
    }

    @Test
    public void contextLoads() {
        System.out.println("test.....");
    }

    @Before
    public void bf() {
        System.out.println("我是最后面的");
    }

}
