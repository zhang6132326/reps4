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
     /*
        测试部门对员工    一对多
      */
    @Test
    public void test1()throws IOException{
        InputStream is= Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
        SqlSession session=factory.openSession();
        DeptMapper mapper = session.getMapper(DeptMapper.class);
        List<Dept> depts = mapper.getall_dept_allemp();
        for(Dept d:depts){
            System.out.print("《"+d.getDept_name()+"》");
            List<Employee> employees = d.getEmployees();
            for(Employee e:employees){
                System.out.println(e.getEmp_name());
            }
        }
    }


    /*
       测试部门对员工    一对多  使用延迟加载技术
     */
    @Test
    public void test2()throws IOException{
        InputStream is= Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
        SqlSession session=factory.openSession();
        DeptMapper mapper = session.getMapper(DeptMapper.class);
        List<Dept> depts = mapper.getall_dept_allemp2();
        for(Dept d:depts){
            System.out.print("《"+d.getDept_name()+"》");
            //如果不执行下面的查询，则只执行一条SQL语句，实现了延迟加载。

            List<Employee> employees = d.getEmployees();
            for(Employee e:employees){
                System.out.println(e.getEmp_name());
            }

        }
    }
}
