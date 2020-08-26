package nuaa.edu.test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author planb
 * @date 2020/8/26 17:55
 * 备注：
 */
public class AtomicDemo {
    public void add(AtomicInteger x , AtomicInteger y){
        int res = x.addAndGet(3);
        int res2 =  y.getAndAdd(4);
        System.out.println(res);
        System.out.println(res2);
    }

}
