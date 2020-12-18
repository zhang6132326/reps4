package com.zxf.config;

import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@MapperScan("com.zxf.mapper")
public class MyConfig {
    /*
       乐观锁：
       我们在对数据进行添加的时候，会自动给一个version字段添加1
       我们在对该字段每次修个的时候都会对version字段累加1，这样我们就可以保证多用户修改同一个字段的时候数据的完整性。


       乐观锁插件
        没有这个插件 乐观锁无法实现
     */
    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor(){
        return new OptimisticLockerInterceptor();
    }
    /*
         分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }
    /*
        逻辑删除插件
     */
    @Bean
    public ISqlInjector sqlInjectorn(){
        return new LogicSqlInjector();
    }
    /*
         SQL  执行性能插件
         开发环境使用，上线以后就不要使用了
          dev:开发环境
          test:测试环境
          prod:生成环境


     */
    @Bean
    @Profile({"dev","test"})
    public PerformanceInterceptor performanceInterceptor(){
        PerformanceInterceptor performanceInterceptor=new PerformanceInterceptor();
        performanceInterceptor.setMaxTime(2700);//超过次毫秒数，会在日志有bug显示。但是操作数据库结果依然会执行
        performanceInterceptor.setFormat(true);//SQL是否格式化
        return performanceInterceptor;
    }
}
