package cn.nuaa.edu.cas;

import cn.nuaa.edu.reflect.Student;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author planb
 * @date 2020/7/6 14:18
 * 备注：CAS => Compare and Swap
 */
public class CasDemo {
    public static void main(String[] args) {
       // AtomicInteger atomicInteger = new AtomicInteger(5);
/*        System.out.println(atomicInteger.getAndIncrement());
        System.out.println(atomicInteger.getAndIncrement());
        atomicInteger.getAndIncrement();
        atomicInteger.getAndAdd(4);
        System.out.println(atomicInteger.compareAndSet(5, 7));
        System.out.println(atomicInteger.get());*/
        AtomicReference<Student> atomicReference = new AtomicReference<Student>();
        Student zhangsan = new Student("zhangsan", 17, "nanjin");
        Student lisi = new Student("lisi", 27, "beijin");
        atomicReference.set(zhangsan);
        System.out.println(atomicReference.compareAndSet(zhangsan, lisi)+"\t"+atomicReference.get().toString());
        System.out.println(atomicReference.compareAndSet(zhangsan, lisi)+"\t"+atomicReference.get().toString());

    }
}
