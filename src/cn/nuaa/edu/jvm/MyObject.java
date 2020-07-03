package cn.nuaa.edu.jvm;

import java.util.Objects;

/**
 * @author planb
 * @date 2020/7/3 19:18
 * 备注：3种类加载器
 */
public class MyObject {
    public static void main(String[] args) {
        Object object = new Object();
        System.out.println(object.getClass().getClassLoader());//null(指的是bootstarpClassLoader)

        MyObject object2 = new MyObject();
        System.out.println(object2.getClass().getClassLoader());//sun.misc.Launcher$AppClassLoader@18b4aac2
        System.out.println(object2.getClass().getClassLoader().getParent());//sun.misc.Launcher$ExtClassLoader@1f32e575
        System.out.println(object2.getClass().getClassLoader().getParent().getParent());//null(指的是bootstarpClassLoader)

    }
}

