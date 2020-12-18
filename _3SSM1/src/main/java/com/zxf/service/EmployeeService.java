package com.zxf.service;

import com.zxf.pojo.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> findAll();
    public void saveEmployee(Employee employee);
}
