package nuaa.edu.juc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author planb
 * @date 2020/7/1 19:37
 * 备注：生产者与消费者，两个线程操作同一个变量(线程间的通信)
 *      2、步骤：判断、干活、通知
 *      3、多线程交互中，必须要防止多线程的虚假唤醒，也即（判断只能用while，不能用if）
 */
class AirCondition{
    private int number = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void increment() throws InterruptedException{
        lock.lock();
        try {
            while(number != 0){
                condition.await();
            }
            number++;
            System.out.println(Thread.currentThread().getName()+"\t"+number);
               condition.signal();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
    public void decrement() throws InterruptedException{
        lock.lock();
        try {
            while(number == 0){
                this.condition.await();
            }
            //干活
            number--;
            System.out.println(Thread.currentThread().getName()+"\t"+number);
            //通知
            this.condition.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

}
/**
 * @author planb
 */
public class ThreadWaitNotifyDemo {
    public static void main(String[] args) throws InterruptedException {
        AirCondition airCondition = new AirCondition();
        new Thread(() -> {
            for (int i = 0; i < 10 ; i++) {
                try {
                    airCondition.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"A").start();

        new Thread(() -> {
            for (int i = 0; i < 10 ; i++) {
                try {
                    airCondition.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"B").start();
    }
}
