package nuaa.edu.test;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * @author planb
 * @date 2020/8/26 20:11
 * 备注：
 */
public class UnitDemoTest {
    @Test
    public void testGenericAdd(){
        System.out.println(new UnitDemo().genericAdd(new Integer(3), new Integer(5)));
    }

    @Test
    public void testAdd(){
        Assert.assertEquals(9,new UnitDemo().add(3,7));
    }

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("a", "1rw3rw");
        map.put("b", "1reqwrw");
        map.put("b", "1rwe");
        map.put("4", "1rdswrw");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator1 = entries.iterator();
        while (iterator1.hasNext()){
            Map.Entry<String, String> entry = iterator1.next();
            System.out.println(entry);
        }

        //Deque dq = new LinkedList<String>();

    }

}