package com.zxf.bean;
/*
    yml属性文件的属性值映射到这个组件中

 */
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
@Component
@PropertySource(value = {"classpath:p1.properties"})
//@ConfigurationProperties(prefix = "person")//它必须读取全局配置文件，不能读取自（定义文件名）的配置文件。
/*
   还可以使用另外一种方式给属性赋值和设置值
   @Value
 */
public class Person {
    @Value("${person.last-name}") //依然读取属性文件的配置
    private String lastName;
    @Value("#{11-2}") //当前位置设置值，优先级高于配置文件 #{SpEL}表达式支持
    private Integer age;
    @Value("#{22==1}")
    private Boolean boss;
    private Date birth;
    private String  address;
    //由于maps是复杂数据类型，使用@Value不支持读取属性文件的该值属性。
    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", address='" + address + '\'' +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
