package com.zxf.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderZKController {
    /*
        这地址就是客户端要访问的8004在注册服务中心的名称。

     */
    public static final String INVOKE_URL="http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/zk")
    public String paymentInfo(){
           /*
          INVOKE_URL+"/payment/zk"
          这个要访问的就是8004服务端提供的访问地址
          8004的controller类定义的
           @RequestMapping(value = "/payment/zk")
            public String paymentzk(){...}这个方法
            */
       String result=restTemplate.getForObject(INVOKE_URL+"/payment/zk",String.class);
       return result;
    }

}
