package com.zxf;

import com.zxf.mapper.RoleMapper;
import com.zxf.pojo.Role;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class Test4 {
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession session;
    private RoleMapper roleMapper;
    private InputStream is;
    @Before  //用于测试方法之前执行。
    public   void init() throws Exception{
        is= Resources.getResourceAsStream("zhangMyBatis.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        session=sqlSessionFactory.openSession();
        roleMapper=session.getMapper(RoleMapper.class);
    }
    @After  //用于测试方法之后执行。
    public void destory()throws Exception{
        session.commit();
        session.close();
        is.close();
    }

    @Test
    public void test1(){
        List<Role> roles = roleMapper.finAll();
        for(Role role:roles){
            System.out.println(role.getRole_name()+","+role.getRole_desc());
        }
    }

    @Test
    public void test2(){
        List<Role> roles = roleMapper.finall_u_r();
        for(Role role:roles){
            System.out.println(role.getRole_name()+role.getRole_desc());
            System.out.println(role.getUsers());
        }
    }
}
