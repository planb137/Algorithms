package cn.nuaa.edu.test;

import cn.nuaa.edu.juc.MyThreadPoolDemo;
import com.sun.tools.classfile.ConstantPool;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author planb
 * @date 2020/7/6 12:32
 * 备注：Arrays.asList注意事项
 */
public class TestDemo {
    public static void main(String[] args) {
        Integer[] arr = {1,4,5,7,8};
        List<Integer> list = Arrays.asList(arr);
/*        System.out.println(list);
        arr[0]=12;
        list.add(123113);
        System.out.println(list);*/
        ArrayList<Integer> integers = new ArrayList<>(5);
        ArrayList<Integer> integers2 = new ArrayList<>(5);

        MyThreadPoolDemo myThreadPoolDemo = new MyThreadPoolDemo();
        if(myThreadPoolDemo instanceof MyThreadPoolDemo ){
            System.out.println("yes");
        }

        Integer a = new Integer(2);
        System.out.println(a.hashCode());
        if(a instanceof Integer){
            System.out.println("yes");
        }
        System.out.println(integers.hashCode());
        System.out.println(integers2.hashCode());

        System.out.println("==============================");
        char[] c = {'2','8','d','3','1'};
        String s = new String(c);
        System.out.println(c);

        char[] d = {'2','8','d','3','1'};
        String s1 = String.valueOf(d);
        System.out.println(s1);

    }
}
