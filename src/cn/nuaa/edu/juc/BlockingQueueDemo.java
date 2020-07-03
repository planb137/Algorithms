package cn.nuaa.edu.juc;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * @author planb
 * @date 2020/7/2 20:02
 * 备注：
 */
public class BlockingQueueDemo {
    public static void main(String[] args) throws ExecutionException,InterruptedException {
        ArrayBlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);
/*        System.out.println(blockingQueue.add("a"));
        System.out.println(blockingQueue.add("b"));
        System.out.println(blockingQueue.add("c"));

        //System.out.println(blockingQueue.add("c"));//IllegalStateException: Queue full
        System.out.println(blockingQueue.remove());
        blockingQueue.remove();
        blockingQueue.remove();
        blockingQueue.remove();//NoSuchElementException*/

/*        System.out.println(blockingQueue.add("a"));
        System.out.println(blockingQueue.add("a"));
        System.out.println(blockingQueue.element());*/

      /*  System.out.println(blockingQueue.offer("a"));
        System.out.println(blockingQueue.offer("a"));
        System.out.println(blockingQueue.offer("a"));
        System.out.println(blockingQueue.offer("a")); //false

        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());//null*/


        blockingQueue.put("a");//空返回
        blockingQueue.put("b");//空返回
        blockingQueue.put("c");//空返回
        blockingQueue.put("d");//空返回,阻塞

        System.out.println(blockingQueue.take());
        System.out.println(blockingQueue.take());
        System.out.println(blockingQueue.take());
        System.out.println(blockingQueue.take());//阻塞

     /*   System.out.println(blockingQueue.offer("a"));
        System.out.println(blockingQueue.offer("a"));
        System.out.println(blockingQueue.offer("a"));
        blockingQueue.offer("a",3L,TimeUnit.SECONDS);//阻塞3秒钟后，执行完成，没有返回*/



    }
}
