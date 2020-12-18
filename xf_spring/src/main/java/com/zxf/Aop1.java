package com.zxf;

import com.zxf.domain.Video;
import com.zxf.service.VideoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Aop1 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("aop1.xml");
         testAop(context);
    }
    private static  void  testAop(ApplicationContext context){
        VideoService videoService=(VideoService)context.getBean("videoService");
        videoService.save(new Video());
        videoService.findById(23);

    }
}
