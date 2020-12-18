package com.example.myweb1;
import java.util.UUID;
public class Main1 {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
           String s=UUID.randomUUID().toString();
           System.out.println(s);
        }
    }
}