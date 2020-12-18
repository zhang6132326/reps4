package com.zxf.eduservice;


import com.zxf.eduservice.entity.EduTeacher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.zxf"})//这样是扫描common项目下的service_base下的com.zxf.servicebase包下的SwaggerConfig;
public class EduApplication {
    public static void main(String[] args) {
        SpringApplication.run(EduApplication.class,args);
    }
}
