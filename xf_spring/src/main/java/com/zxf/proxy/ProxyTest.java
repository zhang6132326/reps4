package com.zxf.proxy;

public class ProxyTest {
    public static void main(String[] args) {

        /*
        PayService payService=new PayServiceImpl();
        payService.callback("abc123");

         */
        //静态代理
        /*
        PayService payService1=new StaticProxyPayServiceImpl(new PayServiceImpl());
        payService1.save(23,12);
        payService1.callback("abc");

         */
        //JDK代理
        /*
         JdkProxy jdkProxy=new JdkProxy();
         //获取代理对象
        PayService payService=(PayService)jdkProxy.newProxyInstance(new PayServiceImpl());
        //调用目标方法
        payService.callback("abc");
        payService.save(23,11);

         */

        //Cglib代理
        CglibProxy cglibProxy=new CglibProxy();
        PayService pc=(PayService)cglibProxy.newProxyInstance(new PayServiceImpl());
        //调用目标方法
        pc.save(23,2);
        pc.callback("aaa");




    }
}
