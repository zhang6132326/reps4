package com.zxf.test;
import com.zxf.mapper.EmployeeMapper;
import com.zxf.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test2 {
    private InputStream inputStream=null;
    private SqlSession session=null;
    private EmployeeMapper mapper=null;
    @Before //Test方法之前执行,都是junit提供的方法
    public void init()throws IOException{
//加载主配置文件
        inputStream= Resources.getResourceAsStream("mybatisConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        //通过工厂获取SqlSession
        session=factory.openSession();
        mapper = session.getMapper(EmployeeMapper.class);
    }
    @After//Test方法之后执行,都是junit提供的方法
    public void destory()throws IOException{

        session.close();
        inputStream.close();

    }
    @Test
    //测试public Employee findEmpByid(String emp_no);
    public void test1()throws IOException{
        //加载主配置文件
        Employee e = mapper.findEmpByid("HW9802");
        System.out.print(e.getEmp_no()+" ");
        System.out.print(e.getEmp_name()+" ");
        System.out.print(e.getDept_id()+" ");
        System.out.print(e.getEmp_gender()+" ");
        System.out.print(e.getEmp_marriage()+" ");
        System.out.print(e.getEmp_email()+" ");
        System.out.print(e.getEmp_blood()+" ");
        System.out.print(e.getEmp_zzmm()+" ");
        System.out.print(e.getEmp_nation()+" ");
        System.out.println(e.getEmp_state());
    }
    //测试 public int saveEmp(Employee employee);
    @Test
    public void test2()throws IOException{
        Employee employee=new Employee();
        employee.setEmp_no("test04");
        employee.setEmp_name("张兰");
        employee.setDept_id("100");
        employee.setEmp_gender("男");
        employee.setEmp_email("xlkads@sohu.com");
        employee.setEmp_nation("民族");
        employee.setEmp_marriage("没结婚");
        employee.setEmp_health("不咋样");
        employee.setEmp_zzmm("老百姓");
        employee.setEmp_blood("熊猫血");
        employee.setEmp_state("去世了");
       int i= mapper.saveEmp(employee);
        session.commit(); //提交事务
        System.out.println(employee.getEmp_no());
    }
    //测试 public int updateEmp(Employee employee);
    @Test
    public void test3(){
        Employee employee=new Employee();
        employee.setEmp_no("test04");
        employee.setEmp_name("张兰1");
        employee.setDept_id("a00");
        employee.setEmp_gender("男1");
        employee.setEmp_email("xlkads@sohu.com1");
        employee.setEmp_nation("民族1");
        employee.setEmp_marriage("没结婚1");
        employee.setEmp_health("不咋样1");
        employee.setEmp_zzmm("老百姓1");
        employee.setEmp_blood("熊猫血1");
        employee.setEmp_state("去世了1");
       int i=mapper.updateEmp(employee);
        session.commit();
    }
    //测试  public void delEmp(String emp_no);
    @Test
    public void test4(){

        mapper.delEmp("test03");
        session.commit();
    }
    //测试  public List<Employee>findEmpByname(String emp_name);
    //这里要注意mapper接口中配置文件是否要求我们这里写%通配符
    /*
     findEmpByname("%张%"); 如果mapper接口配置文件用的是like #{emp_name} 需要加入通配符
     findEmpByname("张");   如果mapper接口配置文件用的是like '%${value}%' 不需要加入通配符
     */
        @Test
    public void test5(){
        List<Employee> employees = mapper.findEmpByname("张");
        for (Employee e:employees){
            System.out.println(e.getEmp_name());
        }
    }
    //测试   public int getCount();
    @Test
    public void test6(){
       int employees = mapper.getCount();
       System.out.println(employees);
    }
}