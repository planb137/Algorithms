package cn.nuaa.edu.juc;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author planb
 * @date 2020/7/1 13:52
 * 备注： 多线程编程套路
 *       1、在高内聚低耦合的前提下，线程  操作（对外暴露的调用方法）  资源类（匿名内部类实现）
 *       2、
 *       3、
 */
class  Ticket2  //资源类
{
    private int number = 30;
    private Lock lock = new ReentrantLock();

    public void saleTicket(){
        lock.lock();
        try {
            if(number > 0){
                System.out.println(Thread.currentThread().getName()
                        +"卖出第："+(--number) +"张,还剩下："+number);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }


    }
}

public class SaleTicketUsingJUC {
    public static void main(String[] args) throws Exception{
        Ticket ticket = new Ticket();
        new  Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <20 ; i++) {
                    ticket.saleTicket();
                }
            }
        },"A").start();
        new  Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <20 ; i++) {
                    ticket.saleTicket();
                }
            }
        },"b").start();
        new  Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <20 ; i++) {
                    ticket.saleTicket();
                }
            }
        },"c").start();
    }
}
