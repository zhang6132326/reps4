package com.zxf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//这个也可以拿到一个配置类里。这里拿到了com.zxf.config.Myconfig里面
//@MapperScan("com.zxf.mapper")//扫描mapper包下所有的mapper接口，没有这个注解会报错。
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
