package com.zxf.service;

import com.zxf.mapper.EmployeeMapper;
import com.zxf.mapper.JobMapper;
import com.zxf.pojo.Employee;
import com.zxf.pojo.Job;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class Test2 {
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession session;
    private InputStream is;

    private JobMapper jobMapper;

    @Before  //用于测试方法之前执行。
    public   void init() throws Exception{
        is= Resources.getResourceAsStream("zhangMyBatis.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        session=sqlSessionFactory.openSession();
        jobMapper=session.getMapper(JobMapper.class);
    }
    @After  //用于测试方法之后执行。
    public void destory()throws Exception{
        session.commit();
        session.close();
        is.close();
    }

    @Test
    public void test1(){
        Job job = jobMapper.selectJobById("2602");
        System.out.println(job.getJob_name());
        System.out.println("****************职位人员*************************");
                List<Employee> employees = job.getEmployees();
        for(Employee e:employees){
            System.out.println(e.getEmp_name());
        }

    }
}
