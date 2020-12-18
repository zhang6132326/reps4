package com.zxf.pojo;

import java.io.Serializable;
import java.util.List;

public class People implements Serializable {
    private Integer p_id;
    private String p_name;
    private Integer p_age;

    private List<Integer> p_ids;

    public List<Integer> getP_ids() {
        return p_ids;
    }

    public void setP_ids(List<Integer> p_ids) {
        this.p_ids = p_ids;
    }

    public Integer getP_id() {
        return p_id;
    }

    public void setP_id(Integer p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public Integer getP_age() {
        return p_age;
    }

    public void setP_age(Integer p_age) {
        this.p_age = p_age;
    }
}
