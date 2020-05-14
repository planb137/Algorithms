package cn.nuaa.edu.test;

import java.util.LinkedList;

/**
 * @author planb
 * @date 2020/5/14 21:04
 * 备注：
 */
public class QueueTest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.addFirst(1);
        list.addFirst(2);
        System.out.println(list.getFirst());
        System.out.println(list.removeFirst());
        System.out.println(list.toString());

    }
}
