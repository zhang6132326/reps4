package com.zxf.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderConsulController {
    //这里的服务提供者就是8006yml下的服务名称
    public static final String INVOKE_URL="http://consul-provider-payment";
    @Resource
    private RestTemplate restTemplate;
    @GetMapping(value = "/consumer/payment/consul/")
    public String paymentInfo(){
        /*
         INVOKE_URL+"payment/consul"
         这个地址就是8006下的controller的提的访问请求地址
          @RequestMapping(value = "/payment/consul")
        public String paymentConsul(){...}
         */
        String result= restTemplate.getForObject(INVOKE_URL+"/payment/consul",
                String.class);
        return result;
    }
}