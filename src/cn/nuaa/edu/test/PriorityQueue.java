package cn.nuaa.edu.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author planb
 * @date 2020/7/15 15:03
 * 备注：PriorityQueue
 */
class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue(8);
        PriorityQueue priorityQueue2 = new PriorityQueue<Integer>((o1,o2) -> -o1.compareTo(o2));
        System.out.println(priorityQueue2.size());
        PriorityQueue priorityQueue1 = new PriorityQueue<Integer>(7,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        });
        priorityQueue2.add(4);
        priorityQueue2.add(1);
        priorityQueue2.add(3);
        priorityQueue2.add(7);

        while (!priorityQueue2.isEmpty()){
            System.out.println(priorityQueue2.poll());
        }

       // PriorityQueue<Integer> priorityQueue1 =  new java.util.PriorityQueue<Integer>(8,(o1,o2)->{return o1.compareTo(o2);});

    }
}
