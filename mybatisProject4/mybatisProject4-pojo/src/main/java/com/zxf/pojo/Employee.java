package com.zxf.pojo;

import java.io.Serializable;
import java.util.List;

public class Employee implements Serializable {
    private String emp_no;
    private String emp_name;
    private String dept_id;
    private String emp_gender;
    private String emp_email;
    // 这里假定，员工和工作岗位（角色）是多对多的关系，
    // 每一个员工可有多于一个的工作岗位（角色），每个工作岗位（角色）可有多个员工
    private List<Job> jobs;

    public String getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(String emp_no) {
        this.emp_no = emp_no;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getDept_id() {
        return dept_id;
    }

    public void setDept_id(String dept_id) {
        this.dept_id = dept_id;
    }

    public String getEmp_gender() {
        return emp_gender;
    }

    public void setEmp_gender(String emp_gender) {
        this.emp_gender = emp_gender;
    }

    public String getEmp_email() {
        return emp_email;
    }

    public void setEmp_email(String emp_email) {
        this.emp_email = emp_email;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}
