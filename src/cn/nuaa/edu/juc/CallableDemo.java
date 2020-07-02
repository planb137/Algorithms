package cn.nuaa.edu.juc;

import java.util.concurrent.*;

/**
 * @author planb
 * @date 2020/7/2 16:07
 * 备注：多线程中，第三种获得多线程的方法Callable(多态，适配器模式)  get方法一般放在最后一行
 *  * 区别与Runnable    1、是否有返回值，还可以是泛型
 *  *                  2、是否抛出异常
 *  *                  3、落地方法不一样，一个run（），一个call（）
 */

class MyThread implements Runnable{
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("come in runnable");
    }
}
class MyThread2 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {

        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("come in callable");
        return 1024;
    }

}

public class CallableDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        MyThread thread = new MyThread();
        Thread t1 = new Thread(thread);
        t1.start();

        FutureTask futureTask = new FutureTask(new MyThread2());
        new Thread(futureTask,"B").start();
        System.out.println(Thread.currentThread().getName()+"计算完成");
        System.out.println(futureTask.get());
    }
}
