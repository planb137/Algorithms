package cn.nuaa.edu.cas;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @author planb
 * @date 2020/7/6 16:19
 * 备注：解决ABA问题:AtomicStampedReference
 *     修改版本、时间戳
 */
public class ABADemo {
    static AtomicReference<Integer> atomicReference = new AtomicReference<>(100);
    static AtomicStampedReference<Integer> stampedReference = new AtomicStampedReference<>(100,1);

    public static void main(String[] args) {

        new Thread(() -> {
            atomicReference.compareAndSet(100, 101);
            atomicReference.compareAndSet(101, 100);
        },"t1").start();

        new Thread(() -> {
            //t2线程暂停一秒钟，保证cas的执行
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(atomicReference.compareAndSet(100, 2019)+"\t "+atomicReference.get());
        },"t2").start();
        System.out.println("===============以下是ABA问题的产生============");

        //暂停2秒钟
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(() -> {
            //t2线程暂停一秒钟，保证cas的执行
           int stamp =  stampedReference.getStamp();
            System.out.println(Thread.currentThread().getName()+"\t 第2次版本：" +stamp);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            stampedReference.compareAndSet(100, 101, stampedReference.getStamp(), stampedReference.getStamp()+1);
            System.out.println(Thread.currentThread().getName()+"\t 第2次版本："+stampedReference.getStamp());

            stampedReference.compareAndSet(101, 100, stampedReference.getStamp(), stampedReference.getStamp()+1);
            System.out.println(Thread.currentThread().getName()+"\t 第3次版本："+stampedReference.getStamp());


        },"t3").start();

        new Thread(() -> {
            //t2线程暂停一秒钟，保证cas的执行
            int stamp =  stampedReference.getStamp();
            System.out.println(Thread.currentThread().getName()+"\t 第1次版本："+stamp);
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            boolean rs = stampedReference.compareAndSet(100, 2019, stamp, stamp+1);
            System.out.println(Thread.currentThread().getName()+"\t 修改成功与否："+rs+"当前最新实际版本号"+stampedReference.getStamp());

            System.out.println(Thread.currentThread().getName() + "\t当前的最新值：" + stampedReference.getReference());
        },"t4").start();
    }
}
