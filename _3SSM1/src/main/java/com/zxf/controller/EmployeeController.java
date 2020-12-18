package com.zxf.controller;

import com.zxf.pojo.Employee;
import com.zxf.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/findall")
    public String findAll(Model model){
        System.out.println("Controller层的..findAll()");
        List<Employee> all = employeeService.findAll();
         model.addAttribute("list",all);
        return "list";
    }

}
