package cn.nuaa.edu;

import java.util.LinkedList;

/**
 * @author planb
 * @date 2020/5/14 20:57
 * 备注：
 */

public class QueueDemo {
    public static void main(String[] args) {
        Queue queue = new Queue();
        for (int i = 1; i <= 10; i++)
        {
            queue.push(Integer.toString(i));
        }
        while (!queue.isEmpty())
        {
            System.out.println(queue.pop());
        }
    }
}
class Queue {
    private LinkedList list = new LinkedList();
    public void push(Object v) {
        list.addFirst(v);
    }
    public Object pop() {
        return list.removeLast();
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
}