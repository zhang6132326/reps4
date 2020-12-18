package com.zxf;

import com.zxf.mapper.DeptMapper;
import com.zxf.mapper.EmployeeMapper;
import com.zxf.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

public class Test2 {
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession session;
    private InputStream is;

    private EmployeeMapper employeeMapper;

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

    @Test
    public void test1(){
        Employee employee = employeeMapper.selectEmployeeById("HW9803");
        System.out.print(employee.getEmp_name()+" 所在部门:");
        System.out.println(employee.getDept().getDept_name());

    }
}
