package com.zxf.pojo;

import java.io.Serializable;

public class T1 implements Serializable {
    private int tid;
    private String tname;

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }
}
