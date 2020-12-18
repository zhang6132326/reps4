package com.zxf.service.impl;

import com.zxf.pojo.Flower;
import com.zxf.pojo.PageInfo;
import com.zxf.service.FlowerService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowerServiceImpl implements FlowerService {

    public List<Flower> getAll() {
        try {
            InputStream is = Resources.getResourceAsStream("zhang.xml");
            //使用工厂设计模式
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
            //生产SqlSession
            SqlSession session = factory.openSession();

            List<Flower> list = session.selectList("a.b.selAll");
            return list;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public int selById() {
        try {
            InputStream is = Resources.getResourceAsStream("zhang.xml");
            //使用工厂设计模式
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
            //生产SqlSession
            SqlSession session = factory.openSession();

            int count = session.selectOne("a.b.selById");
            return count;
        }catch (Exception e){
            e.printStackTrace();
        }
        return -1;
    }

    public Map<Object, Object> seleMap() {
        Map<Object,Object> map=null;
        try{
            InputStream is = Resources.getResourceAsStream("zhang.xml");
            //使用工厂设计模式
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
            //生产SqlSession
            SqlSession session = factory.openSession();

              map=session.selectMap("a.b.c","name");
        }catch (Exception e){
            e.printStackTrace();
        }
        return map;
    }

    public Flower selById2(int id) {
        Flower f=null;
        try{
            InputStream is = Resources.getResourceAsStream("zhang.xml");
            //使用工厂设计模式
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
            //生产SqlSession
            SqlSession session = factory.openSession();

            f=session.selectOne("a.b.selById2",id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return f;
    }

    public Flower selById3(Flower flower) {

        Flower f=null;
        try{
            InputStream is = Resources.getResourceAsStream("zhang.xml");
            //使用工厂设计模式
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
            //生产SqlSession
            SqlSession session = factory.openSession();

            f=session.selectOne("a.b.selById3",flower);
        }catch (Exception e){
            e.printStackTrace();
        }
        return f;
    }

    public Flower selById4(Map map) {
        Flower f=null;
        try{
            InputStream is = Resources.getResourceAsStream("zhang.xml");
            //使用工厂设计模式
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
            //生产SqlSession
            SqlSession session = factory.openSession();

            f=session.selectOne("a.b.selById4",map);
        }catch (Exception e){
            e.printStackTrace();
        }
        return f;
    }

    public List<Flower> page(int pagesize,int pagenumber) {
        List<Flower> fs=null;
        int pageSize=pagesize;
        int pageNumber=pagenumber;
        try{
            InputStream is = Resources.getResourceAsStream("zhang.xml");
            //使用工厂设计模式
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
            //生产SqlSession
            SqlSession session = factory.openSession();
            Map  map=new HashMap();
            map.put("pageSize",pageSize);//每页显示几个
            map.put("pageStart",pageSize*(pageNumber-1)); //用于翻页的
            fs=session.selectList("a.b.page",map);
        }catch (Exception e){
            e.printStackTrace();
        }

        return fs;
    }

    public int insertFlower(Flower flower) {
        SqlSession session=null;
        try{
            InputStream is = Resources.getResourceAsStream("zhang.xml");
            //使用工厂设计模式
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
            //生产SqlSession
           session = factory.openSession();
              int i=session.insert("a.b.ins",flower);
              session.commit();
              session.close();
            return i;
        }catch (Exception e){
            System.out.println(e.getMessage());
           session.rollback();
        }
        return 0;
    }

    public PageInfo showPage(int pageSize, int pageNumber) {
        SqlSession session=null;
        try {
            InputStream is = Resources.getResourceAsStream("zhang.xml");
            //使用工厂设计模式
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
            //生产SqlSession
            session = factory.openSession();
            PageInfo pi=new PageInfo();
            pi.setPageNumber(pageNumber);
            pi.setPageSize(pageSize);
            Map<String,Object> map=new HashMap<String, Object>();
            map.put("pageStart",pageSize*(pageNumber-1));
            map.put("pageSize",pageSize);
            pi.setList(session.selectList("a.b.page",map));
            //总条数
            int count=session.selectOne("a.b.selById");
            pi.setTotal(count%pageSize==0?count/pageSize:count/pageSize+1);
            return pi;
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

}
