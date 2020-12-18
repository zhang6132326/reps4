package com.zxf.springcloud.config;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced  //集群调用支持的注解
    public RestTemplate getRestTemplate(){
       return new RestTemplate();
    }
}
