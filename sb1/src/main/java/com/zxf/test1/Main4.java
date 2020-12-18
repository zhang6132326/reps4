package com.zxf.test1;
class Singleton04{
    private static Singleton04 singleton04;
    private Singleton04(){}
    public static Singleton04 getInstance() {
        if (singleton04 == null) {
            synchronized (Singleton04.class) {
                if (singleton04 == null)
                    singleton04 = new Singleton04();
            }
        }
            return singleton04;

    }
}
public class Main4 {
    public static void main(String[] args) {
        Singleton04 in1=Singleton04.getInstance();
        Singleton04 in2=Singleton04.getInstance();
        System.out.println(in1==in2);

    }
}
