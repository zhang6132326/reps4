package com.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

public class Test1 {
    @Test
    public void test1(){
        /*
            反向输出数组。
         */
        int[] arr={1,2,3,4,5,6};
        for (int min=0, max=arr.length-1;min<max;min++,max--) {
            int temp=arr[min];
            arr[min]=arr[max];
            arr[max]=temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
    @Test
    public void test2(){
        for (int i = 0; i < 9990; i++) {
            Random r=new Random();
            System.out.println(r.nextLong());
        }

    }
    @Test
    public void test3(){
        ArrayList<Integer> list=new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(100)+1);
        }
        System.out.println(list);

        ArrayList<Integer> list_2=new ArrayList<Integer>();
        for(Integer i:list){
            if(i%2==0){
                list_2.add(i);
            }
        }
        System.out.println(list_2);
    }
}