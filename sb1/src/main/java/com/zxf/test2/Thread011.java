package com.zxf.test2;
public class Thread011 {
    class Res{
        public String userName;
        private char sex;
        boolean flag=false;
    }
    class InputThread extends Thread{
        Res res;
        public InputThread(Res res){
            this.res=res;
        }
        @Override
        public void run() {
           int count=0;
           while (true) {
               synchronized (res) {
                   if(res.flag){
                       try{
                           res.wait();
                       }catch (Exception e){
                           e.printStackTrace();
                       }
                   }
                   if (count == 0) {
                       res.userName = "张三";
                       res.sex = '男';
                   } else {
                       res.userName = "王红";
                       res.sex = '女';
                   }
                   //负载均衡  轮训算法
                   res.flag=true;
                   res.notify();
                   count = (count + 1) % 2;
               }
           }
        }
    }
    class OutThread extends Thread{
        Res res;
        public OutThread(Res res){
            this.res=res;
        }
        @Override
        public void run() {
            while (true) {
                synchronized (res) {
                    if(!res.flag){
                        try{
                            if(!res.flag){
                                //释放锁，当前状态为阻塞状态。
                                res.wait();
                            }
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                    System.out.println(res.userName + "," + res.sex);
                    res.flag=false;
                    res.notify();
                }
            }
        }
    }
    public static void main(String[] args) {
          new Thread011().start();
    }
        public void start(){
            Res res=new Res();
            new InputThread(res).start();
            new OutThread(res).start();
        }
}