package com.zxf;

import com.zxf.domain.Teacher;
import com.zxf.domain.Video;
import com.zxf.domain.VideoOrder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {


        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        testInExt(applicationContext);

        /*
        VideoOrder videoOrder=(VideoOrder)applicationContext.getBean("videoOrder");
        System.out.println(videoOrder.getOutTradeNo());
        System.out.println(videoOrder.getVideo().getTitle());

         */


        /*
        Video video = (Video)applicationContext.getBean("video");
        System.out.println(video.getId());
        System.out.println(video.getTitle());

         */
    }
    private static void testInExt(ApplicationContext context){
        Teacher teacher=(Teacher)context.getBean("teacher");
        System.out.println(teacher.getPid());
        System.out.println(teacher.getPname());
        System.out.println(teacher.getBj());


    }

    private static void testInjectCollection(ApplicationContext context){
        Video video=(Video)context.getBean("video");
        System.out.println(video);

        //VideoOrder videoOrder=(VideoOrder)context.getBean("videoOrder");
        //System.out.println(videoOrder.getVideo().getTitle());
    }


      //注入
      private static void testInject(ApplicationContext context){
        Video video=(Video)context.getBean("video");
        System.out.println(video.getTitle());
        //VideoOrder videoOrder=(VideoOrder)context.getBean("videoOrder");
        //System.out.println(videoOrder.getVideo().getTitle());
      }
      //作用域
    private static void testScope(ApplicationContext context){
        Video video1=(Video)context.getBean("video");
        Video video2=(Video)context.getBean("video");
        System.out.println(video1==video2);
    }
}
