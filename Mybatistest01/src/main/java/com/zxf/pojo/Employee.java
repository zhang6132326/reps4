package com.zxf.pojo;
import java.io.Serializable;
import java.util.List;
public class Employee implements Serializable {
    private String emp_no;
    private String emp_name;
    private String dept_id;
    private String emp_gender;
    private String emp_marriage;
    private String emp_health;
    private String emp_email;
    private String emp_nation;
    private String emp_zzmm;
    private String emp_blood;
    private String emp_state;

    private List<String> depts_id;

    //员工基本情况表和部门信息表是多对一的关系，每一个员工只归属一个部门
    private Dept dept;

    // 这里假定，员工和工作岗位（角色）是多对多的关系，
    // 每一个员工可有多于一个的工作岗位（角色），每个工作岗位（角色）可有多个员工
    private List<Job> jobs;

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    //员工基本情况表和员工学历表是一对一的关系，每一个员工有且只有一份学历表
    private EmployeeSchool employeeSchool;

    public EmployeeSchool getEmployeeSchool() {
        return employeeSchool;
    }

    public void setEmployeeSchool(EmployeeSchool employeeSchool) {
        this.employeeSchool = employeeSchool;
    }

    public List<String> getDepts_id() {
        return depts_id;
    }

    public void setDepts_id(List<String> depts_id) {
        this.depts_id = depts_id;
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

    public String getEmp_marriage() {
        return emp_marriage;
    }

    public void setEmp_marriage(String emp_marriage) {
        this.emp_marriage = emp_marriage;
    }

    public String getEmp_health() {
        return emp_health;
    }

    public void setEmp_health(String emp_health) {
        this.emp_health = emp_health;
    }

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

    public String getEmp_email() {
        return emp_email;
    }

    public void setEmp_email(String emp_email) {
        this.emp_email = emp_email;
    }

    public String getEmp_nation() {
        return emp_nation;
    }

    public void setEmp_nation(String emp_nation) {
        this.emp_nation = emp_nation;
    }

    public String getEmp_zzmm() {
        return emp_zzmm;
    }

    public void setEmp_zzmm(String emp_zzmm) {
        this.emp_zzmm = emp_zzmm;
    }

    public String getEmp_blood() {
        return emp_blood;
    }

    public void setEmp_blood(String emp_blood) {
        this.emp_blood = emp_blood;
    }

    public String getEmp_state() {
        return emp_state;
    }

    public void setEmp_state(String emp_state) {
        this.emp_state = emp_state;
    }
}