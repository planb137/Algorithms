package cn.nuaa.edu.juc;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @author planb
 * @date 2020/7/2 14:58
 * 备注：多线程中，第三种获得多线程的方法Callable(多态，适配器模式)
 * 区别与Runnable  1、是否有返回值，还可以是泛型
 *                  2、是否抛出异常
 *                  3、落地方法不一样，一个run（），一个call（）
 */
class MyThread implements Runnable{
    @Override
    public void run() {
        System.out.println("come in runnable");
    }
}
class MyThread2 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
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
        System.out.println(futureTask.get());

    }
}

