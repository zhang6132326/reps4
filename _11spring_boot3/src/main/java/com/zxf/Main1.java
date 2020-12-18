package com.zxf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan //springBoot启动的时候自动扫描@WebServlet注解
/*
      第一种方式启动Servlet
        通过扫描注解的方式
 */
public class Main1 {
    public static void main(String[] args) {
        SpringApplication.run(Main1.class,args);
    }
}
