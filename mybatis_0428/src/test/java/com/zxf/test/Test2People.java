package com.zxf.test;

import com.zxf.mapper.DeptMapper;
import com.zxf.mapper.EmployeeMapper;
import com.zxf.mapper.JobMapper;
import com.zxf.mapper.PeopleMapper;
import com.zxf.pojo.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Test2People {
    @Test
    public void test1_find()throws IOException{
        InputStream is= Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
        SqlSession session=factory.openSession();
        PeopleMapper mapper = session.getMapper(PeopleMapper.class);
        List<People> all = mapper.getAll();
        for(People p:all){
            System.out.print(p.getP_id()+" ");
            System.out.print(p.getP_age()+" ");
            System.out.println(p.getP_name());
        }
    }
    @Test
    public void test2_save()throws IOException{
        InputStream is= Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
        SqlSession session=factory.openSession();
        PeopleMapper mapper = session.getMapper(PeopleMapper.class);
        People p=new People();
           p.setP_age(23);
           p.setP_name("王老五");
           mapper.savePeople(p);
           session.commit();
    }
    @Test
    public void test3_findybPe()throws IOException{
        InputStream is= Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
        SqlSession session=factory.openSession();
        PeopleMapper mapper = session.getMapper(PeopleMapper.class);
        People p=new People();
        p.setP_name("%5%");
        p.setP_age(300);
        List<People> ps = mapper.findbyPe(p);
        for(People people:ps){
            System.out.print(people.getP_age()+" ");
            System.out.println(people.getP_name());
        }
    }
      /*
            一起查询多个员工ID
         */
    @Test
    public void test4_buids()throws IOException{
        InputStream is= Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
        SqlSession session=factory.openSession();
        PeopleMapper mapper = session.getMapper(PeopleMapper.class);
        People ps=new People();

        List<Integer> ls_id=new ArrayList<Integer>();

        ls_id.add(82);

        ls_id.add(83);
        ls_id.add(84);
        ls_id.add(85);
        ls_id.add(1);
        ls_id.add(2);
        ls_id.add(3);
        ls_id.add(19);

        ps.setP_ids(ls_id);
        List<People> peopleList = mapper.finByidS(ps);
        for(People p:peopleList){
            System.out.print(p.getP_id()+" ");
            System.out.println(p.getP_name());
        }
    }
    /*
        通过子类继承的方式完成多表查询
     */
    @Test
    public void test5_e_d()throws IOException{
        InputStream is= Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
        SqlSession session=factory.openSession();
        DeptMapper mapper = session.getMapper(DeptMapper.class);
        List<Emp_dept> emp_depts = mapper.getallE_D();
         //Emp_dept为子类，包含我们要的emp和dept表的信息
        for(Emp_dept ed:emp_depts){
            System.out.print(ed.getEmp_name()+" ");
            System.out.println(ed.getDept_name());
        }
    }
          //通过emp关联dept
    @Test
    public void test6_e_d()throws IOException{
        InputStream is= Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
        SqlSession session=factory.openSession();
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
        List<Employee> getallEmp_dep = mapper.getallEmp_dep();
        //Emp_dept为子类，包含我们要的emp和dept表的信息
        for(Employee ed:getallEmp_dep){
            System.out.print(ed.getEmp_name()+" ");
            System.out.print(ed.getEmp_email()+" ");
            System.out.print(ed.getEmp_state()+" ");
            System.out.print(ed.getEmp_blood()+" ");
            System.out.print(ed.getDept().getDept_id()+" ");
            System.out.println(ed.getDept().getDept_name());
        }
    }
     //通过dept关联emp
     @Test
     public void test7_e_d()throws IOException{
         InputStream is= Resources.getResourceAsStream("mybatis.xml");
         SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
         SqlSession session=factory.openSession();
         DeptMapper mapper = session.getMapper(DeptMapper.class);
         List<Dept> getall_dept_allemp = mapper.getall_dept_allemp();
         //Emp_dept为子类，包含我们要的emp和dept表的信息
         for(Dept d:getall_dept_allemp){
               System.out.print("《"+d.getDept_name()+"》");
             List<Employee> employees = d.getEmployees();
             for(Employee e:employees){
                 System.out.print(e.getEmp_name()+" ");
             }
             System.out.println();
         }
     }
     /*
          完成多对多查询 职务-->员工
      */
     @Test
    public void test8_j_e()throws IOException{
         InputStream is= Resources.getResourceAsStream("mybatis.xml");
         SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
         SqlSession session=factory.openSession();
         JobMapper mapper = session.getMapper(JobMapper.class);
         List<Job> jobs = mapper.getall_job_emp();
         for(Job j:jobs){
             if (j!=null)
             System.out.println("《"+j.getJob_name()+"》");
             List<Employee> employees = j.getEmployees();
             for (Employee e:employees){
                 System.out.print(e.getEmp_name()+" ");
             }
             System.out.println();
         }
     }
}
