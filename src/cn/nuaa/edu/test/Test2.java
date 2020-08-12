package cn.nuaa.edu.test;

import java.util.Scanner;

/**
 * @author planb
 * @date 2020/8/12 14:51
 * 备注：
 */
public class Test2 {
    public static void main(String[] args) {
        //System.out.println((char)('C'+32));
        Scanner sc = new Scanner(System.in);
        float f = sc.nextFloat();
        //Math.round(f);
        System.out.println((int) (f + 0.5));

        String s = "abc";
        String s1 = "def";
        String s2 = s + s1;
        System.out.println(s + s1);
    }
}
