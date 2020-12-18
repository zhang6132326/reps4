package com.zxf.bean;

public class Bean1 {
    public Bean1() {
        System.out.println("com.zxf.bean.Bean1对象创建了");
    }

    public Bean1(String name) {
        this.name = name;
        System.out.println("Bean1中带有参数的构造方法Bean1(String name)--->"+name);
    }

    private String name;
    public void setName(String name) {
        this.name = name;
        System.out.println("setName()方法调用了--->"+name);
    }
    public void sayHello(){
        System.out.println("com.zxf.bean.Bean1.sayHello()方法运行了--->"+name);
    }

}
