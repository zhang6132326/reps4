package com.zxf.ano.config;
import com.zxf.domain.VideoOrder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig {
    @Bean(name = "v1")
    public VideoOrder videoOrder(){
        System.out.println("Bean标签定义的v1执行了");
        return new VideoOrder();
    }
}
