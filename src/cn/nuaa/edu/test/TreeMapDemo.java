package cn.nuaa.edu.test;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author planb
 * @date 2020/8/13 15:13
 * 备注：TreeMapDemo(两种写法)
 */
public class TreeMapDemo {
    public static void main(String[] args) {

       TreeMap<Integer, String> map2 = new TreeMap<>((o1, o2) -> {
            return -(o1 - o2);
        });

        TreeMap<Integer, String> map = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        map.put(1, "1");
        map.put(2, "2");
        map.put(8, "8");
        map.put(4, "4");
        map.put(3, "3");
        for (Integer ints : map.keySet()) {
            System.out.println(map.get(ints));
        }
    }
}
