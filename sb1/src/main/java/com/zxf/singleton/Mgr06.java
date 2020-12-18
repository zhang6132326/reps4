package com.zxf.singleton;

public class Mgr06 {
    private static Mgr06 INSTANCE;
    private Mgr06(){}
    public static Mgr06 getInstance(){
        if(INSTANCE==null){
            synchronized (Mgr06.class){
                if(INSTANCE==null){
                    try {
                        Thread.sleep(23);
                    }catch (Exception e){}
                    INSTANCE=new Mgr06();
                }
            }
        }
        return INSTANCE;
    }
}
