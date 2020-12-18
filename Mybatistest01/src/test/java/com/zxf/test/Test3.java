package com.zxf.test;

import com.zxf.mapper.EmployeeMapper;
import com.zxf.mapper.StudentMapper;
import com.zxf.pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test3 {
    private InputStream inputStream=null;
    private SqlSession session=null;
    private StudentMapper mapper=null;
    @Before //Test方法之前执行,都是junit提供的方法
    public void init()throws IOException {
         //加载主配置文件
        inputStream= Resources.getResourceAsStream("mybatisConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        //通过工厂获取SqlSession
        session=factory.openSession();
        mapper = session.getMapper(StudentMapper.class);
    }
    @After//Test方法之后执行,都是junit提供的方法
    public void destory()throws IOException{
        session.close();
        inputStream.close();
    }
    //测试 public List<Student> getAllStu();
    @Test
    public void test1(){
        List<Student> allStu = mapper.getAllStu();
        for(Student s:allStu){
            System.out.print(s.getStu_id()+" ");
            System.out.print(s.getStu_name()+" ");
            System.out.print(s.getStu_age()+" ");
            System.out.println(s.getSut_tid_id());

        }
    }

}
