package com.zxf.test;
import java.util.Arrays;
public class Main1 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            System.out.println(i);
        }
        int a=2;
        int b=4;
        int c=6;
        int[] arr=new int[4];
        arr[0]=-1;
        arr[1]=-2;
        arr[2]=200;
        arr[3]=-3;
        Arrays.toString(arr);
        int d=eat();
        System.out.println(d);
    }
    private static int eat(){
        System.out.println("11111");
        System.out.println("22222");
        System.out.println("33333");
        System.out.println("44444");
        System.out.println("55555");
        return 10;
    }
}