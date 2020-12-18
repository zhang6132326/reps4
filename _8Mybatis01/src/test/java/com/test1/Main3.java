package com.test1;

import com.zxf.CGLIB.CglibProxyExample;
import com.zxf.CGLIB.ReflectServiceImpl;
import com.zxf.inter.InterceptorJdkProxy;
import com.zxf.inters.InterceptorJdkProxyS;
import com.zxf.inters.Interceptors;
import com.zxf.observer.*;
import com.zxf.proJDK.HelloWorld;
import com.zxf.proJDK.HelloWorldImpl;
import com.zxf.proJDK.JDKProxyExample;
import org.junit.Test;




public class Main3 {
    /*
    测试proJDK包 完成JDK动态代理
 */
    @Test
    public void test1(){

        JDKProxyExample jdk=new JDKProxyExample(); //JDK的代理机制，会和下面的HelloWorld接口进行绑定

        HelloWorld proxy=(HelloWorld)jdk.bind(new HelloWorldImpl());
        //这个时候HelloWorld已经配置为一个代理对象了，会在invoke里调用逻辑方法
        proxy.sayHelloWorld();
    }
    /*
        测试CGLIB动态代理
     */
    @Test
    public void test2(){
        CglibProxyExample c=new CglibProxyExample();
        ReflectServiceImpl obj=(ReflectServiceImpl)c.getProxy(ReflectServiceImpl.class);
         obj.sayHello("遮阳伞");
    }
    /*
         测试拦截器
     */
    @Test
    public void test3(){
        HelloWorld proxy=(HelloWorld) InterceptorJdkProxy.bind(new HelloWorldImpl(),"com.zxf.inter.MyInterceptor");
        proxy.sayHelloWorld();

    }
    /*
         测试多个拦截器
     */
    @Test
    public void test4(){
         HelloWorld p1=(HelloWorld) InterceptorJdkProxyS.bind(new HelloWorldImpl(),"com.zxf.inters.Interceptor1");
         HelloWorld p2=(HelloWorld) InterceptorJdkProxyS.bind(p1,"com.zxf.inters.Interceptor2");
         HelloWorld p3=(HelloWorld) InterceptorJdkProxyS.bind(p2,"com.zxf.inters.Interceptor3");
        HelloWorld p4=(HelloWorld) InterceptorJdkProxyS.bind(p3,"com.zxf.inters.Interceptor4");
         p4.sayHelloWorld();
    }
    /*
         观察者模式测试
     */
    @Test
    public void test5(){
        ProductList observable=ProductList.getInstance();

        TaoBaoObserver taoBaoObserver=new TaoBaoObserver();
        JingDongObserver jingDongObserver=new JingDongObserver();
        PinDuoDuoObserver pinDuoDuoObserver=new PinDuoDuoObserver();
        VIPObserver vipObserver=new VIPObserver();

        observable.addObserver(jingDongObserver);
        observable.addObserver(taoBaoObserver);
        observable.addObserver(pinDuoDuoObserver);
        observable.addObserver(vipObserver);

        observable.addProudct("苹果12 Puls");
        observable.addProudct("戴森电吹风");

    }

}
