package cn.nuaa.edu.juc;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author planb
 * @date 2020/7/2 14:10
 * 备注：ArrayList,HashMap,HahSet都是线程不安全的
 *      HashSet的底层是HashMap
 *      HashMap的底层是数组+链表+红黑树
 */
public class NoSafeForSetMap {
    public static void main(String[] args) {
        //Set<String> set = new HashSet<>();
        //Set<String> set2 = Collections.synchronizedSet(new HashSet<>());
        Set<String> set = new CopyOnWriteArraySet<>();
        for (int i = 0; i < 30; i++) {
            new Thread(()->{
                set.add(UUID.randomUUID().toString().substring(0,8));
                System.out.println(set);
            },String.valueOf(i)).start();
        }
    }
}
