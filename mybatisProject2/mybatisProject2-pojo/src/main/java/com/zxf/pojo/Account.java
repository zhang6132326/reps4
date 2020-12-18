package com.zxf.pojo;

import java.io.Serializable;

public class Account implements Serializable {
    private  Integer id;
    private  Integer uid;
    private  String accno;
    private  Integer password;
    private  Double  balance;
    private  String name;
    private Users user;

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", uid=" + uid +
                ", accno='" + accno + '\'' +
                ", password=" + password +
                ", balance=" + balance +
                ", name='" + name + '\'' +
                ", user=" + user +
                '}';
    }
}
