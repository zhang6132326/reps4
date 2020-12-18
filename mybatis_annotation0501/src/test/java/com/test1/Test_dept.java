package com.test1;

import com.zxf.mapper.DeptMapper;
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

public class Test_dept {
    @Test
    public void test1()throws IOException {
        InputStream is= Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
        SqlSession session=factory.openSession();
        DeptMapper mapper = session.getMapper(DeptMapper.class);
        List<Dept> depts = mapper.getall_dept();
        for(Dept d:depts){
            System.out.println(d.getDept_name());
        }
    }
    /*
       测试一对多
     */
    @Test
    public void test2()throws IOException{
        InputStream is= Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
        SqlSession session=factory.openSession();
        DeptMapper mapper = session.getMapper(DeptMapper.class);
        List<Dept> depts = mapper.getall_d_e();
          for(Dept d:depts){
              System.out.print("《"+d.getDept_name()+"》");
              List<Employee> employees = d.getEmployees();
              for(Employee e:employees){
                  System.out.println(e.getEmp_name());
              }
          }
    }
}
