package cn.nuaa.edu.jvm;

/**
 * @author planb
 * @date 2020/7/5 09:47
 * 备注：Jmm 可见行（通知机制）
 */
class MyNunmber{
    volatile int number = 10;
    public void addTo15(){
        this.number = 15;
    }
}
public class JmmDemo {
    public static void main(String[] args) {
        MyNunmber myNunmber = new MyNunmber();
        new Thread(() -> {
            try {
                Thread.sleep(3000);
                myNunmber.addTo15();
                System.out.println(Thread.currentThread().getName()+"update my number"+myNunmber.number);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"AAA").start();
        while (myNunmber.number == 10) {
        }
        try {
            Thread.sleep(10000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "main线程,值：" + myNunmber.number);

    }

}
