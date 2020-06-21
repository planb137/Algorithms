package cn.nuaa.edu.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author planb
 * @date 2020/6/17 13:16
 * 备注：
 */
public class Test {
    public static void main(String[] args) {
       // System.out.println((char)97);
       // String[] arr= new String[Integer.MAX_VALUE];(溢出)
       // System.out.println(8&8);
       // System.out.println(String.valueOf(Integer.toBinaryString(11)));

      /*  String Str = new String("www.runoob.com");

        System.out.print("返回值 :" );
        System.out.println(Str.matches("(.*)runoob(.*)")); //true

        System.out.print("返回值 :" );
        System.out.println(Str.matches("(.*)runoob(.*)"));//true

        System.out.print("返回值 :" );
        System.out.println(Str.matches("www(.*)")); //true
        System.out.println('\0');*/

        HashSet<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        for (Integer a : set){
            System.out.println(a);
        }

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
    }
}
