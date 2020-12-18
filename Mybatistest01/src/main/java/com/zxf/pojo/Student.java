package com.zxf.pojo;

import java.io.Serializable;


class Person{
    private int age;
    private String name;


}

public class Student implements Serializable {
    private int stu_id;
    private String stu_name;
    private int stu_age;
    private int sut_tid_id;

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public int getStu_age() {
        return stu_age;
    }

    public void setStu_age(int stu_age) {
        this.stu_age = stu_age;
    }

    public int getSut_tid_id() {
        return sut_tid_id;
    }

    public void setSut_tid_id(int sut_tid_id) {
        this.sut_tid_id = sut_tid_id;
    }
}
