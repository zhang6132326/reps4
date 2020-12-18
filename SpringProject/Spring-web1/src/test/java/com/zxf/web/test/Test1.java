package com.zxf.web.test;

import com.zxf.web.pojo.Flower;
import com.zxf.web.service.impl.FlowerServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test1 {
    @Test
    public void test1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        FlowerServiceImpl flowerService=ac.getBean("flowerSerivce",FlowerServiceImpl.class);
        List<Flower> show = flowerService.show();
        for(Flower f:show){
            System.out.println(f.getProduction());
        }

    }
}
