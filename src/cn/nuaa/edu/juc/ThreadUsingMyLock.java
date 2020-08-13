package cn.nuaa.edu.juc;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author planb
 * @date 2020/8/13 18:34
 * 备注：使用自定义的锁，实现线程安全访问
 */
public class ThreadUsingMyLock {
    public static int m = 0;
    public static Lock lock = new Mylock();//使用自定义的锁
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[100];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                lock.lock();
                try {
                    for (int j = 0; j < 1000; j++) {
                        m++;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
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
