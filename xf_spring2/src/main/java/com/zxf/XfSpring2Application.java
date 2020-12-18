package com.zxf;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@SpringBootApplication
@MapperScan("com.zxf.mapper")//扫描mapper接口
@EnableTransactionManagement//事务处理的时候启动类必须要加的注解
public class XfSpring2Application {
    public static void main(String[] args) {
        SpringApplication.run(XfSpring2Application.class, args);
    }
}
