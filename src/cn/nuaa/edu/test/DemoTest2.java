package nuaa.edu.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author planb
 * @date 2020/9/1 15:00
 * 备注：快手（系统研发工程师-云原生方向）面试题：复制带随机指针的链表
 */
class Node {
    Node ran;
    Node next;
    int value;
}
public class DemoTest2 {
    public static void main(String[] args) {
        Map<Node,Node> map = new HashMap<>();
        Node newNode = new Node();
        Node head = new Node();
        newNode = head;
        while(head.next != null){
            Node temp = head.next;
            Node pivot = head.ran;
            map.put(temp,pivot);
            head = head.next;
        }
        while(newNode.next!=null){
            if(map.containsKey(newNode)){
                Node va = map.get(newNode);
                newNode.ran = va;
            }
        }
        System.out.println("Hello World!");
    }
}
