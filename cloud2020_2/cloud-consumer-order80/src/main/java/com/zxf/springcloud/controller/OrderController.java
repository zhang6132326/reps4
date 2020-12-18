package com.zxf.springcloud.controller;
import com.zxf.springcloud.entities.CommonResult;
import com.zxf.springcloud.entities.Payment;
import com.zxf.springcloud.lib.LoadBalancer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import javax.annotation.Resource;
import java.net.URI;
import java.util.List;
@RestController
@Slf4j
public class OrderController {
    //public static final String PAYMENT_URL="http://localhost:8001";//远程服务类域名地址
    //如果订单服务不是单机了，是集群了。需要这样写。
    //http://cloud-payment-service是在8001的yml中定义的名字
    public static final String PAYMENT_URL="http://cloud-payment-service";
    @Resource
     private RestTemplate restTemplate;
    @Resource
     private LoadBalancer  loadBalancer;
    @Resource
    private DiscoveryClient discoveryClient;


    @GetMapping(value = "/consumer/payment/create")
    public CommonResult<Payment>create(Payment payment){
        /*
           PAYMENT_URL+"/payment/create"
           就是cloud-provider-payment8001项目中的
           com.zxf.springcloud.controller.PaymentController中的
            @PostMapping(value = "/payment/create")请求
            还有一个就是postForObject表示对数据库增加记录时候用的方法
         */
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,CommonResult.class);
    }
    /*
         PAYMENT_URL+"/payment/create"
         就是cloud-provider-payment8001项目中的
         com.zxf.springcloud.controller.PaymentController中的
         @GetMapping(value = "/payment/get/{id}")
          还有一个就是getForObject表示对数据库查询时候用的方法
       */
    int i=1;
    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id")Long id){

        System.out.println("我执行了。。。"+(i++));

        return  restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }
    @GetMapping(value = "/consumer/payment/getForEntity/{id}")
    public CommonResult<Payment> getPayment2(@PathVariable("id")Long id){
        ResponseEntity<CommonResult> entity = restTemplate.getForEntity(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
        if(entity.getStatusCode().is2xxSuccessful()){
            return entity.getBody();
        }else {
            return new CommonResult<>(444,"操作失败");
        }
    }
    @GetMapping(value = "/payment/discovery")
    public Object discover(){
        List<String> services = discoveryClient.getServices();
        for(String element:services){
            log.info("###"+services);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("cloud-order-service");
        for(ServiceInstance instance:instances){
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }

        return this.discoveryClient;
    }
    @GetMapping(value = "/consumer/payment/lb")
    public String getPaymentLB(){
        List<ServiceInstance> instances
                =discoveryClient.getInstances("cloud-payment-service");
        if(instances==null || instances.size()<=0){
            return null;
        }
        ServiceInstance serviceInstance=loadBalancer.instances(instances);
        URI uri= serviceInstance.getUri();
        /*这里要去找8001 8002 8003中controller层的
         @GetMapping(value = "/payment/lb")
         public String getPaymentLB(){...}定义的请求地址

         */
        return restTemplate.getForObject(uri+"payment/lb",String.class);
    }
}