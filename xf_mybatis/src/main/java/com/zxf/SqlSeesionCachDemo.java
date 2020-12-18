package com.zxf;


import com.zxf.dao.VideoMapper;
import com.zxf.domain.Video;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSeesionCachDemo {
    public static void main(String[] args) throws IOException {
        String resource="conf/mybatis-config.xml";
        InputStream inputStream= Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        try {

            SqlSession sqlSession1 = sqlSessionFactory.openSession();
            VideoMapper videoMapper1 = sqlSession1.getMapper(VideoMapper.class);
            Video video = videoMapper1.selectById(60);
            System.out.println(video.getTitle());
            sqlSession1.commit();  //这里必须有session的commit操作，否则不会执行二级缓存.


            SqlSession sqlSession2 = sqlSessionFactory.openSession();
            VideoMapper videoMapper2 = sqlSession2.getMapper(VideoMapper.class);
            Video video2 = videoMapper2.selectById(60);
            System.out.println(video2.getTitle());



        }catch (Exception e){
                e.printStackTrace();
        }


    }
}
