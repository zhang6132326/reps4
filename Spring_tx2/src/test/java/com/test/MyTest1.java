package com.test;
import com.zxf.pojo.BeanMapper;
import com.zxf.pojo.T1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext_jdbc.xml")
public class MyTest1 {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void test1(){
        for(int i=0;i<10;i++) {
            jdbcTemplate.update("insert into t1(tname) values('aabbccddeeff')");
        }
    }
    @Test
    public void test2(){
        jdbcTemplate.update("update t1 set tname='我玩你看' where tid=5");
    }
    @Test
    public void test3(){
        jdbcTemplate.update("delete from t1 where tid=6 ");
    }
    @Test
    public void test4(){
        T1 t1 = jdbcTemplate.queryForObject("select * from t1 where tid=?", new BeanMapper(),10);
        System.out.println(t1.getTname());
    }
    @Test
    public void test5(){
        List<T1> query = jdbcTemplate.query("select * from t1 ", new BeanMapper());
        for(T1 t1:query){
            System.out.println(t1.getTname());
        }
    }
}
