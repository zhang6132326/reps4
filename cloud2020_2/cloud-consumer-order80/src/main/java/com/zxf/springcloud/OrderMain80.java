package com.zxf.springcloud;
import com.zxf.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
/*
    告诉不用默认的轮询机制了。而采用的是MySelfRule类定义的随机轮询机制
    name = "cloud-payment-service",表示请求服务在服务中心对应的名称
    它在8001 8002 8003 的yml定义的名字
 */
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}