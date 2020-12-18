package com.test1;

import com.zxf.mapper.DeptMapper;
import com.zxf.mapper.EmployeeMapper;
import com.zxf.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test_emp {
    /*
        测试员工-->部门   属于多对一  2个联合的SQL语句无法实现延迟加载
     */
    @Test
    public void test1()throws IOException{
        InputStream is= Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
        SqlSession session=factory.openSession();
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
        List<Employee> employees = mapper.getallE_D();
        for(Employee e:employees){
            System.out.print(e.getEmp_name()+"--->部门");
            System.out.println(e.getDept().getDept_name());
        }
    }
    /*
        测试员工-->部门   属于多对一   拆分2个SQL语句才可以实现延迟加载
     */
    @Test
    public void test2()throws IOException{
        InputStream is= Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
        SqlSession session=factory.openSession();
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
        List<Employee> employees = mapper.getAllE_D2();
        for(Employee e:employees){
            System.out.print(e.getEmp_name()+":所在部门---->"+e.getDept_id());
            //如果要不查询关联表信息，后台执行的时候只执行1条SQL语句。
            //只有需要的时候，采取还行第二个关联的数据库表
         System.out.println(e.getDept().getDept_name());
        }
    }
}
