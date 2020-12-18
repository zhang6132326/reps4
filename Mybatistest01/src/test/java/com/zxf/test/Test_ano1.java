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

/*
     注解方式
 */
public class Test_ano1 {
    @Test
    public void  test1()throws IOException{
        InputStream inputStream= Resources.getResourceAsStream("mybatisConfig_ano.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
        List<Employee> all_ano_emp = mapper.findAll_ano_emp();
        for(Employee e:all_ano_emp){
            System.out.print(e.getEmp_name()+" ");
            System.out.print(e.getEmp_state()+" ");
            System.out.print(e.getEmp_email()+" ");
            System.out.println(e.getEmp_zzmm());
        }
        session.close();
        inputStream.close();
    }
    @Test
    public void  test2()throws IOException{
        InputStream inputStream= Resources.getResourceAsStream("mybatisConfig_ano.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
        Employee mapperByid_ano = mapper.findByid_ano("HW9801");
        System.out.print(mapperByid_ano.getEmp_name()+" ");
        System.out.print(mapperByid_ano.getEmp_health()+" ");
    }
    @Test
    public void  test3()throws IOException{
        InputStream inputStream= Resources.getResourceAsStream("mybatisConfig_ano.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
        Employee e1=new Employee();
        e1.setEmp_no("test");
        e1.setDept_id("100");
        e1.setEmp_email("zhang@qq.com");
        e1.setEmp_name("张文露");
        e1.setEmp_nation("良好");
          mapper.save_emp_ano(e1);
          session.commit();
    }
    @Test
    public void  test4()throws IOException{
        InputStream inputStream= Resources.getResourceAsStream("mybatisConfig_ano.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
        Employee e1=new Employee();
        e1.setEmp_name("王家瑞");
        e1.setEmp_no("test");
        mapper.update_emp_ano(e1);
        session.commit();
    }
    @Test
    public void  test5()throws IOException{
        InputStream inputStream= Resources.getResourceAsStream("mybatisConfig_ano.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
           mapper.del_emp_ano("test");
        session.commit();
    }
    @Test
    public void  test6()throws IOException{
        InputStream inputStream= Resources.getResourceAsStream("mybatisConfig_ano.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
        List<Employee> like_emp_nao = mapper.findLike_emp_nao("%王%");
        for(Employee e:like_emp_nao){
            System.out.println(e.getEmp_name());

        }
    }

}
