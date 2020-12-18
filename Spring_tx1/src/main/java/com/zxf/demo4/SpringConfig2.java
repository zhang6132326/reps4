package com.zxf.demo4;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig2 {
    @Bean(name = "dataSource")
    public DataSource createDataSource(){
        DruidDataSource dataSource=new DruidDataSource();
            dataSource.setDriverClassName("com.mysql.jdbc.Driver");
            dataSource.setUrl("jdbc:mysql://192.168.0.148:3306/test");
            dataSource.setUsername("root");
            dataSource.setPassword("xtfvmtd198154");
        return dataSource;
    }
}
