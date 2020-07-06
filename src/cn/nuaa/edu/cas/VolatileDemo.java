package cn.nuaa.edu.cas;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author planb
 * @date 2020/7/6 14:20
 * 备注：Volatile不保证原子性
 *  原子性：某个线程在执行过程中，中间不可以加阻塞或者被分裂，需要整体，要么失败，要么成功
 *  解决原子性：加synchorized
 *            使用Automic类-AtomicInteger
 * */

class MyData{
    private  volatile int data = 0;
    private  AtomicInteger at = new AtomicInteger();
    public void addAtomic(){
        at.getAndIncrement();
    }
    public void  addTo60(){
        this.data+=60;
    }
    public  void addPlus(){
        data++;
    }

    public AtomicInteger getAt() {
        return at;
    }

    public int getData() {
        return data;
    }
}
public class VolatileDemo {
    public static void main(String[] args) {
        MyData myData = new MyData();
        for (int i = 1; i <= 20; i++) {
            new Thread(() ->{
                for (int j = 1; j <=1000 ; j++) {
                    myData.addPlus();
                    myData.addAtomic();
                }
            },String.valueOf(i)).start();
        }
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        while (Thread.activeCount() >2){
            Thread.yield();
        }
        System.out.println(myData.getData());
        System.out.println(myData.getAt());

    }
}
