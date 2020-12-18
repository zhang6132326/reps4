package com.zxf.test;

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

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test_many_many {
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession session;
    private InputStream is;

    private EmployeeMapper employeeMapper;
    private JobMapper jobMapper;
    @Before //Test方法之前执行,都是junit提供的方法
    public void init()throws IOException {
        //加载主配置文件
        is= Resources.getResourceAsStream("mybatisConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        //通过工厂获取SqlSession
        session=factory.openSession();
        employeeMapper = session.getMapper(EmployeeMapper.class);
        jobMapper=session.getMapper(JobMapper.class);

    }
    @After//Test方法之后执行,都是junit提供的方法
    public void destory()throws IOException{

        session.close();
        is.close();
    }
    @Test
    public void test1(){
        //通过员工ID查询这个员工都有哪些职务
        Employee employee = employeeMapper.selectEmployeeById("HW9801");
        System.out.println(employee.getEmp_name());
        List<Job> jobs = employee.getJobs();
        for(Job j:jobs){
            System.out.println(j.getJob_name());
        }
    }
    @Test
    public void test2(){
        //通过职位ID查询，本职位都有哪些员工
        Job job = jobMapper.selectJobById("2602");
        System.out.println(job.getJob_name());
        System.out.println("****************职位人员*************************");

        List<Employee> employees = job.getEmployees();

        for(Employee e:employees){
            System.out.println(e.getEmp_name());
        }

    }
}
