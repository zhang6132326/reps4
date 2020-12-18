package com.zxf.singleton;

public class Mgr03 {
    private static Mgr03 INSTANCE;
    private Mgr03(){}
    public static synchronized Mgr03 getInstance(){
        if(INSTANCE==null){
            try{
               Thread.sleep(1);
            }catch (Exception e){}
            INSTANCE=new Mgr03();
        }
        return INSTANCE;
    }

}
