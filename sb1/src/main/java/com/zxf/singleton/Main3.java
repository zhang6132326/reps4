package com.zxf.singleton;

public class Main3 {
    public static void main(String[] args) {
          for(int i=0;i<4000;i++){
              new Thread(()->{
                  System.out.println(Mgr07.getInstance().hashCode());
              }).start();
          }
    }
}
