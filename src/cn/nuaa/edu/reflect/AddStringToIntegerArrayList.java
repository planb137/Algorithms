package cn.nuaa.edu.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @author planb
 * @date 2020/7/6 10:09
 * 备注：反射越过泛型检查：向ArrayList<Integer>中添加String
 */
public class AddStringToIntegerArrayList {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(20);

        Class<? extends ArrayList> c = integers.getClass();
        Method add = c.getMethod("add", Object.class);
        add.invoke(integers, 1);
        add.invoke(integers, "hello");
        add.invoke(integers, "world");
        System.out.println(integers);
        //integers.forEach(System.out::println);报错java.lang.String cannot be cast to java.lang.Integer
    }
}
