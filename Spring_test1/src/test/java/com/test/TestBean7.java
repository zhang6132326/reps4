package com.test;

import com.zxf.bean7.Employee;
import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import java.util.List;

public class TestBean7 {

    //写入数据

    @Test
    public void test1(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("Spring-jdbc.xml");
        JdbcTemplate jdbcTemplate=ac.getBean("jdbcTemplate",JdbcTemplate.class);

        jdbcTemplate.update(" insert into employee_basic (emp_no,emp_name,dept_id,emp_gender,emp_email,emp_nation,emp_marriage,emp_health,emp_zzmm,emp_blood,emp_state)\n" +
                "         VALUES\n" +
                "         ('aa11223','Z3F','106','男','qq@qq.com','胡族','未婚','一般','国民党','A型','退休') ");
    }
    //查询记录条数
    @Test
    public void test2(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("Spring-jdbc.xml");
        JdbcTemplate jdbcTemplate=ac.getBean("jdbcTemplate",JdbcTemplate.class);
        String sql="select count(*) from employee_basic";
        Integer count=jdbcTemplate.queryForObject(sql,Integer.class);
        System.out.println(count);
    }
    //查询所有
    @Test
    public  void test3(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("Spring-jdbc.xml");
        JdbcTemplate jdbcTemplate=ac.getBean("jdbcTemplate",JdbcTemplate.class);
        String sql="select * from employee_basic";
        RowMapper<Employee> employeeRowMapper=new BeanPropertyRowMapper<Employee>(Employee.class);
        List<Employee> employeeList = jdbcTemplate.query(sql, employeeRowMapper);
        for(Employee e:employeeList){
            System.out.print(e.getEmp_name());
            System.out.print(e.getEmp_gender());
            System.out.print(e.getEmp_health());
            System.out.print(e.getEmp_blood());
            System.out.print(e.getEmp_state());
            System.out.print(e.getEmp_nation());
            System.out.print(e.getEmp_marriage());
            System.out.print(e.getEmp_no());
            System.out.println(e.getEmp_email());
        }
    }
}
