package cn.nuaa.edu.test;

import cn.nuaa.edu.practice.QuickSortPartition;

import java.util.Random;
import java.util.concurrent.ExecutionException;

/**
 * @author planb
 * @date 2020/6/29 17:44
 * 备注：
 */
public class ThreadTest extends Thread {
    public double startTime;
    public ThreadTest(String name,double startTime){
        super(name);
        this.startTime = startTime;
    }

    @Override
    public void run() {
        while (true){
            int[] nums = new int[10000000];
            for(int i =0 ;i<10000000;i++){
                nums[i] = new Random().nextInt(1000000);
            }
            //Arrays.sort(nums);
            int[] x = QuickSortPartition.qsort(nums,0,nums.length-1);
           /* System.out.print("排序的结果为： ");
            for (int temp:x){
                System.out.print(temp+" ");
            }*/
//            try {
//                sleep(1000);//休息一秒
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println( "当前的线程为： "+getName()+
                    " 从创建到执行花费了:" + (System.currentTimeMillis()- this.startTime) + "(ms)");
            break;
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException  {
        ThreadTest[] threadTest = new ThreadTest[100];
        for (int i =0 ;i<threadTest.length;i++){
            threadTest[i] = new ThreadTest(Integer.toString(i),System.currentTimeMillis());
        }
        for(int j =0; j<threadTest.length;j++){
            threadTest[j].run();
        }

    }
}
