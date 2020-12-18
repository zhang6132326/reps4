package com.zxf.springcloud.controller;

import com.zxf.springcloud.entities.CommonResult;
import com.zxf.springcloud.entities.Payment;
import com.zxf.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;



    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        System.out.println("我执行了一次。"+payment);
        int result=paymentService.create(payment);

        log.info("****插入结果:"+result);
        if(result>0){

            return new CommonResult(200,"输入数据成功!服务的端口:"+serverPort,result);
        }else {
            return new CommonResult(444,"插入数据失败！",null);
        }
    }
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id")Long id){
        Payment payment=paymentService.getPaymentById(id);
        log.info("查询结果:"+payment);
        //System.out.println(2+3-9);
        if(payment!=null){
            return new CommonResult(200,"查询成功,服务的端口："+serverPort,payment);
        }else {
            return new CommonResult(444,"没有对应的记录，查询ID:"+id,null);
        }
    }
    @GetMapping(value = "/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String element:services){
            log.info("Services:"+element);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("cloud-payment-service");
        for(ServiceInstance instance:instances){
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }
        return this.discoveryClient;
    }
}