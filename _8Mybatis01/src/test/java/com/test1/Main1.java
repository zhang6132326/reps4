package com.test1;

import com.zxf.mapper.DeptMapper;
import com.zxf.mapper.EmployeeMapper;
import com.zxf.mapper.FlowerMapper;
import com.zxf.pojo.Dept;
import com.zxf.pojo.Employee;
import com.zxf.pojo.Flower;
import jdk.internal.util.xml.impl.Input;
import oracle.jdbc.diagnostics.DemultiplexingLogHandler;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.validator.PublicClassValidator;
import sun.misc.resources.Messages_pt_BR;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main1 {
    @Test
    public void test1() throws IOException{
        InputStream is= Resources.getResourceAsStream("mybatis_config.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
        SqlSession session=factory.openSession();
        List<Employee> getAll = session.selectList("getAll");
        for(Employee e:getAll){
            System.out.println(e.getEmp_name());
        }
    }
    @Test
    public void test2()throws  IOException{
        InputStream is=Resources.getResourceAsStream("mybatis_config.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();
        Employee employee=session.selectOne("getByIdEmp","aaaaa");
        if(null!=employee) {
            System.out.println(employee.getEmp_name());
        }else {
            System.out.println("查无此人");
        }
    }
    @Test
    public void test3() throws IOException{
        InputStream is=Resources.getResourceAsStream("mybatis_config.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
        SqlSession session=factory.openSession();
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
        List<Employee> all = mapper.getAll();
        for(Employee e:all){
            System.out.println(e.getEmp_name());
        }
    }

    SqlSession sqlSession;
    @Before
    public void  init() throws IOException{
        InputStream is=Resources.getResourceAsStream("mybatis_config.xml");
        SqlSessionFactory sqlFactory=new SqlSessionFactoryBuilder().build(is);
        sqlSession=sqlFactory.openSession();
    }
    @After
    public void destory(){
        sqlSession.close();
    }
    @Test
    public void test4(){
        EmployeeMapper employeeMapper=sqlSession.getMapper(EmployeeMapper.class);
        List<Employee> all = employeeMapper.getAll();
        for(Employee e:all){
            System.out.println(e.getEmp_name());
        }
    }
    @Test
    public void test5(){
        FlowerMapper flowerMapper=sqlSession.getMapper(FlowerMapper.class);
        Flower flower=new Flower();
        flower.setName("乌苏画");
        flower.setProduction("中粮");
        flower.setPrice(12.32F);
        flowerMapper.addFlower(flower);
        System.out.println(flower.getId());
        sqlSession.commit();
    }
    @Test
    public void test6(){
        FlowerMapper flowerMapper=sqlSession.getMapper(FlowerMapper.class);
        Flower byId_nameFlower = flowerMapper.getById_nameFlower(11, "风信子");
        System.out.println(byId_nameFlower.getProduction());

    }
    @Test
    public void test7(){
        FlowerMapper flowerMapper=sqlSession.getMapper(FlowerMapper.class);
        Map map=new HashMap();
        map.put("id",11);
        map.put("name","风信子");
        Flower byId_nameFlower = flowerMapper.getByMapFlower(map);
        System.out.println(byId_nameFlower.getProduction());

    }
    @Test
    public void test8(){
        FlowerMapper flowerMapper=sqlSession.getMapper(FlowerMapper.class);
        List<Flower> allFlower = flowerMapper.getAllFlower();
        for(Flower f:allFlower){
            System.out.println(f.getProduction()+":"+f.getName()+":"+f.getPrice());
        }
    }
    @Test
    public void test9(){
        EmployeeMapper employeeMapper=sqlSession.getMapper(EmployeeMapper.class);
        Employee a01 = employeeMapper.getByIdEmp_dept("ZFfed39537-9aab-4385-a78d-0bfaf4f51a6d");
        System.out.println(a01.getEmp_name()+" "+a01.getDept().getDept_name());
    }
    @Test
    public void test10(){
        EmployeeMapper employeeMapper=sqlSession.getMapper(EmployeeMapper.class);
        Employee a01 = employeeMapper.getByidEmp_dept2("ZFf11c34b");
        System.out.println(a01.getEmp_name()+" "+a01.getDept().getDept_name());
    }
    /*
       一对多 根据部门查询员工
       用了延迟加载 2条SQL语句
     */
    @Test
    public void test11(){
        DeptMapper deptMapper=sqlSession.getMapper(DeptMapper.class);
        Dept deptById_emp = deptMapper.getDeptById_Emp("110");
        System.out.println(deptById_emp.getDept_name());

        List<Employee> employees = deptById_emp.getEmployees();
        for (Employee e:employees){
            System.out.println(e.getEmp_name());
        }
    }
    /*
        一条SQL左连接的语句
     */
    @Test
    public void test12(){
        DeptMapper deptMapper=sqlSession.getMapper(DeptMapper.class);
        Dept deptById_emp2 = deptMapper.getDeptById_Emp2("110");
        System.out.println(deptById_emp2.getDept_name());
        List<Employee> employees = deptById_emp2.getEmployees();
        for (Employee e:employees){
            System.out.println(e.getEmp_no()+"--->"+e.getEmp_name());
        }
    }
    /*
        动态SQL
     */
    @Test
    public void test13(){
        EmployeeMapper employeeMapper=sqlSession.getMapper(EmployeeMapper.class);
        Employee e=new Employee();
        e.setEmp_no(null);
        e.setEmp_name("%煮%");
        List<Employee> all2 = employeeMapper.getAll2(e);
        for(Employee es:all2){
            System.out.println(es.getEmp_name()+":"+es.getEmp_no());
        }
    }
    @Test
    public void test14(){
        EmployeeMapper employeeMapper=sqlSession.getMapper(EmployeeMapper.class);
        Employee e=new Employee();
       //  e.setEmp_no("%c%");
       //  e.setEmp_name("%心%");
        List<Employee> all3 = employeeMapper.getAll3(e);
        for(Employee ee:all3){
            System.out.println(ee.getEmp_name()+" "+ee.getEmp_no()+" "+ee.getEmp_gender());
        }
    }
    @Test
    public void test15(){
        EmployeeMapper employeeMapper=sqlSession.getMapper(EmployeeMapper.class);
        Employee e=new Employee();
        e.setEmp_no("6d2b72edcd21");
        e.setEmp_gender("男");
        e.setEmp_name("赵小平");
        employeeMapper.updateByIdEmp(e);
        sqlSession.commit();
    }
    @Test
    public void test16(){
        EmployeeMapper employeeMapper=sqlSession.getMapper(EmployeeMapper.class);
        List list_emp_no=new ArrayList();
          list_emp_no.add("5de1da243bcd");
        list_emp_no.add("6d2b72edcd21");
        list_emp_no.add("a036d860a5e9");
        list_emp_no.add("aaaaa");
        list_emp_no.add("a02");
        list_emp_no.add("a01");
        List<Employee> byidEmps = employeeMapper.getByidEmps(list_emp_no);
        for(Employee ee:byidEmps){
            System.out.println(ee.getEmp_name());
        }
    }
    @Test
    public void test17(){
        EmployeeMapper employeeMapper=sqlSession.getMapper(EmployeeMapper.class);
        Employee e1=new Employee();
          e1.setEmp_no("bbbb");
          e1.setEmp_name("zhang3");
          e1.setEmp_gender("男");
          e1.setDept_id("110");

        Employee e2=new Employee();
        e2.setEmp_no("bbbb2");
        e2.setEmp_name("zhang3");
        e2.setEmp_gender("男");
        e2.setDept_id("110");

          List<Employee> employees=new ArrayList<Employee>();
                  employees.add(e1);
                  employees.add(e2);
          employeeMapper.saveEmp(employees);
          sqlSession.commit();
    }
    @Test
    public void test18()throws Exception{
        EmployeeMapper employeeMapper=sqlSession.getMapper(EmployeeMapper.class);
        List<Employee> all3 = employeeMapper.getAll4();
        for(Employee e:all3){
            System.out.println(e.getEmp_name()+":"+e.getEmp_no());
        }

        List<Employee> all4 = employeeMapper.getAll4();
        for(Employee e:all4){
            System.out.println(e.getEmp_name()+"===>"+e.getEmp_no());
        }
    }
    @Test
    public void test19(){
        EmployeeMapper employeeMapper=sqlSession.getMapper(EmployeeMapper.class);
        Employee e1=new Employee();
        e1.setEmp_no("ccc22");
        e1.setEmp_name("zhang3");
        e1.setEmp_gender("男");
        e1.setDept_id("110");
        employeeMapper.saveEmp2(e1);
        sqlSession.commit();
    }
    /*
        测试二级缓存

     */
    @Test
    public void test20(){
        EmployeeMapper employeeMapper1=sqlSession.getMapper(EmployeeMapper.class);
        List<Employee> all_1 = employeeMapper1.getAll4();
        for(Employee e1:all_1){
            System.out.println(e1.getEmp_name());
        }
        sqlSession.close();
        EmployeeMapper employeeMapper2=sqlSession.getMapper(EmployeeMapper.class);
        List<Employee> all_2 = employeeMapper1.getAll4();
        for(Employee e2:all_2){
            System.out.println(e2.getEmp_name());
        }


    }
}
