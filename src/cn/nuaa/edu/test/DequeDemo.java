package cn.nuaa.edu.test;

import org.omg.PortableInterceptor.ServerIdHelper;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author planb
 * @date 2020/7/27 15:40
 * 备注:Deque<Integer> deque = new LinkedList<>():demo;
 */
public class DequeDemo {
    public static void main(String[] args) {
/*        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(2);
        deque.add(3);
        deque.add(4);
       while (!deque.isEmpty()){
           System.out.println(deque.remove()); //2 3 4
       }*/

        Deque<Integer> deque = new LinkedList<>();
        deque.addLast(1);
        deque.addLast(2);
        deque.addLast(3);
        deque.addLast(4);
        while (!deque.isEmpty()){
            //System.out.println(deque.removeFirst());
            System.out.println(deque.removeLast());
            deque.peekFirst();
            deque.peekLast();
        }


    }
}

