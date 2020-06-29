package cn.nuaa.edu.test;

import cn.nuaa.edu.practice.QuickSortPartition;

import java.util.concurrent.ExecutionException;

/**
 * @author planb
 * @date 2020/6/29 17:44
 * 备注：
 */
public class ThreadTest extends Thread {
    public ThreadTest(String name){
        super(name);
    }
    @Override
    public void run() {
        while (true){
            int[] nums = {-1,2,3,-4,64,23,1,57,35,242,57,2,57,34,57};
            long start,end;
            start = System.currentTimeMillis();
            //Arrays.sort(nums);
            int[] x = QuickSortPartition.qsort(nums,0,nums.length-1);
            try {
                sleep(1000);//休息一秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            end = System.currentTimeMillis();
            System.out.println( "当前的线程为： "+getName()+" 本次执行花费了:" + (end - start) + "(ms)");
            break;
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException  {
        ThreadTest[] threadTest = new ThreadTest[10];
        for (int i =0 ;i<10;i++){
            threadTest[i] = new ThreadTest(Integer.toString(i));
            threadTest[i].run();
        }

    }
}
