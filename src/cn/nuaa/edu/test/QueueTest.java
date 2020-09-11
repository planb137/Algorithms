package nuaa.edu.test;

import java.util.LinkedList;

/**
 * @author planb
 * @date 2020/5/14 21:04
 * 备注：
 */
public class QueueTest {
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        System.out.println(queue.poll());
        System.out.println(queue.toString());
        String s = new String(" ");

    }
}
