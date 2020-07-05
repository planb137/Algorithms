package cn.nuaa.edu.juc;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author planb
 * @date 2020/7/2 16:49
 * 备注：
 */
public class CycleBarrierDemo {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(7,()->{
            System.out.println("人数达到！开始开会");
        });
        for (int i = 0; i < 8; i++) {
            final int tempInt = i;
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName()+"\t到达了第:"+tempInt+"人");
                try {
                    cyclicBarrier.await();
                    System.out.println("----");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            },String.valueOf(i)).start();
        }

    }
}
