package com.zxf.service;

import com.zxf.pojo.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> findAll();
    public void saveEmployee(Employee employee);
    public void delEmp(String emp_no);
    public void updateEmp(Employee employee);
    public Employee findByIdEmp(String emp_no);
}
