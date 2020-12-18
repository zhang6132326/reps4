package com.zxf.test;

import com.zxf.pojo.Flower;
import com.zxf.service.FlowerService;
import com.zxf.service.impl.FlowerServiceImpl;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import org.junit.Test;

import org.apache.ibatis.io.Resources;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {
    @Test
    public void test1()throws IOException{
        InputStream is=Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
        SqlSession session=factory.openSession();
        List<Flower> list=session.selectList("a.b.selAll");
        for(Flower f:list){
            System.out.println(f.getId()+":"+f.getName()+","+f.getProduction()+","+f.getPrice());
        }

    }
    @Test
    public void test2(){
        FlowerService flowerService=new FlowerServiceImpl();
        List<Flower>list=flowerService.getAll();
       // Logger logger=Logger.getLogger(Test1.class);
        for(Flower f:list){
            System.out.println(f.getId()+":"+f.getName()+","+f.getProduction()+","+f.getPrice());
          //  logger.debug(f.getId()+":"+f.getName()+","+f.getProduction()+","+f.getPrice());
        }

    }
    @Test
    public void test3(){
        FlowerService flowerService=new FlowerServiceImpl();
        int count=flowerService.selById();
       // Logger logger=Logger.getLogger(Test1.class);
        //logger.debug(count);
      System.out.println(count);
    }
    @Test
    public void test4(){
        FlowerService flowerService=new FlowerServiceImpl();
        Map<Object,Object> map=flowerService.seleMap();
         System.out.println(map);
    }
    @Test
    public void test5(){
     //   Logger logger=Logger.getLogger(Test1.class);
     //   logger.debug("我是Debug");
      //  logger.info("我是Info");
        FlowerService flowerService=new FlowerServiceImpl();
           Flower flower=flowerService.selById2(11);
           System.out.println(flower.getProduction());


    }
    @Test
    public void test6(){
        Flower flower=new Flower();
        flower.setId(8);
        FlowerService flowerService=new FlowerServiceImpl();
        Flower f=flowerService.selById3(flower);
        System.out.println(f.getProduction());

    }
    @Test
    public void test7(){
       Map map=new HashMap();
          map.put("id",3);
          map.put("name","月季");

        FlowerService flowerService=new FlowerServiceImpl();
        Flower f=flowerService.selById4(map);
        System.out.println(f.getProduction());

    }
    @Test
    public void test8(){

        FlowerService flowerService=new FlowerServiceImpl();
        List<Flower> fs=flowerService.page(3,5);
        for(Flower flower:fs){
            System.out.println(flower.getName()+","+flower.getProduction());
        }
    }
    @Test
    public void test9(){
        for(int i=500;i<1500;i++) {
            FlowerService flowerService = new FlowerServiceImpl();
            Flower flower = new Flower();
            flower.setName("你是什么花"+i+"朵");
            flower.setPrice(2.7+i);
            flower.setProduction("任何地方都有的小野花"+i);
           int x= flowerService.insertFlower(flower);
           System.out.println(x);
        }
    }

}
