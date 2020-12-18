package com.zxf.zookpeer;

import org.apache.zookeeper.*;
import org.apache.zookeeper.data.ACL;
import org.apache.zookeeper.data.Id;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;



public class ZkCreate {
    ZooKeeper zooKeeper;
    String IP="192.168.0.226:2181";
    @Before
    public void before() throws Exception{
        final CountDownLatch countDownLatch=new CountDownLatch(1);
        zooKeeper=new ZooKeeper(IP, 5000, new Watcher() {
            public void process(WatchedEvent event) {
                if(event.getState()==Event.KeeperState.SyncConnected){
                    System.out.println("连接OK了");
                    countDownLatch.countDown();
                }
            }
        });
          countDownLatch.await();

    }

    @After
    public void after()throws Exception{
        zooKeeper.close();
    }
    @Test
    public void create1()throws Exception{
        zooKeeper.create("/create/noe1","node1".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
    }
    @Test
    public void create2()throws Exception{
        zooKeeper.create("/create/noe2","node2".getBytes(),ZooDefs.Ids.READ_ACL_UNSAFE,CreateMode.PERSISTENT);
    }
    @Test
    public void create3()throws Exception{
        List<ACL> acls=new ArrayList<ACL>();
        Id id=new Id("world","anyone");
        acls.add(new ACL(ZooDefs.Perms.READ,id));
        acls.add(new ACL(ZooDefs.Perms.WRITE,id));
        zooKeeper.create("/create/noe3","noe3".getBytes(),acls,CreateMode.PERSISTENT);
    }
    @Test
    public void create4()throws Exception{
        List<ACL> acls=new ArrayList<ACL>();
        Id id=new Id("ip","192.168.0.226");
        acls.add(new ACL(ZooDefs.Perms.ALL,id));
        zooKeeper.create("/create/noe4","noe4".getBytes(),acls,CreateMode.PERSISTENT);
    }
    @Test
    public void create5()throws Exception{
        zooKeeper.addAuthInfo("digest","itcast:123456".getBytes());
        zooKeeper.create("/create/noe5","noe5".getBytes(),ZooDefs.Ids.CREATOR_ALL_ACL,CreateMode.PERSISTENT);
    }
    @Test
    public void create6()throws Exception{
        zooKeeper.addAuthInfo("digest","itcast:123456".getBytes());
        List<ACL> acls=new ArrayList<ACL>();
        Id id=new Id("auth","itcast");
        acls.add(new ACL(ZooDefs.Perms.READ,id));
        zooKeeper.create("/create/noe6","noe6".getBytes(),acls,CreateMode.PERSISTENT);
    }
    @Test
    public void create7()throws Exception{
        List<ACL> acls=new ArrayList<ACL>();
        Id id=new Id("digest","itheima:qlzQzCLKhBROghkooLvb+Mlwv4A=");
        acls.add(new ACL(ZooDefs.Perms.ALL,id));
        zooKeeper.create("/create/noe7","noe7".getBytes(),acls,CreateMode.PERSISTENT);
    }
    @Test
    public void create8()throws Exception{
        String result=zooKeeper.create("/create/noe8","noe8".getBytes(),ZooDefs.Ids.OPEN_ACL_UNSAFE,CreateMode.PERSISTENT_SEQUENTIAL);
        System.out.println(result);
    }
    //临时节点  ，会话关闭以后，该临时节点也不存在了。
    @Test
    public void create9()throws Exception{
        String result=zooKeeper.create("/create/noe9","noe9".getBytes(),ZooDefs.Ids.OPEN_ACL_UNSAFE,CreateMode.EPHEMERAL);
        System.out.println(result);
    }
    @Test
    public void create10()throws Exception{
        String result=zooKeeper.create("/create/noe10","noe10".getBytes(),ZooDefs.Ids.OPEN_ACL_UNSAFE,CreateMode.EPHEMERAL_SEQUENTIAL);
        System.out.println(result);

    }
    @Test
    public void create11()throws Exception{
        zooKeeper.create("/create/noe11","noe11".getBytes(),ZooDefs.Ids.OPEN_ACL_UNSAFE,CreateMode.PERSISTENT,new AsyncCallback.StringCallback(){

            public void processResult(int rc, String path, Object ctx, String name) {
                System.out.println(rc);
                System.out.println(path);
                System.out.println(name);
                System.out.println(ctx);
            }
        },"I am context");
        Thread.sleep(1000);
        System.out.println("结束");
    }

}
