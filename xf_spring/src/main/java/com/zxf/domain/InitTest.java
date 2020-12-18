package com.zxf.domain;

public class InitTest {
    private Integer id;
    private String  title;

    public void init(){
        System.out.println("我是init初始化方法");
    }
    public void destory(){
        System.out.println("我是destory方法");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
