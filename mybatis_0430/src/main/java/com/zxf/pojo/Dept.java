package com.zxf.pojo;

import java.io.Serializable;
import java.util.List;

public class Dept implements Serializable {
    private String dept_id;
    private String dept_name;
    private String dept_manager;

    private List<Employee> employees;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

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
}
