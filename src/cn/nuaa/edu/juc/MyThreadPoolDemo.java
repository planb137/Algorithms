package cn.nuaa.edu.juc;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author planb
 * @date 2020/7/3 09:24
 * 备注：线程池
 */
public class MyThreadPoolDemo {
    public static void main(String[] args) {
        //一个池子有5个固定的线程，
        //ExecutorService threadPool = Executors.newFixedThreadPool(5);
        //ExecutorService threadPool = Executors.newSingleThreadExecutor();
        ExecutorService threadPool = Executors.newCachedThreadPool();
        try {
            for (int i = 0; i < 10; i++) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                threadPool.execute(()->{
                    System.out.println(Thread.currentThread().getName()+"\t办理任务");
                });
/*                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            threadPool.shutdown();
        }
    }
}
