package com.zxf.mapper.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtil {
    private static SqlSessionFactory factory;
    private static ThreadLocal<SqlSession> t1=new ThreadLocal<SqlSession>();
    static {
        try{
            InputStream is= Resources.getResourceAsStream("zhangMyBatis.xml");
            factory=new SqlSessionFactoryBuilder().build(is);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static SqlSession getSession(){
        SqlSession session=t1.get();
        if(session==null){
            t1.set(factory.openSession());
        }
        return t1.get();
    }
    public static void closeSession(){
        SqlSession session=t1.get();
        if(session!=null){
            session.close();
        }
        t1.set(null);
    }
}
