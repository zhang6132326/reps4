package com.zxf;

import com.zxf.mapper.FlowerMapper;
import com.zxf.mapper.UsersMapper;
import com.zxf.pojo.Account;
import com.zxf.pojo.Users;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class Test3 {

    private SqlSessionFactory sqlSessionFactory;
    private SqlSession session;
    private UsersMapper usersMapper;
    private InputStream is;
    @Before  //用于测试方法之前执行。
    public   void init() throws Exception{
        is= Resources.getResourceAsStream("zhangMyBatis.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        session=sqlSessionFactory.openSession();
        usersMapper=session.getMapper(UsersMapper.class);
    }
    @After  //用于测试方法之后执行。
    public void destory()throws Exception{
        session.commit();
        session.close();
        is.close();
    }

    @Test
    public void test1(){
        List<Users> all = usersMapper.findAll();
        for(Users u:all){
            System.out.println(u.getUsername());
        }
    }
    @Test
    public void test2(){
        List<Users> all = usersMapper.findAll_U_A();

        for(Users u:all){
            System.out.print(u.getUserid()+":"+u.getUsername());

            List<Account> all_acc=u.getAccounts();
            for( Account account:all_acc){
                System.out.print("---<"+account.getName()+","+account.getBalance()+">");
            }

       System.out.println();

            //  System.out.println(u.getAccounts());
        }
    }


}
