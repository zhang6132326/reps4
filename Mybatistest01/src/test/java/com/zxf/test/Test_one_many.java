package com.zxf.test;

import com.zxf.mapper.DeptMapper;
import com.zxf.mapper.EmployeeMapper;
import com.zxf.pojo.Dept;
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
import java.util.List;

public class Test_one_many {
    private InputStream inputStream=null;
    private SqlSession session=null;
    private DeptMapper mapper=null;
    private EmployeeMapper ep=null;
        @Before //Test方法之前执行,都是junit提供的方法
    public void init()throws IOException {
        //加载主配置文件
        inputStream= Resources.getResourceAsStream("mybatisConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        //通过工厂获取SqlSession
        session=factory.openSession();
        mapper = session.getMapper(DeptMapper.class);
            ep = session.getMapper(EmployeeMapper.class);
    }
    @After//Test方法之后执行,都是junit提供的方法
    public void destory()throws IOException{

        session.close();
        inputStream.close();
    }
    @Test
    public void test1(){
        //通过部门编号查询，当前部门的人员
        Dept dept = mapper.selectDeptById("101");
        System.out.print(dept.getDept_name());
        System.out.println(" 部门负责人编号："+dept.getDept_manager());
        System.out.println("***********************************************");
        List<Employee> employees = dept.getEmployees();
        for(Employee e:employees){
            System.out.print(e.getEmp_no()+" ");
            System.out.print(e.getEmp_name()+" ");
            System.out.print(e.getEmp_marriage()+" ");
            System.out.print(e.getEmp_zzmm()+" ");
            System.out.print(e.getEmp_nation()+" ");
            System.out.print(e.getEmp_gender()+" ");
            System.out.print(e.getEmp_health()+" ");
            System.out.print(e.getEmp_email()+" ");
            System.out.print(e.getEmp_state()+" ");
            System.out.print(e.getEmp_blood()+" ");
            System.out.println(e.getEmp_gender());
        }
    }
     @Test
    public void test2(){
         Employee employee = ep.selectEmployeeById_dept("HW9811");
          System.out.print(employee.getEmp_name()+" 所在部门:");
          System.out.println(employee.getDept().getDept_name());
     }
}
