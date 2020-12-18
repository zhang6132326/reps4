package com.zxf.ano.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component("video")
@Scope("prototype")//默认为单例，就是不写。这里设置为多例
public class Video {
    private int id;
    private String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
     @PostConstruct //初始化方法
    public void init(){
        System.out.println("video类 init..... 方法被调用");
    }
    @PreDestroy //销毁方法
    public void destory(){
        System.out.println("video类 destroy 方法被调用");
    }
}
