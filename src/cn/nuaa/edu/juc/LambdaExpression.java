package cn.nuaa.edu.juc;

import com.sun.codemodel.internal.JForEach;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author planb
 * @date 2020/7/1 15:08
 * 备注：default方法(多个)
 *      static方法（多个）
 *   Collections.sort(list, (a,b)-> a.compareTo(b));
 *   Arrays.sort(arr,(a,b) -> -a.compareTo(b));
 */
@FunctionalInterface
interface Foo{
    public void say();
    //public int add(int x,int y);

    default int div(int x ,int y){
        return x/y;
    }
    public static int mv(int x,int y){
        return x*y;
    }
}
public class LambdaExpression {

    public static void main(String[] args) {

/*        Foo foo = new Foo() {
            @Override
            public void say() {
                System.out.println("hello");
            }
        };
        foo.say();*/
/*        Foo foo =() -> {System.out.println("hello,from lambda expression"); };
        foo.say();*/
        Foo foo2 = () -> {
        };
        foo2.say();
        System.out.println(foo2.div(10, 5));
        System.out.println(Foo.mv(2, 6));

        List<Integer> list = Arrays.asList(8, 3, 1, 5, 4);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        });
        Collections.sort(list, (a, b) -> a.compareTo(b));
        list.forEach(System.out::print);

        System.out.println("-------------------------------------------------");

        Integer[] arr = {8, 3, 1, 5, 4};
/*        Arrays.sort(list2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        */

        Arrays.sort(arr, (a, b) -> -a.compareTo(b));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
