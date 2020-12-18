package com.test1;

import com.zxf.mapper.EmployeeMapper;
import com.zxf.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class Main2 {
    @Test
    public void test1()throws Exception{
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","abc123");
        PreparedStatement pstm=con.prepareStatement("select * from emp");
        ResultSet rs=pstm.executeQuery();
        while (rs.next()){
            System.out.println(rs.getString("ENAME"));
        }

    }
    @Test
    public void test2() throws Exception{
        InputStream is= Resources.getResourceAsStream("mybatis_config.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
        SqlSession session1=factory.openSession();
        SqlSession session2=factory.openSession();
        EmployeeMapper mapper1 = session1.getMapper(EmployeeMapper.class);
        EmployeeMapper mapper2=session2.getMapper(EmployeeMapper.class);
        List<Employee> all_1 = mapper1.getAll4();

        for(Employee e:all_1){
            System.out.println(e.getEmp_name()+":"+e.getEmp_no());
        }
         session1.close();
        /*
            这里要记住一个地方，第二次查询必须要等第一次的session关闭以后才可以。
            否则二级缓存没有作用，依然还会执行二次select语句发送至数据库
         */
        List<Employee> all_2 = mapper2.getAll4();
        for(Employee e:all_2){
            System.out.println(e.getEmp_name()+"===>"+e.getEmp_no());
        }
         session2.close();

    }

}
