package com.zxf.bean5;
import org.springframework.stereotype.Component;
@Component //注解方式定义一个类似bean对象标签
public class MathImpl implements MathI {
    public int add(int i, int j) {

        return i+j;
    }
    public int mul(int i, int j) {

        return i*j;
    }
}
