package com.zxf.pojo;



import java.io.Serializable;

public class Dept implements Serializable {
     private String dept_id;
     private String dept_name;
     private String dept_manager;

    public String getDept_id() {
        return dept_id;
    }

    public void setDept_id(String dept_id) {
        this.dept_id = dept_id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getDept_manager() {
        return dept_manager;
    }

    public void setDept_manager(String dept_manager) {
        this.dept_manager = dept_manager;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dept_id='" + dept_id + '\'' +
                ", dept_name='" + dept_name + '\'' +
                ", dept_manager='" + dept_manager + '\'' +
                '}';
    }
}
