package nuaa.edu.test;

import java.math.BigInteger;
import java.util.Scanner;

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
        BigInteger bg = new BigInteger("1");
        BigInteger bigInteger = bg.add(new BigInteger("2"));
        Integer i = Integer.parseInt(bigInteger.toString());
        System.out.println(i.getClass().toString());//class java.lang.Integer
        System.out.println(bg.getClass().toString());//class java.math.BigInteger
    }
}
