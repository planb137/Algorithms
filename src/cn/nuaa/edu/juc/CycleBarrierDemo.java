package nuaa.edu.juc;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author planb
 * @date 2020/7/2 16:49
 * 备注：CycleBarrier控制线程的同步执行
 */
public class CycleBarrierDemo {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(10,()->{
            System.out.println("所有人准备就绪，可以进行下一步");
        });
        for (int i = 1; i <= 10; i++) {
            final int tempInt = i;
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName()+"\t第:"+tempInt+"人到达！");
                try {
                    cyclicBarrier.await();
                    System.out.println("开始笔试：第:"+tempInt+"人开始做笔试");
                    cyclicBarrier.await();
                    System.out.println("开始面试：第:"+tempInt+"人开始做面试");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            },String.valueOf(i)).start();
        }

    }
}
