package com.zxf.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class CustomBeanPostProcessor2 implements BeanPostProcessor, Ordered {
    //Ordered接口 表示当前业务类的执行级别，数越小级别越高，越先执行。
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("CustomBeanPostProcessor2.Before():"+beanName);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("CustomBeanPostProcessor2.After():"+beanName);
        return bean;
    }

    public int getOrder() {
        return 2;  //数越小级别越高，越先执行。
    }
}
