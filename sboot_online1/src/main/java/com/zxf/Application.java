package com.zxf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ServletComponentScan //Servlet3.0注解开发自定义Filter,需要在启动类加上这个注解。进行扫描
@EnableScheduling
@EnableAsync  //开启异步任务
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
