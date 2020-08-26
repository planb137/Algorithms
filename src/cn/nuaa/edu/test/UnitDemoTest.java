package nuaa.edu.test;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

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
        ArrayList<String> list = new ArrayList<>();
        Iterator<String> iterator = list.iterator();
    }

}