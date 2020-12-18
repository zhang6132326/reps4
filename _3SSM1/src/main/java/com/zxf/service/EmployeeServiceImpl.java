package com.zxf.service;
import com.zxf.mapper.EmployeeMapper;
import com.zxf.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;
    public List<Employee> findAll() {
        System.out.println("Service....findAll()");
        return employeeMapper.findAll();
    }
    public void saveEmployee(Employee employee) {
        System.out.println("Service....saveEmployee()");
        employeeMapper.saveEmployee(employee);
    }
}
