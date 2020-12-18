package com.zxf.singleton;

public enum Mgr08 {
    ASDBASDF;

    public static void main(String[] args) {

        for (int i=1;i<5000;i++){
            new Thread(()->{
                System.out.println(Mgr08.ASDBASDF.hashCode());
            }).start();
        }
    }
}
