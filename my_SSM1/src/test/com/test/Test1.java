package com.test;

import com.zxf.mapper.DeptMapper;
import com.zxf.mapper.EmployeeMapper;
import com.zxf.pojo.Dept;
import com.zxf.pojo.Employee;
import com.zxf.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.UUID;

@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class Test1 {
    @Autowired
    DeptMapper deptMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    EmployeeService employeeService;
    @Test
    //测试插入部门
    public void test1(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");

        Dept dept=new Dept();
          dept.setDept_id("110");
          dept.setDept_name("法务");
          dept.setDept_manager("HW9801");
         deptMapper.saveDept(dept);
    }
    //测试插入员工
    @Test
    public void test2(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        for(int i=1;i<3000;i++) {
            Employee employee = new Employee();
            String uid = UUID.randomUUID().toString();
            System.out.print(uid);
            employee.setEmp_no("ZF"+uid);
            employee.setEmp_name("赵"+uid+"林");
            employee.setDept_id("108");
            employee.setEmp_gender("女");
            employee.setEmp_email(uid+"@sohu.com");
            employee.setEmp_nation("苗族");
            employee.setEmp_marriage("已婚");
            employee.setEmp_health("考核");
            employee.setEmp_zzmm("在校");
            employee.setEmp_blood("A型");
            employee.setEmp_state("实习阶段");
            employeeMapper.saveEmp(employee);
        }
    }
    //查询员工信息表
    @Test
    public void test3(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        List<Employee> allEmp = employeeService.getAll();
          for(Employee e: allEmp){
              System.out.println(e.getEmp_health());
          }

    }

}
