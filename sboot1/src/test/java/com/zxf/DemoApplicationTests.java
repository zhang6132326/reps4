package com.zxf;

import com.zxf.pojo.Dog;
import com.zxf.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private Dog dog;
    @Autowired
    private Person person;
    @Test
    void contextLoads() {
      //  System.out.println(dog.getAge()-10);
        System.out.println(person);
    }

}
