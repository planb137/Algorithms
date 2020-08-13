package cn.nuaa.edu.test;

/**
 * @author planb
 * @date 2020/8/13 16:56
 * 备注：
 */
public class ThreadDemo {
    public static  int m = 0;
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[100];
       /* for (int i = 0; i < 100; i++) {
             new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    m++;
                }
            }).start();
        }*/

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    m++;
                }
            },String.valueOf(i));
        }

/*        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }*/
        for (Thread t: threads) {
            t.start();
        }
    /*    for (Thread t: threads) {
            t.join();//等待所有线程运行完毕
        }*/
        Thread.sleep(3000);
        System.out.println(m);
    }
}
