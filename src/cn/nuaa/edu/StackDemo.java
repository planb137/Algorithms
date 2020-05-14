package cn.nuaa.edu;

/**
 * @author planb
 * @date 2020/5/14 20:38
 * 备注：
 */
import java.util.LinkedList;
public class StackDemo {
    public static void main(String[] args) {
        StackL stack = new StackL();
        for (int i = 0; i < 5; i++)
        {
            stack.push(i);
        }
        System.out.println(stack.top());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
class StackL {
    private LinkedList list = new LinkedList();
    public void push(Object v) {
        list.addFirst(v);
    }
    public Object top() {
        return list.getFirst();
    }
    public Object pop() {
        return list.removeFirst();
    }
}