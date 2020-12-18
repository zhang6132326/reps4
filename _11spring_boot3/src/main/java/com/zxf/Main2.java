package com.zxf;

import com.zxf.servlet.Servlet2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main2 {
    /*
       第2种方式启动Servlet
       通过使用ServletRegistrationBean对象方式
     */
    public static void main(String[] args) {
        SpringApplication.run(Main2.class,args);
    }
    @Bean
    public ServletRegistrationBean getServletRegistrationBean(){
        ServletRegistrationBean bean=new ServletRegistrationBean(new Servlet2());
        bean.addUrlMappings("/s2"); //类似urlPatterns
        return bean;
    }
}
