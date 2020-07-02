package cn.nuaa.edu.juc;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.concurrent.TimeUnit;

/**
 * @author planb
 * @date 2020/7/2 10:42
 * 备注： 多线程8锁(sync锁住的是当前对象this的所有syns方法)
 * 1、标准访问，先打印邮件
 * 2、邮件方法暂停4秒钟，还是先打印邮件
 * 3、新增一个普通方法hello（），先打印hello
 * 4、2部手机，先打印短信
 *
 * 5、2个静态同步方法，1部手机，先打印eamil(static时候，锁住的是.class)
 * 6、2个静态同步方法，,2部手机，先打印eamil
 *
 * 7、1个普通同步方法，1个静态同步方法,1部手机，先打印短信
 * 8、1个普通同步方法，1个静态同步方法,2部手机，先打印短信
 */
class Phone{
    public   synchronized void sendEmail() throws Exception{
        TimeUnit.SECONDS.sleep(4);
        System.out.println("send email");
    }
    public  synchronized void sendSMS() throws Exception{
        System.out.println("send SMS");
    }
    public void hello(){
        System.out.println("hello");
    }
}
public class Lock {
    public static void main(String[] args) throws InterruptedException {
        Phone phone = new Phone();
        Phone phone2 = new Phone();
        new Thread(() ->{
            try {
                phone.sendEmail();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"A").start();
        Thread.sleep(200);

        new Thread(() ->{
            try {
                phone2.sendSMS();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"B").start();
    }
}
