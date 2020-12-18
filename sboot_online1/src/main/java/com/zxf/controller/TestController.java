package com.zxf.controller;

import com.zxf.config.ZxfConfig;
import com.zxf.task.AsyncTack;
import com.zxf.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;

@RestController
@RequestMapping("/api/v1/test")
@PropertySource("classpath:pay1.properties")
public class TestController {
    /*
    @Value("${zhang.1}")
    private String z1;
    @Value("${zhang.2}")
    private String z2;
    @Value("${zhang.3}")
    private String z3;
    */

    /*
       使用了统一的配置类 上面就不用  @Value("${zhang.1}")方式了
     */
    @Autowired
    private ZxfConfig zxfConfig;

    @GetMapping("get_config")
    public JsonData testConfig(){
        Map<String ,String> map=new HashMap<>();
         map.put("1",zxfConfig.getZ1());
         map.put("2",zxfConfig.getZ2());
         map.put("3",zxfConfig.getZ3());
        return JsonData.buildSuccess(map);
    }
    @Autowired
    private AsyncTack asyncTack;
    @GetMapping("async")
    public JsonData testAsync(){
         long begin=System.currentTimeMillis();
         /*
         asyncTack.task1();
         asyncTack.task2();
         asyncTack.task3();
          */
        Future<String>task4=asyncTack.task4();
        Future<String>task5 = asyncTack.task5();
        while (true){
            if (task4.isDone() && task5.isDone()){//是否完成
                try {
                    String s4 = task4.get();
                    System.out.println("我是s4:"+s4);
                    String s5 = task5.get();
                    System.out.println("我是s5:"+s5);
                }catch (Exception e){

                }finally {
                    break;
                }
            }

         }
         long end=System.currentTimeMillis();
         return JsonData.buildSuccess(end-begin);//可以计算一下执行了多少毫秒

    }
}
