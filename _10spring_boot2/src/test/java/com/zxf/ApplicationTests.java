package com.zxf;

import com.zxf.pojo.Employee;
import com.zxf.pojo.Flower;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class ApplicationTests {
	@Autowired
    Employee employee;

	@Autowired
    Flower flower;

	@Autowired
    ApplicationContext ioc;

	@Test
	void contextLoads() {
       System.out.println(employee.getDept().getDept_name()+","+employee.getDept().getDept_id());
       System.out.println(employee.getAge()+","+employee.getBirth()+","+employee.getLists());
       System.out.println(employee.getName());
       System.out.println(employee.getSex());
       System.out.println(employee.getMaps());
       System.out.println("****************************");
       System.out.println(flower.getFaddress());
       System.out.println(flower.getFname()+","+(flower.getFprice()*1000));
	}
	@Test
    public void testService(){
        boolean myService1 = ioc.containsBean("myService222");
        System.out.println(myService1);

    }

}
