package com.zxf.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
/*
     也可以单独给某个pojo类配置独立的属性文件
 */
@PropertySource(value = {"classpath:flower.properties"})
@Component
@ConfigurationProperties(prefix = "flower")
public class Flower {
    private String fname;
    private String faddress;
    private Float  fprice;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFaddress() {
        return faddress;
    }

    public void setFaddress(String faddress) {
        this.faddress = faddress;
    }

    public Float getFprice() {
        return fprice;
    }

    public void setFprice(Float fprice) {
        this.fprice = fprice;
    }
}
