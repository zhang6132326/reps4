package com.zxf.controller;
import com.zxf.exception.SysException;
import com.zxf.pojo.Dept;
import com.zxf.pojo.Emp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.sql.*;
import java.util.UUID;
@Controller
@RequestMapping("zhang")
public class MyController1 {
    @RequestMapping("ok1")
    public String bean1() {
        System.out.println("ok1...");
        return "success";
    }

    @RequestMapping("ok2")
    public String bean2(String name, int age) {
        System.out.println("ok1..." + name + "," + age);
        String nams = name + ";";
        int ages = age - 892;
        System.out.println(nams + "  " + ages);
        return "success";
    }

    @RequestMapping("ok3")
    public String bean3(Emp emp) {
        System.out.print(emp.getDept().getDept_name() + " ");
        System.out.print(emp.getDept().getDept_desc() + " ");
        System.out.print(emp.getName() + " ");
        System.out.println(emp.getEmai() + " ");
        return "success";
    }

    @RequestMapping("ok4")
    public String bean4(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(request);
        HttpSession session = request.getSession();
        System.out.println(session);
        ServletContext servletContext = session.getServletContext();
        System.out.println(servletContext);
        System.out.println(response);
        return "success";
    }

    @RequestMapping("ok5")
    public String bean5(@RequestParam(name = "ns") String usernmae) {
        System.out.println(usernmae);
        return "success";
    }

    @RequestMapping("ok6")
    public String bean6(@RequestBody String body) {
        System.out.println(body);
        return "success";
    }

    @RequestMapping("ok7/{emp_id}")
    public String bean7(@PathVariable(name = "emp_id") String id) {
        System.out.println(id);
        return "success";
    }

    @RequestMapping("ok8")
    public String bean8(Model model) {

        Dept dept = new Dept();
        dept.setDept_name("java");
        dept.setDept_desc("软件开发");
        model.addAttribute("dept", dept);
        return "success1";
    }
    @RequestMapping("ok9")
    public ModelAndView bean9() {
        ModelAndView mv = new ModelAndView();
        Dept dept = new Dept();
        dept.setDept_name("java");
        dept.setDept_desc("软件开发");
        mv.addObject("dept", dept);
        mv.setViewName("success1");
        return mv;
    }
    @RequestMapping("ok10")
    public @ResponseBody
    Dept testAjax(@RequestBody Dept dept) {
        System.out.println("testAjax执行了");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.0.148:3306/test", "root", "xtfvmtd198154");
            PreparedStatement pstm = conn.prepareStatement("select * from dept where dept_id=101");
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                dept.setDept_name(rs.getString("dept_name"));
                dept.setDept_desc(rs.getString("dept_manager"));
                System.out.println(rs.getString("dept_name"));

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return dept;
    }
    @RequestMapping("ok11")
    public String  bean11(HttpServletRequest request,MultipartFile upload)throws Exception{
        String path=request.getSession().getServletContext().getRealPath("/uploads/");
        File file=new File(path);
        if(!file.exists()){
            file.mkdirs();
        }
        String filename=upload.getOriginalFilename();
        String uuid= UUID.randomUUID().toString().replace("-","");
        filename=uuid+"_"+filename;
        upload.transferTo(new File(path,filename));
        return "success1";
    }
    @RequestMapping("ok12")
    public String bean12() throws SysException{
        try{
            int a=23/0;
        }catch (Exception e){
            e.printStackTrace();
            throw new SysException("bean12()方法出现异常了");
        }
        return "success";
    }
}
