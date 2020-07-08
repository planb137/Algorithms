package cn.nuaa.edu.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author planb
 * @date 2020/7/8 09:37
 * 备注：可重入锁代码,也叫递归锁（sync，reenterLock也是）
 synchronized,ReentrantLock
    t1	 invoke sendSMS()
    t1	 invoke sendMail()
    t2	 invoke sendSMS()
    t2	 invoke sendMail()
    =============================
    t3	 invoke get()
    t3	 invoke set()
    t4	 invoke get()
    t4	 invoke set()
 */

class Phone implements Runnable{
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        get();
    }
    public void get(){
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + "\t invoke get()");
            set();
        } finally {
            lock.unlock();
        }
    }
    public void set(){
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + "\t invoke set()");
        } finally {
            lock.unlock();
        }
    }

    public synchronized void sendSMS() throws Exception{
        System.out.println(Thread.currentThread().getName() + "\t invoke sendSMS()");
        sendMail();
    }
    public synchronized void sendMail() throws Exception{
        System.out.println(Thread.currentThread().getName()+ "\t invoke sendMail()");
    }
}
public class ReenterLockDemo {
    public static void main(String[] args) {
        Phone phone = new Phone();
        new Thread(() -> {
            try {
                phone.sendSMS();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"t1").start();

            new Thread(() -> {
        try {
            phone.sendSMS();
        } catch (Exception e) {
            e.printStackTrace();
        }
    },"t2").start();
           try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("=============================");

        Thread t3 = new Thread(phone,"t3");
        Thread t4 = new Thread(phone,"t4");
        t3.start();
        t4.start();

    }
}
