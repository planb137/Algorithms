package cn.nuaa.edu.test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author planb
 * @date 2020/8/13 16:56
 * 备注：线程不安全，打印的不是100000
 */
public class ThreadDemo {
    public static int m = 0;
    public static Lock lock = new ReentrantLock();
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[100];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    m++;
                }
            },String.valueOf(i));
        }

        for (Thread t: threads) {
            t.start();
        }
        for (Thread t: threads) {
            t.join();//等待所有线程运行完毕
        }
       // Thread.sleep(3000);
        System.out.println(m);
    }
}
