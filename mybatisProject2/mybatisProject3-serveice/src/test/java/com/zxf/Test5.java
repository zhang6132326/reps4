package com.zxf;

import com.zxf.mapper.RoleMapper;
import com.zxf.mapper.TeacherMapper;
import com.zxf.pojo.Teacher;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class Test5 {
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession session;
    private TeacherMapper teacherMapper;
    private InputStream is;
    @Before  //用于测试方法之前执行。
    public   void init() throws Exception{
        is= Resources.getResourceAsStream("zhangMyBatis.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        session=sqlSessionFactory.openSession();
        teacherMapper=session.getMapper(TeacherMapper.class);
    }
    @After  //用于测试方法之后执行。
    public void destory()throws Exception{
        session.commit();
        session.close();
        is.close();
    }
    @Test
    public void test1(){
        List<Teacher> teachers = teacherMapper.selAll();
        for(Teacher t:teachers){
            System.out.println(t.getName());
        }
    }
}
