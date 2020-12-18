package com.zxf.test;

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

public class Test1 {
    /*
       通过使用session提供的selectList方法对应的<select id 定义的名称查询
     */
    @Test
    public void test1()throws IOException{
        InputStream is= Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
        SqlSession session=factory.openSession();
        List<Employee>findAll=session.selectList("com.zxf.mapper.EmployeeMapper.findAll");
        for(Employee e:findAll){
            System.out.println(e.getEmp_email());
        }
    }
    /*
        直接调用了Mapper接口方法。
          */

    @Test
    public void test2()throws IOException{
        InputStream is= Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
        SqlSession session=factory.openSession();
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
        List<Employee>findAll=mapper.findAll();
        for(Employee e:findAll){
            System.out.print(e.getEmp_name()+":");
            System.out.print(e.getEmp_blood()+":");
            System.out.print(e.getEmp_state()+":");
            System.out.println(e.getEmp_email());
        }
    }

    /*
         测试保存方法
     */
    @Test
    public void test3()throws IOException{
        InputStream is= Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
        SqlSession session=factory.openSession();
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
        Employee e1=new Employee();
        e1.setEmp_no("000003");
        e1.setEmp_name("列宁主义");
        e1.setDept_id("102");
        mapper.saveEmp(e1);
        session.commit();
    }
    /*
       测试修改
     */
    @Test
    public void test4_updateEmp()throws IOException{
        InputStream is= Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
        SqlSession session=factory.openSession();
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
        Employee e1=new Employee();
        e1.setEmp_email("asdf@qq.com");
        e1.setEmp_name("高成本");
        e1.setEmp_no("000001");
       mapper.updateEmp(e1);
        session.commit();
    }
    /*
       测试删除
     */
    @Test
    public void test4_delEmp()throws IOException{
        InputStream is= Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
        SqlSession session=factory.openSession();
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);

        mapper.delEmp("HW7b87b2ac-69d3-48be-9a7f-49fcc7950944");
        session.commit();
    }
    /*
         根据ID查询
       */
    @Test
    public void test4_findbyEmp()throws IOException{
        InputStream is= Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
        SqlSession session=factory.openSession();
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);

        Employee byidEmp = mapper.findByidEmp("HW9801");
        System.out.println(byidEmp.getEmp_name());
    }

    /*
         模糊查询
       */
    @Test
    public void test5_findbylikeEmp()throws IOException{
        InputStream is= Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
        SqlSession session=factory.openSession();
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);

        List<Employee> a = mapper.findLikeEmp("%a39%");
        for(Employee e:a){
            System.out.println(e.getEmp_name());
        }
    }
    /*
        通过聚合函数获得总记录条数
      */
    @Test
    public void test6_getCountEmp()throws IOException{
        InputStream is= Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
        SqlSession session=factory.openSession();
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);

        int countEmp = mapper.getCountEmp();
        System.out.println(countEmp);

    }

}
