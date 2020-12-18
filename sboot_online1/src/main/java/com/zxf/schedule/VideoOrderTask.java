package com.zxf.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


/*
    定时统计订单 金额
 */
//@Component
public class VideoOrderTask {
    //@Scheduled( fixedRate = 2) //毫秒执行一次
    @Scheduled(cron = "*/1 * * * * *")//1秒执行一次 支持表达式的写法 https://tool.lu/crontab
      public void sum(){
          //正常是从数据库查询
            System.out.println("当前交易为:"+Math.random());

      }
}
