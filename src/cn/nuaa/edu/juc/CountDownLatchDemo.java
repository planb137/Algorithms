package cn.nuaa.edu.juc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * @author planb
 * @date 2020/7/2 16:29
 * 备注：
 */
public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch downLatch = new CountDownLatch(6);

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName()+"\t离开了教室");
                downLatch.countDown();
            }).start();
        }
        downLatch.await();
        System.out.println(Thread.currentThread().getName()+"\t班长关门走人");
    }

    public static void closeDoor() {
        for (int i = 0; i < 6; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName()+"\t离开教室");
            }).start();
        }
      //  System.out.println(Thread.currentThread().getName()+"\t班长关门走人");
    }
}
