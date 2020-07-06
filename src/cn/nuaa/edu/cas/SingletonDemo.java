package cn.nuaa.edu.cas;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author planb
 * @date 2020/7/6 13:36
 * 备注：单例模式之懒汉式
 */
public class SingletonDemo {
    private static volatile SingletonDemo instence = null;

    private SingletonDemo() {
        System.out.println(Thread.currentThread().getName()+"\t我是构造方法");
    }

/*    public  static synchronized SingletonDemo getInstance() {
        if (instence == null){
            instence = new SingletonDemo();
        }
        return instence;
    }*/

    //DCL (Double check lock 双端检锁机制)
    public  static  SingletonDemo getInstance(){
        if (instence == null){
           synchronized (SingletonDemo.class){
               if (instence == null){
                   instence = new SingletonDemo();
               }
           }
        }
        return instence;
    }

    public static void main(String[] args) {
        //单线程，没问题
       /* System.out.println(SingletonDemo.getInstance() == SingletonDemo.getInstance());
        System.out.println(SingletonDemo.getInstance() == SingletonDemo.getInstance());
        System.out.println(SingletonDemo.getInstance() == SingletonDemo.getInstance());
        System.out.println("-------------------------------------");
     */
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                SingletonDemo.getInstance();
            },String.valueOf(i)).start();
        }
    }
}
