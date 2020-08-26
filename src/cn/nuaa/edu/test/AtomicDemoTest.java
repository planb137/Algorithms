package nuaa.edu.test;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicInteger;


/**
 * @author planb
 * @date 2020/8/26 17:59
 * 备注：
 */
public class AtomicDemoTest {

    @Test
     public void testAdd(){
        AtomicDemo atomicDemo = new AtomicDemo();
        atomicDemo.add(new AtomicInteger(1), new AtomicInteger(5));
    }

}