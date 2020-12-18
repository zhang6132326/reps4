package com.zxf.springcloud.controller;
import com.zxf.springcloud.entities.CommonResult;
import com.zxf.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {
    //public static final String PAYMENT_URL="http://localhost:8001";  //单服务的时候
    public static final String PAYMENT_URL="http://CLOUD-PAYMENT-SERVICE"; //集群的时候 ，从eureka中获取的地址
     @Resource
     private RestTemplate restTemplate;


     @GetMapping("/consumer/payment/create")
     public CommonResult<Payment> create(Payment payment){
         System.out.println("OrderController类中的**:"+payment);
         return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,CommonResult.class);
     }
     @GetMapping("/consumer/payment/get/{id}")
     public CommonResult<Payment> getpayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
     }
}