package com.zxf;

import com.zxf.dao.VideoMapper;
import com.zxf.dao.VideoOrderMapper;
import com.zxf.domain.User;
import com.zxf.domain.Video;
import com.zxf.domain.VideoOrder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.jws.soap.SOAPBinding;
import java.io.InputStream;
import java.util.*;

public class SqlSessionDemo {
    public static void main(String[] args) throws Exception {
        String resource = "conf/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            VideoMapper videoMapper = sqlSession.getMapper(VideoMapper.class);
            VideoOrderMapper videoOrderMapper = sqlSession.getMapper(VideoOrderMapper.class);
              /*
              Video video = videoMapper.selectById(30);
              System.out.print(video);
               */



            /*
              List<Video> selectlist = videoMapper.selectlist();
              for(Video v:selectlist){
                  System.out.println(v.getTitle());
              }

             */

              /*

              List<Video> list = videoMapper.selectListByXML();
              for(Video v:list){
                  System.out.println(v.getTitle());
              }

               */







/*
              List<Video> list2 = videoMapper.selectByPointAndTitleLike(.8, "java");
              for(Video v:list2){
                  System.out.print(v.getPoint());
                  System.out.println(v.getTitle());
              }

 */


              /*
              Video video1 =  new Video();
              video1.setTitle("Redis设计与实现aaaa");
              video1.setCoverImg("http://product.dangdang.com/23501734.html");
              video1.setPoint(9.41);
              video1.setCreateTime(new Date());
              video1.setPrice(63);
              video1.setSummary("资深Redis技术专家撰写，深入了解Redis技术内幕的必读之作。从源码角度解析Redis的架构设计、实现原理和工作机制");

              //新增一条记录
              Video video2 =  new Video();
              video2.setTitle("Redis 深度历险：核心原理与应用实践bbbbb");
              video2.setCoverImg("http://product.dangdang.com/25859315.html");
              video2.setPoint(9.2);
              video2.setCreateTime(new Date());
              video2.setPrice(40);
              video2.setSummary("聚焦Redis实战，探究Redis源码与核心原理；轻松通过技术面试，进入心仪名企业");


              List<Video> lists = new ArrayList<>();
              lists.add(video1);
              lists.add(video2);
              videoMapper.addBatch(lists);

               */


               /*
              Video video1 =  new Video();
              video1.setId(58);
              video1.setTitle("Redis开发与运维update");
              video1.setCoverImg("http://product.dangdang.com/24194121.html");
              video1.setPoint(9.41);
              video1.setCreateTime(new Date());
              video1.setPrice(70);
              video1.setSummary("update1.全面覆盖Redis 3基本功能及应用，深入细腻地讲解Redis运行机制及处理过程。");
              videoMapper.updateVideo(video1);

                */
               /*
              Video video1 =  new Video();
              video1.setId(55);
              video1.setTitle("SpringBoot源码分析");
              video1.setSummary("建立微服务的基础！！！！！。");
              videoMapper.updateVideoSelective(video1);

                */
               /*
              Map map=new HashMap<String,Object>();
                      map.put("createTime","2020-08-01 20:11:58");
                      map.put("price",699);

               videoMapper.deleteByCreateTimeAndPrice(map);

                */
               /*

              Video video = videoMapper.selectBaseFieldByidWithResultMap(60);
              System.out.println(video);

                */
               /*
              List<VideoOrder> videoOrders = videoOrderMapper.queryVideoOrderList();
              for(VideoOrder vo:videoOrders){
                  System.out.print(vo.getVideo_title()+"-->");
                  System.out.println(vo.getUser().getName());
              }

                */
            List<User> users = videoOrderMapper.queryUserOrder();
            for (User u : users) {
                System.out.print(u.getId() + ":" + u.getName() + "--->");

                List<VideoOrder> videoOrderList = u.getVideoOrderList();

                for (VideoOrder v : videoOrderList) {
                    System.out.print(v.getId() + ":" + v.getVideo_title());
                }
                System.out.println();

            }


        }
    }
}
