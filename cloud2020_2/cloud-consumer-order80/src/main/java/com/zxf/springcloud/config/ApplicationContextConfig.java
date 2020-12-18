package com.zxf.springcloud.config;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {
    @Bean   // <bean> 标签
    /*
          RestTemplate  支持远程的http调用的一个类
     */
    @LoadBalanced   //如果要用自己的负载均衡算法；这里要去掉。
    /*
        因为要访问集群的订单服务。在订单服务中PAYMENT_URL="http://cloud-payment-service";
        有很多服务主机；如果没有这个注解；就没有办法继续走下了
        有了这个注解；就会自动分派相应的主机来处理客户提交的订单请求。
        这样就给RestTemplate它有了负载均衡的能力。
        后面也可以自己去写轮训算法。根据你的算法来让客户端轮训那个订单服务执行请求处理。
     */
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}