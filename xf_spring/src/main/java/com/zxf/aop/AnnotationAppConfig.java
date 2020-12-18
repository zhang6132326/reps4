package com.zxf.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.zxf")
@EnableAspectJAutoProxy//开启了spring对aspect的支持
public class AnnotationAppConfig {

}
