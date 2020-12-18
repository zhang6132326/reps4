package com.zxf.pojo;

import java.io.Serializable;

public class Dept implements Serializable {
    private String dept_name;
    private String dept_desc;

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getDept_desc() {
        return dept_desc;
    }

    public void setDept_desc(String dept_desc) {
        this.dept_desc = dept_desc;
    }
}
