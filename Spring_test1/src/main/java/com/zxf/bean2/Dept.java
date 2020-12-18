package com.zxf.bean2;

import java.util.List;
import java.util.Map;

public class Dept {
    private String dept_id;
    private String dept_name;
    private List<String> emp_list;
    private List<com.zxf.bean2.Employee> employeeList;
    private Map<String,String> maps;

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public List<com.zxf.bean2.Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<com.zxf.bean2.Employee> employeeList) {
        this.employeeList = employeeList;
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

    public List<String> getEmp_list() {
        return emp_list;
    }

    public void setEmp_list(List<String> emp_list) {
        this.emp_list = emp_list;
    }
}
