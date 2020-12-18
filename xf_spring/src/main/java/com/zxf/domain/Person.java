package com.zxf.domain;

public class Person {
    private Integer pid;
    private String pname;
    public Person(){
        System.out.println("Person()默认的构造方法");
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        System.out.println("执行了setPname()方法");
        this.pname = pname;
    }
}
