package cn.nuaa.edu.juc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author planb
 * @date 2020/7/2 10:12
 * 备注：如何进行多线程之间的顺序调用，实现A->B->C（标志位的修改和定位）
 *    lock与condition配合使用可以精准通知指定线程
 *    实现A打印5次，b打印10次，c打印15次
 */
class ShareResource{
    private int number = 1;
    private Lock lock = new ReentrantLock();
    private Condition  condition1 = lock.newCondition();
    private Condition  condition2 = lock.newCondition();
    private Condition  condition3 = lock.newCondition();

    public void  print5(){
        lock.lock();
        try {
            while (number!=1){
                condition1.await();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName()+"\t"+i);
            }
            number = 2;
            condition2.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void  print10(){
        lock.lock();
        try {
            while (number!=2){
                condition2.await();
            }
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+"\t"+i);
            }
            number = 3;
            condition3.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void  print15(){
        lock.lock();
        try {
            while (number!=3){
                condition3.await();
            }
            for (int i = 0; i < 15; i++) {
                System.out.println(Thread.currentThread().getName()+"\t"+i);
            }
            number = 1;
            condition1.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}
public class ThreadOrderAccess {
    public static void main(String[] args) {
        ShareResource resource = new ShareResource();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                resource.print5();
            }
        },"A").start();

        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                resource.print10();
            }
        },"B").start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                resource.print15();
            }
        },"C").start();
    }
}
