package cn.nuaa.edu.jvm;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @author planb
 * @date 2020/7/4 19:38
 * 备注：
 */
public class JvmHeapDemo {
    public static void main(String[] args) {
        //System.out.println(Runtime.getRuntime().availableProcessors());
        /*long maxMemory = Runtime.getRuntime().maxMemory();
        long totalMemory = Runtime.getRuntime().totalMemory();
        System.out.println("max mermory: "+maxMemory+"字节、"+(maxMemory/(double)1024/1024)+"MB");
        System.out.println("total Memory: "+totalMemory+"字节、"+(totalMemory/(double)1024/1024)+"MB");
*/
/*        String str = "www.planb.org.cn";
        while (true){
            str+= str+ new Random().nextInt(88888888) +new Random().nextInt(888888);
        }*/
        //OutOfMemoryError
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("adada");
    }
}
