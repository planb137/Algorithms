package cn.nuaa.edu.stream;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author planb
 * @date 2020/7/22 17:12
 * 备注：java8新特性-foreach
 */
public class ForeachDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(2);
        list.forEach( a -> System.out.println(a++));

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "12");
        map.put(2, "22");
        map.put(3, "32");
        int[] arr = new int[map.size()];
        String[] arr2 = new String[map.size()];
        int[] index = new int[1];
        map.forEach((k,v)->{
            arr[index[0]] = k;
            arr2[index[0]] = v;
            index[0]++;
        });

    }
}
