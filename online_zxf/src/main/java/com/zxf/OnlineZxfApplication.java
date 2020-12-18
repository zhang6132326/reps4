package com.zxf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.zxf.mapper")
@EnableTransactionManagement  //开启事务
public class OnlineZxfApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineZxfApplication.class, args);
    }

}
