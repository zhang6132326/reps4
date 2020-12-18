package com.zxf.pojo;

public class Emp_dept extends Employee {
    private String dept_name;
    private String dept_manager;

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
}
