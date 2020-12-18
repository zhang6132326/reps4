package com.test1;

import org.junit.Test;


import java.io.*;






    class Sheep1 implements Cloneable {
        private String name;
        private int age;
        private String color;
        /*
              因为使用了克隆技术；这里面增加的属性，在toString中加入后，客户端调用该对象的，可以无需修改代码，可以直接使用。
         */
        private String address = "蒙古羊";

        public Sheep1 friend;  //对象属性

        public Sheep1() {
        }

        public Sheep1(String name, int age, String color) {
            this.name = name;
            this.age = age;
            this.color = color;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        protected Object clone() {
            Sheep1 sheep1 = null;
            try {
                sheep1 = (Sheep1) super.clone();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return sheep1;
        }

        @Override
        public String toString() {
            return "Sheep1{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", color='" + color + '\'' +
                    ", address='" + address + '\'' +
                    '}';
        }
    }


    public class Main1 {


        @Test
        public void test1() {
            Sheep1 sheep1 = new Sheep1("tom", 123, "白色");
            Sheep1 sheep2 = (Sheep1) sheep1.clone();
            Sheep1 sheep3 = (Sheep1) sheep1.clone();
            Sheep1 sheep4 = (Sheep1) sheep1.clone();
            Sheep1 sheep5 = (Sheep1) sheep1.clone();
            Sheep1 sheep6 = (Sheep1) sheep1.clone();
            System.out.println(sheep1);
            System.out.println(sheep2);
            System.out.println(sheep3);
            System.out.println(sheep4);
            System.out.println(sheep5);
            System.out.println(sheep6);
        }

        @Test
        public void test2() {
            Sheep1 sheep1 = new Sheep1("tom", 123, "白色");
            sheep1.friend = new Sheep1("Jerry", -23, "黑色");

            Sheep1 sheep2 = (Sheep1) sheep1.clone();
            Sheep1 sheep3 = (Sheep1) sheep1.clone();
            Sheep1 sheep4 = (Sheep1) sheep1.clone();
            Sheep1 sheep5 = (Sheep1) sheep1.clone();
            Sheep1 sheep6 = (Sheep1) sheep1.clone();
            System.out.println(sheep1 + "," + sheep1.friend.hashCode());
            System.out.println(sheep2 + "," + sheep2.friend.hashCode());
            System.out.println(sheep3 + "," + sheep3.friend.hashCode());
            System.out.println(sheep4 + "," + sheep4.friend.hashCode());
            System.out.println(sheep5 + "," + sheep5.friend.hashCode());
            System.out.println(sheep6 + "," + sheep6.friend.hashCode());
        }

        @Test
        public void test3() throws Exception {
            DeepProtoType p = new DeepProtoType();
            p.name = "zhang3";
            p.deepCloneableTarget = new DeepCloneableTarget("大牛", "大牛的类");
            // 方式1 完成深层拷贝
            DeepProtoType p2 = (DeepProtoType) p.clone();
            System.out.println(p.name + ":" + p.deepCloneableTarget.hashCode());
            System.out.println(p2.name + ":" + p2.deepCloneableTarget.hashCode());
        }
        @Test
        public void test4() throws Exception {
            DeepProtoType p = new DeepProtoType();
            p.name = "zhang3";
            p.deepCloneableTarget = new DeepCloneableTarget("大牛", "大牛的类");
            // 方式1 完成深层拷贝
            DeepProtoType p2 = (DeepProtoType) p.deepClone();
            System.out.println(p.name + ":" + p.deepCloneableTarget.hashCode());
            System.out.println(p2.name + ":" + p2.deepCloneableTarget.hashCode());
        }


    }

