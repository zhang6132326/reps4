package com.zxf.controller;
import com.zxf.pojo.Employee;
import com.zxf.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Employee> all = employeeService.findAll();
        model.addAttribute("list",all);
        return "list";
    }
    @RequestMapping("/saveEmp")
    public String saveEmp(Employee employee){
        employeeService.saveEmployee(employee);

        return "redirect:/emp/findAll";
    }
    @RequestMapping("/delemp")
    public String delEmp(String emp_no){
        employeeService.delEmp(emp_no);
        return "redirect:/emp/findAll";
    }

    @RequestMapping("/findByIdEmp")
    public String findByIdEmp(Model model,String emp_no){
        Employee byIdEmp = employeeService.findByIdEmp(emp_no);
        model.addAttribute("empID",byIdEmp);
        return "updateEmp";
    }

    @RequestMapping("/updateEmp")
    public String updateEmp(Employee employee){
        employeeService.updateEmp(employee);
        return "redirect:/emp/findAll";
    }
    @RequestMapping("/b1")
    public String b1(Model mv){
        String uuid= UUID.randomUUID().toString();
        Integer i1=9;
        Integer i2=11;
        Integer i3=18;
        Integer i4=2;
        Integer i5=15;
        Integer i6=20;
        mv.addAttribute("m",uuid);
        mv.addAttribute("i1",i1);
        mv.addAttribute("i2",i2);
        mv.addAttribute("i3",i3);
        mv.addAttribute("i4",i4);
        mv.addAttribute("i5",i5);
        mv.addAttribute("i6",i6);
        return "bt1";
    }
    @RequestMapping("/b2")
    public String b2(){
        return "bt2";
    }
    @RequestMapping("/b3")
    public String b3(){
        return "bt3";
    }
    @RequestMapping("/b4")
    public String b4(){
        return "bt4";
    }
    @RequestMapping("/b5")
    public String b5(){
        return "bt5";
    }
    @RequestMapping("/b6")
    public String b6(){
        return "bt6";
    }
    @RequestMapping("/b7")
    public String b7(){
        return "bt7_index";
    }
    @RequestMapping("/b8")
    public String b8(){
        return "bt8";
    }
    /*
        用户列表页面
     */
    @RequestMapping("/userlist")
    public String userlist(){
        return "user_list";
    }
    /*
        用户搜索页面
     */
    @RequestMapping("/userselect")
    public String userselect(){
         return "user_select";
    }
}