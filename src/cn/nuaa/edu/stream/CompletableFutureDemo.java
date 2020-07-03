package cn.nuaa.edu.stream;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @author planb
 * @date 2020/7/3 18:33
 * 备注：
 */
public class CompletableFutureDemo {
    public static void main(String[] args) throws ExecutionException,InterruptedException {
        CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(() -> {
            System.out.println(Thread.currentThread().getName()+" 没有返回，update mysql ok");
        });
        completableFuture.get();

        CompletableFuture<Integer> integerCompletableFuture = completableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName() + " insert mysql ok");
            //int age =10/0;
            return 1024;
        });
        integerCompletableFuture.whenComplete((u,v) ->{
            System.out.println("*****u："+u);
            System.out.println("*****v："+v);
        }).exceptionally(f ->{
            System.out.println("exection："+f.getMessage());
            return 4444;
        }).get();
    }
}
