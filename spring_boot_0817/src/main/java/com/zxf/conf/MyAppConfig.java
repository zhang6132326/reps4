package com.zxf.conf;

import com.zxf.service.HelloSerive;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*
     当前类上一个配置类。可以替换之前Spring中的配置文件
     以前我们定义Bean标签要这样写
     <bean></bean>
     这里使用@Bean就可以了。
 */
@Configuration
public class MyAppConfig {
    @Bean
    public HelloSerive helloSerive(){
        System.out.println("MyAppConfig@Bean给容器添加组件了。");

        return new HelloSerive();
    }
}
