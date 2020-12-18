package com.zxf;

import com.zxf.mapper.EmployeeMapper;
import com.zxf.mapper.EmployeeSchoolMapper;
import com.zxf.mapper.TeacherMapper;
import com.zxf.pojo.Employee;
import com.zxf.pojo.EmployeeSchool;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

public class Test6 {
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession session;
    //private EmployeeSchoolMapper employeeSchoolMapper;
    private EmployeeMapper employeeMapper;
    private InputStream is;
    @Before  //用于测试方法之前执行。
    public   void init() throws Exception{
        is= Resources.getResourceAsStream("zhangMyBatis.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        session=sqlSessionFactory.openSession();
        employeeMapper=session.getMapper(EmployeeMapper.class);
    }
    @After  //用于测试方法之后执行。
    public void destory()throws Exception{
        session.commit();
        session.close();
        is.close();
    }
/*
    @Test
    public void test1(){
        EmployeeSchool employeeSchool = employeeSchoolMapper.selectEmployeeSchoolById("HW9808");
        System.out.println(employeeSchool.getEmp_xueli()+","+employeeSchool.getBy_school()+","+employeeSchool.getEmp_major());
    }
  */
@Test
    public void test2(){
        Employee employee = employeeMapper.selectEmployeeById("HW9802");
        System.out.println(employee.getEmp_name()+","+employee.getEmployeeSchool().getBy_school());

    }
}
