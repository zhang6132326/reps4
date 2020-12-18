package com.zxf.test1;

import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class Mycallback implements Callable<String>{

    @Override
    public String call() throws Exception {
        try{
            System.out.println(Thread.currentThread().getName()+",正在开始异步发送短信");
            Thread.sleep(5000);
        }catch (Exception e){

        }
        return "异步执行发送短信";
    }
}

public class MyTest1 {
    @Test
    public void test1()throws Exception{
        FutureTask<String> futureTask=new FutureTask<>(new Mycallback());
        new Thread(futureTask).start();
        System.out.println("result:"+futureTask.get());
    }
}
