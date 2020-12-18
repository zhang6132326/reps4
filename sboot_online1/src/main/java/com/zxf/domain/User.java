package com.zxf.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class User {
    private int id;
    private String username;
    //@JsonIgnore  //指定字段不返回，例如返回User对象的时候，该密码字段不返回，就要加上这个注解。
    private String pwd;
    public User() {
    }
    public User(int id, String username, String pwd) {
        this.id = id;
        this.username = username;
        this.pwd = pwd;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
