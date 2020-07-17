package cn.nuaa.edu.test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author planb
 * @date 2020/7/17 21:42
 * 备注：
 */
public class BigDecimalDemo {
    public static void main(String[] args) {
        double x = Math.pow(10, -5);
        HashSet<Integer> integers = new HashSet<>(6);
        HashMap<Integer, Integer> hashMap = new HashMap<>(10);

        System.out.println(x);

        BigDecimal b1 = new BigDecimal("111313123131313131313187189391837193719318618724628746274264576245726457264527645276452745274652472654764527452376452764527425723452745237");
        BigDecimal b2 = b1.add(new BigDecimal(1));
        System.out.println(b2.intValue());
       /* BigDecimal b2 = BigDecimal.valueOf(0.48);
        System.out.println(b2);*/

        int y = Integer.MAX_VALUE;
        System.out.println(y);
        int z = Integer.parseInt(String.valueOf(Math.pow(2, 31)-1));
        System.out.println(z);
        //System.out.println(String.valueOf(12).toCharArray());

    }
}
