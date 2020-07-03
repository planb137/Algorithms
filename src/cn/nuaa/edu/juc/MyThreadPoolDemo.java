package cn.nuaa.edu.juc;

import java.util.concurrent.*;

/**
 * @author planb
 * @date 2020/7/3 09:24
 * 备注：线程池
public ThreadPoolExecutor(int corePoolSize,
    int maximumPoolSize,
    long keepAliveTime,
    TimeUnit unit,
    BlockingQueue<Runnable> workQueue,
    ThreadFactory threadFactory,
    RejectedExecutionHandler handler){}
 *
 */
public class MyThreadPoolDemo {
    public static void main(String[] args) {
        //打印电脑内核数目 8
        System.out.println(Runtime.getRuntime().availableProcessors());

        ExecutorService threadPool = new ThreadPoolExecutor(2, 5,
                2L, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.DiscardPolicy());
        for (int i = 1; i <= 10; i++) {
            threadPool.execute(()->{
                System.out.println(Thread.currentThread().getName()+"\t办理业务");
            });
        }

    }


    public static void initPool() {
        //一个池子有5个固定的线程，
        ExecutorService threadPool1 = Executors.newFixedThreadPool(5);
        ExecutorService threadPool2 = Executors.newSingleThreadExecutor();
        ExecutorService threadPool  = Executors.newCachedThreadPool();
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
