package com.zxf.pojo;

import java.io.Serializable;
import java.util.List;

public class Teacher implements Serializable {
      private Integer id;
      private String name;

      private List<Student> stulist;

    public List<Student> getStulist() {
        return stulist;
    }

    public void setStulist(List<Student> stulist) {
        this.stulist = stulist;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
