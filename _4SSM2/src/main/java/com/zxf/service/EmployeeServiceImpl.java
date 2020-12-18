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
        return  employeeMapper.findAll();
    }

    public void saveEmployee(Employee employee) {
         employeeMapper.saveEmployee(employee);
    }

    public void delEmp(String emp_no) {
        employeeMapper.delEmp(emp_no);
    }

    public void updateEmp(Employee employee) {
        employeeMapper.updateEmp(employee);
    }
    public Employee findByIdEmp(String emp_no) {
        return employeeMapper.findByIdEmp(emp_no);
    }
}
