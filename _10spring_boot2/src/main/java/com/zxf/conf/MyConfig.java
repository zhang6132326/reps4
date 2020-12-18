package com.zxf.conf;

import com.zxf.service.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean  //可以替代@ImportResource(locations = {"classpath:bean.xml"})
    /*
        然后getBean()的名字和方法的名字一致就可以了myService
     */
    public MyService myService222(){
        return new MyService();
    }
}
