package com.zxf.main;

import java.util.ArrayList;

class User{
    private String name; //姓名
    private int money;   //余额，也就是当前用户拥有的钱数。
    public User(){}

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }
    //展示一下当前用户有多少钱。
    public void show(){
        System.out.println("我是:"+name+"-->余额:"+money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}



public class Main1 {
    public static void main(String[] args){
        Manager manager=new Manager("群主",800);

        Member member1=new Member("成员A",0);
        Member member2=new Member("成员B",0);
        Member member3=new Member("成员C",0);
        Member member4=new Member("成员D",0);
        Member member5=new Member("成员E",0);
        Member member6=new Member("成员F",0);
        Member member7=new Member("成员G",0);

        manager.show();
        member1.show();
        member2.show();
        member3.show();
        member4.show();
        member5.show();
        member6.show();
        member7.show();
        System.out.println("========================================");
        //把10元钱分成了7份。
        ArrayList<Integer> redList=manager.send(96,7);

        member1.receive(redList);
        member2.receive(redList);
        member3.receive(redList);
        member4.receive(redList);
        member5.receive(redList);
        member6.receive(redList);
        member7.receive(redList);






        manager.show();
        member1.show();
        member2.show();
        member3.show();
        member4.show();
        member5.show();
        member6.show();
        member7.show();

    }
}
