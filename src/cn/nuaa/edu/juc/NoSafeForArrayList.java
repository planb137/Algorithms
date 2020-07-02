package cn.nuaa.edu.juc;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author planb
 * @date 2020/7/2 12:23
 * 备注：ArrayList,HashMap,HahSet都是线程不安全的
 *      copyonwrite容器 写时复制，读写分离的思想，读和写不同的容器
 *      1、add的时候，先进行复制，然后再将原容器的的引用指向新的容器  setArray(newElements);
 *      2、这样做的好处可以对copyonwrite容器进行并发读而不需要加锁，因为当前容器不会添加任何元素)
 *  public boolean add(E e) {
 *         final ReentrantLock lock = this.lock;
 *         lock.lock();
 *         try {
 *             Object[] elements = getArray();
 *             int len = elements.length;
 *             Object[] newElements = Arrays.copyOf(elements, len + 1);
 *             newElements[len] = e;
 *             setArray(newElements);
 *             return true;
 *         } finally {
 *             lock.unlock();
 *         }
 *     }
 */
public class NoSafeForArrayList {
    public static void main(String[] args) {
        //List<String> list = Arrays.asList("a","b","c");
        //java 8 新特性
        //list.forEach(System.out::println);

        //List<String> list = new ArrayList<String>();
        //List<String> list = new Vector<String>();
        //List<String> list = Collections.synchronizedList(new ArrayList<>());
        List<String> list = new CopyOnWriteArrayList<>();
        new CopyOnWriteArraySet<>();
        for (int i = 0; i < 30; i++) {
            new Thread(()->{
                list.add(UUID.randomUUID().toString().substring(0,8));
                System.out.println(list);
            },String.valueOf(i)).start();

        }
    }
}
