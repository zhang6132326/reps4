package com.zxf.test;

import com.zxf.mapper.EmployeeMapper;
import com.zxf.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class Test_one_one {
    private InputStream inputStream=null;
    private SqlSession session=null;
    private EmployeeMapper mapper=null;
    @Before //Test方法之前执行,都是junit提供的方法
    public void init()throws IOException {
            //加载主配置文件
        inputStream= Resources.getResourceAsStream("mybatisConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        //通过工厂获取SqlSession
        session=factory.openSession();
        mapper = session.getMapper(EmployeeMapper.class);
    }
    @After//Test方法之后执行,都是junit提供的方法
    public void destory()throws IOException{

        session.close();
        inputStream.close();
    }
    //测试员工和学历表的一对一查询
    @Test
    public void test1(){
        Employee employee = mapper.selectEmployeeById("HW9808");
        System.out.print(employee.getEmp_name()+",");
        System.out.print(employee.getEmp_gender()+",");
        System.out.print(employee.getEmp_zzmm()+",");
        System.out.print(employee.getEmployeeSchool().getEmp_major()+",");
        System.out.print(employee.getEmployeeSchool().getEmp_xueli()+",");
        System.out.println(employee.getEmployeeSchool().getBy_school());
    }
}
