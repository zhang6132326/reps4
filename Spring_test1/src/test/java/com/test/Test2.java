package com.test;

import com.zxf.bean.Bean2;
import com.zxf.bean2.Dept;
import com.zxf.bean2.Employee;
import org.junit.Test;
import org.junit.validator.PublicClassValidator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

public class Test2 {
    /*
        测试使用scope="singleton" 单例形式
     */
    @Test
    public void test1(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("Spring2.xml");
        Bean2 bean2_1 = ac.getBean("bean2", Bean2.class);
        Bean2 bean2_2 = ac.getBean("bean2", Bean2.class);
        System.out.println(bean2_1==bean2_2);
    }
    @Test
    public void test2(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("Spring3.xml");
        Dept dept = ac.getBean("dept", Dept.class);
        System.out.println(dept.getDept_id());
        System.out.println(dept.getDept_name());
        List<String> emp_list = dept.getEmp_list();
        for(String name:emp_list){
            System.out.print(name+" ");
        }
        System.out.println();
        List<Employee> employeeList = dept.getEmployeeList();
        for(Employee e:employeeList){
            System.out.print(e.getEmp_id()+" ");
            System.out.println(e.getEmp_name());
        }
        Map<String, String> maps = dept.getMaps();
         for(String s:maps.keySet()){
             System.out.print(s+" ");
             System.out.println(maps.get(s));
         }
    }
}
