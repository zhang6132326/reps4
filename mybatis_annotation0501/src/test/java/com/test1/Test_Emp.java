package com.test1;

import com.zxf.mapper.EmployeeMapper;
import com.zxf.pojo.Dept;
import com.zxf.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test_Emp {
    @Test
    public void test1() throws IOException{
        InputStream is= Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
        SqlSession session=factory.openSession();
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
        List<Employee> employees = mapper.getall_mep();
        for(Employee e:employees){
            System.out.println(e.getEmp_name());
        }
    }
    /*
         测试多对一
     */
    @Test
    public void test2()throws IOException{
        InputStream is= Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
        SqlSession session=factory.openSession();
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
        List<Employee> employees = mapper.getall_e_d();
        for(Employee e:employees){
            System.out.print(e.getEmp_name()+"所在部门为:");
            Dept dept = e.getDept();
            System.out.println(dept.getDept_name());
        }
    }
}
