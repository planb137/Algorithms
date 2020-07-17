package cn.nuaa.edu.test;

/**
 * @author planb
 * @date 2020/7/17 12:31
 * 备注：使用wait，notify实现Semaphore
 */
class Wait{
    private static int TIME = 3;
    public  synchronized void addThread() throws InterruptedException{
        while(TIME >= 3){
            this.wait();
        }
        TIME++;
        System.out.println(Thread.currentThread().getName()+" 现在还剩线程："+TIME);
        this.notifyAll();
    }
    public  synchronized void decThread() throws InterruptedException{
        while(TIME <=  0){
            this.wait();
        }
        TIME--;
        System.out.println(Thread.currentThread().getName()+" 现在还剩线程："+TIME);
        this.notifyAll();

    }
}
public class WaitDemo {

    public static void main(String[] args) {
        Wait wait = new Wait();
        for (int i = 1; i <= 10 ; i++) {
            new Thread(() -> {
                try {
                    wait.addThread();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
               // System.out.println(Thread.currentThread().getName()+" 号线程进来了！");
            },String.valueOf(i)).start();
        }

        for (int i = 1; i <= 10 ; i++) {
            new Thread(() -> {
                try {
                    wait.decThread();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // System.out.println(Thread.currentThread().getName()+" 号线程进来了！");
            },String.valueOf(i)).start();
        }
    }
}
