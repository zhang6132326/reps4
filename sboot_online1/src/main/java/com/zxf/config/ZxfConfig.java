package com.zxf.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
/*
    统一配置类
 */
@Configuration
@PropertySource("classpath:pay1.properties")
public class ZxfConfig {

    @Value("${zhang.1}")
    private String z1;
    @Value("${zhang.2}")
    private String z2;
    @Value("${zhang.3}")
    private String z3;

    public String getZ1() {
        return z1;
    }

    public void setZ1(String z1) {
        this.z1 = z1;
    }

    public String getZ2() {
        return z2;
    }

    public void setZ2(String z2) {
        this.z2 = z2;
    }

    public String getZ3() {
        return z3;
    }

    public void setZ3(String z3) {
        this.z3 = z3;
    }
}
