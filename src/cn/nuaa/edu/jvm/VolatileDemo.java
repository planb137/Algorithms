package cn.nuaa.edu.jvm;

/**
 * @author planb
 * @date 2020/7/5 10:18
 * 备注：
 */
class Nunmber{
    int number = 100;
    public void addTo15(int i){
        this.number = i;
    }
}
public class VolatileDemo {
    public static void main(String[] args) {
        Nunmber myNunmber = new Nunmber();
        for (int i = 0; i <5 ; i++) {
            final int temp = i;
            new Thread(() -> {
                    myNunmber.addTo15(temp);
                    System.out.println(Thread.currentThread().getName()+"线程，update my number："+myNunmber.number);
            },String.valueOf(i)).start();
        }
        while (myNunmber.number == 10) {
            System.out.println(Thread.currentThread().getName() + "main线程,值：" + myNunmber.number);
        }
    }

}
