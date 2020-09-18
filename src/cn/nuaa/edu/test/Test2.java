package nuaa.edu.test;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

/**
 * @author planb
 * @date 2020/8/12 14:51
 * 备注：
 */
public class Test2 {
    public static void main(String[] args) {
        //System.out.println((char)('C'+32));
/*
        Scanner sc = new Scanner(System.in);
        float f = sc.nextFloat();
        //Math.round(f);
        System.out.println((int) (f + 0.5));

        String s = "abc";
        String s1 = "def";
        String s2 = s + s1;
        System.out.println(s + s1);
*/

//        int[] x = new int[10];
//        for (int i = 0; i < x.length; i++) {
//            x[i] = i;
//        }
//        for (int a : x) {
//            System.out.println(a);
//        }
//
//        long sds = 0;
/*        BigInteger bg = new BigInteger("1");
        BigInteger bigInteger = bg.add(new BigInteger("2"));
        Integer i = Integer.parseInt(bigInteger.toString());
        System.out.println(i.getClass().toString());//class java.lang.Integer
        System.out.println(bg.getClass().toString());//class java.math.BigInteger
        BigDecimal bg2 = new BigDecimal(1212);*/
/*
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        map.put("bb",8);
        map.put("aa",2);
        map.put("cc",5);
        map.put("ee",3);
        map.put("ff",1);
        for (String s: map.keySet()) {
            System.out.println(s+" "+map.get(s));
        }*/
        Map<Integer, Integer> tree = new HashMap<>();
        tree.put(2, 1);
        tree.put(3, 1);
        tree.put(1, 1);
        tree.put(4, 1);
        for (Integer in : tree.keySet()) {
            System.out.println(in);
        }

        // HashMap<String, Integer> map2 = new HashMap<>();
/*        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);*/
/*        for (int j = 1; j <=3 ; j++) {
            map2.put(String.valueOf(j), j);
        }
        for (String s :map2.keySet()) {
            System.out.println(map2.get(s));
        }*/
    }
}
