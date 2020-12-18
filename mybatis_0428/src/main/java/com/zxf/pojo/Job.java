package com.zxf.pojo;

import java.io.Serializable;
import java.util.List;

public class Job implements Serializable {
    private String job_id;
    private String job_name;
    private String job_task;

    private List<Employee> employees;

    public String getJob_id() {
        return job_id;
    }

    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

    public String getJob_name() {
        return job_name;
    }

    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }

    public String getJob_task() {
        return job_task;
    }

    public void setJob_task(String job_task) {
        this.job_task = job_task;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
