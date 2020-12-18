package com.zxf.zookpeer;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.util.concurrent.CountDownLatch;

public class ZookperConnection {
    public static void main(String[] args) {
        try{
            final CountDownLatch countDownLatch=new CountDownLatch(1);
            ZooKeeper zooKeeper=new ZooKeeper("192.168.0.226:2181", 5000, new Watcher() {
                public void process(WatchedEvent event) {
                     if(event.getState()==Event.KeeperState.SyncConnected){
                         System.out.println("连接成功!");
                         countDownLatch.countDown();
                     }
                }
            });
            countDownLatch.await();
            System.out.println(zooKeeper.getSessionId());
            zooKeeper.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
