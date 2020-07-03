package cn.nuaa.edu.stream;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/**
 * @author planb
 * @date 2020/7/3 17:56
 * 备注：ForkJoinPool
 */
class MyTask extends RecursiveTask<Integer>{
   private static final Integer ADJUST_VALUE =10;
   private int begin;
   private int end;
   private int result;

    public MyTask(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if(end -begin <=ADJUST_VALUE){
            for (int i = begin; i <= end; i++) {
                result = result +i;
            }
        }
        else{
            int mid = (end+begin)/2;
            MyTask task = new MyTask(begin, mid);
            MyTask task2 = new MyTask(mid+1, end);
            task.fork();
            task2.fork();
            result  = task.join()+task2.join();
        }

        return result;
    }
}
public class ForkJoinDemo {
    public static void main(String[] args) throws Exception {
        MyTask task = new MyTask(0,100000);
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkJoinTask<Integer> submit = forkJoinPool.submit(task);
        System.out.println(submit.get());
        forkJoinPool.shutdown();
    }
}
