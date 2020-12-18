package com.zxf;

import com.zxf.ano.domain.Video;
import com.zxf.ano.service.VideoService;
import com.zxf.domain.VideoOrder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();

        context.scan("com.zxf");
        context.refresh();
        VideoService vs=(VideoService)context.getBean("videoService");
        vs.findById(23);

        //VideoOrder vo=(VideoOrder)context.getBean("v1");



        /*

        Video v1=(Video)context.getBean("video");
        Video v2=(Video)context.getBean("video");
       System.out.println(v1==v2);

         */

    }
}
