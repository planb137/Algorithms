package cn.nuaa.edu.jvm;

/**
 * @author planb
 * @date 2020/7/5 09:47
 * 备注：Jmm 可见行，volatile可以满足（通知机制）
 */
class MyNunmber{
    int number = 10;
    public void addTo15(){
        this.number = 15;
    }
}
public class JmmDemo {
    public static void main(String[] args) {
        MyNunmber myNunmber = new MyNunmber();
        new Thread(() -> {
            try {
                Thread.sleep(3);
                myNunmber.addTo15();
                System.out.println(Thread.currentThread().getName()+"update my number"+myNunmber.number);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"AAA").start();

        while (myNunmber.number == 10) {
        }

        System.out.println(Thread.currentThread().getName() + "main线程,值：" + myNunmber.number);

    }

}
