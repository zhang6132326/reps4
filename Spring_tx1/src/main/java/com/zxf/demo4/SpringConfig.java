package com.zxf.demo4;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//当前类为配置类
@Configuration
//扫描包结构
@ComponentScan(value = "com.zxf")
@Import(value = {SpringConfig2.class})
public class SpringConfig {



}
