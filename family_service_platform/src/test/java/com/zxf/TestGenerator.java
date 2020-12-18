package com.zxf;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.jupiter.api.Test;

public class TestGenerator {
  //  @Test
    public void testGenerator(){
        AutoGenerator autoGenerator=new AutoGenerator();
        //全局配置
        GlobalConfig globalConfig=new GlobalConfig();
        globalConfig.setAuthor("zxf").setOutputDir("H:\\IDEA_work_2020\\family_service_platform\\src\\main\\java")
                .setFileOverride(true)
                .setIdType(IdType.AUTO)
                .setServiceName("%sService")
                .setBaseResultMap(true)
                .setBaseColumnList(true)
                .setControllerName("%sController");
        //配置数据源
        DataSourceConfig dataSourceConfig=new DataSourceConfig();
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver").setUrl("jdbc:mysql://192.168.0.89:3306/family_service_platform")
                .setUsername("root")
                .setPassword("xtfvmtd198154");
        //策略配置
        StrategyConfig strategyConfig=new StrategyConfig();
        strategyConfig.setCapitalMode(true)//设置全局大写命名
        .setNaming(NamingStrategy.underline_to_camel)//数据库表映射到实体的命名策略
        .setInclude();
        //包名配置
        PackageConfig packageConfig=new PackageConfig();
        packageConfig.setParent("com.zxf").setMapper("mapper")
                .setService("service").setController("controller")
                .setEntity("bean").setXml("mapper");
        autoGenerator.setGlobalConfig(globalConfig)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(packageConfig);
         autoGenerator.execute();


    }
    @Test
    public void test2(){

    }

}
