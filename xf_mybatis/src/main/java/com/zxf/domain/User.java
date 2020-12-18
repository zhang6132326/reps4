package com.zxf.domain;

import java.util.Date;
import java.util.List;

public class User {
    private Integer id;
    private String name;
    private String pwd;
    private String head_img;
    private String phone;
    private Date create_time;

    /////////////////////////////
    private List<VideoOrder> videoOrderList;

    public List<VideoOrder> getVideoOrderList() {
        return videoOrderList;
    }

    public void setVideoOrderList(List<VideoOrder> videoOrderList) {
        this.videoOrderList = videoOrderList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getHead_img() {
        return head_img;
    }

    public void setHead_img(String head_img) {
        this.head_img = head_img;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", head_img='" + head_img + '\'' +
                ", phone='" + phone + '\'' +
                ", create_time=" + create_time +
                ", videoOrderList=" + videoOrderList +
                '}';
    }
}
