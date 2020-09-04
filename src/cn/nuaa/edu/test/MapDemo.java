package nuaa.edu.test;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author planb
 * @date 2020/9/4 10:47
 * 备注：map作为实参传递的时候，会修改原来的map
 */
public class MapDemo {
    public void remove(Map<Integer, Integer> map, int x) {
        if (map.containsKey(x)) {
            map.remove(x);
        }
        return;
    }

    @Test
    public void testRemove() {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(2, 2);
        map.put(3, 2);
        map.put(4, 2);
        map.put(5, 2);
        new MapDemo().remove(map, 5);

        for (Integer x : map.keySet()) {
            System.out.println(x +"  : " + map.get(x));
        }
    }

}
