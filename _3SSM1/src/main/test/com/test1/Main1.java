package com.test1;
import com.zxf.pojo.Employee;
import com.zxf.service.EmployeeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main1 {
    @Test
    public void test1(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeService employeeService = ac.getBean("employeeService", EmployeeService.class);
        employeeService.findAll();
        employeeService.saveEmployee(new Employee());
    }
}