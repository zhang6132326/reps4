package com.zxf.pojo;

import java.util.Date;

public class MyIp {
    private int id;
    private String ip_address;
    private Date ip_date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    public Date getIp_date() {
        return ip_date;
    }

    public void setIp_date(Date ip_date) {
        this.ip_date = ip_date;
    }
}
