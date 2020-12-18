package com.zxf.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Properties;

public class Student {
    private String  name;
    private int age;
    private Food food;
    private List<String> list;
    private Set<String> set;
    private Map<String,String>map;
    private String[] array;
    private Properties preferences;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public Properties getPreferences() {
        return preferences;
    }

    public void setPreferences(Properties preferences) {
        this.preferences = preferences;
    }
}
