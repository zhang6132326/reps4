package com.zxf.test;

import com.mysql.jdbc.EscapeTokenizer;
import org.junit.Test;

import javax.swing.text.Style;
import java.security.Permission;
import java.util.*;

public class Test6 {
    @Test
    public void test1(){
        ArrayList<Integer> i1=new ArrayList<Integer>();
            i1.add(23);
            i1.add(-3);
            i1.add(9812);
        ArrayList<String> s1=new ArrayList<String>();
        ArrayList<Number> s2=new ArrayList<Number>();
        s2.add(23);

        s1.add("abc");
        s1.add("zhang");
        printArray(i1);
        printArray(s1);


    }
    public static void printArray(List<?> list){
        System.out.println(list);

    }
    @Test
    public void test2(){
        ArrayList<String> poker=new ArrayList<String>();
        String[] colors={"♠","♥","♣","♦"};
        String[] numbers={"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        poker.add("大王");
        poker.add("小王");
        for(String number:numbers){
            for(String color:colors){
//                System.out.print(color+number+" ");
               poker.add(color+number+" ");
            }
        }
        Collections.shuffle(poker);  //随机打乱
        System.out.println(poker);
          //定义3个玩家
        ArrayList<String> p1=new ArrayList<String>();
        ArrayList<String> p2=new ArrayList<String>();
        ArrayList<String> p3=new ArrayList<String>();
        //底牌
        ArrayList<String> dipai=new ArrayList<String>();

        for(int i=0;i<poker.size();i++){
            String p=poker.get(i);
            if(i>=51){
                dipai.add(p);
            }else if(i%3==0){
                p1.add(p);
            }else if(i%3==1){
                p2.add(p);
            }else if(i%3==2){
                p3.add(p);
            }
        }
        System.out.println("p1:"+p1);
        System.out.println("p2:"+p2);
        System.out.println("p3:"+p3);
        System.out.println("底牌:"+dipai);

    }
    @Test
    public void test3(){
        Set<String> s1=new HashSet<String>();
        s1.add("zhang");
        s1.add("zhang");
        s1.add("zhang");
        s1.add("aue");
        s1.add("feng");
        s1.add("java");
        s1.add("24bsp");
        for(String ss:s1){
            System.out.println(ss);
        }
        System.out.println("(*************");
        Iterator<String> iterator=s1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
    @Test
    public void test4(){
        System.out.println("通话".hashCode());
        System.out.println("重地".hashCode());
        System.out.println("校长".hashCode());
        System.out.println("目录".hashCode());
        add(2,345,56,65,76,76,1);
    }

    public static void  add(int ... c){
              for(int r:c){
                  System.out.println(r);
              }
    }
}
