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
    public CommonResult create(@RequestBody Payment payment){//这里必须加@RequestBody。否则提交的数据不能写入数据库
        int result = paymentService.create(payment);
        log.info("插入结果:"+result);
        if(result>0){
            return new CommonResult(200,"数据写入成功:"+serverPort);
        }else {
            return new CommonResult(444,"数据写入失败",null);
        }
    }
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("查询结果为:"+payment);
        if(null!=payment){
            return new CommonResult(200,"查询成功了:"+serverPort,payment);
        }else {
            return new CommonResult(444,"查无此人，编号为:"+id,payment);
        }
    }
    @GetMapping(value = "/payment/discovery")
    public Object discover(){
        List<String> services = discoveryClient.getServices();
        for(String element:services){
            log.info("###"+services);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("cloud-payment-service");
        for(ServiceInstance instance:instances){
            log.info(instance.getServiceId()+"\t"+
                    instance.getHost()+"\t"+
                    instance.getPort()+
                    "\t"+instance.getUri());
        }
        return this.discoveryClient;
    }
    @GetMapping(value = "/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }
}