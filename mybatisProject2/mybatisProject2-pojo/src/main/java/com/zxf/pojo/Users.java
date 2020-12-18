package com.zxf.pojo;

import java.io.Serializable;
import java.util.List;

public class Users implements Serializable {
    private Integer userid;
    private String username;
    private String text;
    private Integer userage;

    private List<Role> roles;

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    private List<Account> accounts;

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUserage() {
        return userage;
    }

    public void setUserage(Integer userage) {
        this.userage = userage;
    }

    @Override
    public String toString() {

        return "Users{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", text='" + text + '\'' +
                ", userage=" + userage +
                ", accounts=" + accounts +
                '}';

    }
}
