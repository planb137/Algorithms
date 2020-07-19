package cn.nuaa.edu.test;

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.*;

/**
 * @author planb
 * @date 2020/6/17 13:16
 * 备注：
 */
public class Test {
    public static void main(String[] args) {
       // System.out.println((char)97);
       // String[] arr= new String[Integer.MAX_VALUE];(溢出)
       // System.out.println(8&8);
       // System.out.println(String.valueOf(Integer.toBinaryString(11)));

      /*  String Str = new String("www.runoob.com");

        System.out.print("返回值 :" );
        System.out.println(Str.matches("(.*)runoob(.*)")); //true

        System.out.print("返回值 :" );
        System.out.println(Str.matches("(.*)runoob(.*)"));//true

        System.out.print("返回值 :" );
        System.out.println(Str.matches("www(.*)")); //true
        System.out.println('\0');*/

        /*  double x = 1e-6;
        System.out.println(x);*/

        //testHashSet();

        //isDoubleEqual(0.0000001d,0d);

        /*double a = 0.03;
        double b = 0.04;
        System.out.println(a+b);*/

        //BigDecimal通常使用String构造方法
       /* BigDecimal a =new BigDecimal(0.1);
        System.out.println("a values is:"+a);*/
/*        int[] x = new int[10];
        String y = "asadadaad ";
        System.out.println(y.length());
        System.out.println(x.length);
        int a = '0';
        System.out.println(a);*/
/*        String str = "study";

        char[] x = str.toCharArray();
        System.out.println(x);
        System.out.println(String.valueOf(x)+"bu");*/
/*        String x = Long.toBinaryString(Long.MAX_VALUE);
        System.out.println(x.length());*/

    /*    String   num = "123";
        int a = 3;
        System.out.println(a/2);*/
      /*  int a = '0';
        System.out.println(a);*/

/*        HashSet<Integer> set = new HashSet<>();
        set.add(4);
        set.add(5);
        set.add(4);
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(set.contains(4));*/

/*        List<ThreadTest> list = new ArrayList<>();
        ThreadTest[] arr = new ThreadTest[3];
        arr[0] = new ThreadTest("a",System.currentTimeMillis());
        arr[1] = new ThreadTest("b",System.currentTimeMillis());
        arr[2] = new ThreadTest("c",System.currentTimeMillis());
        list = Arrays.asList(arr);//该方法不适用于基本数据类型
        arr[0].setName("f");
        for (ThreadTest tt :list) {
            System.out.println(tt.getName());
        }
        list.forEach(System.out::println);*/
       /* ExecutorService threadPool = new ThreadPoolExecutor(2, 5, 3,
                TimeUnit.SECONDS, new LinkedBlockingQueue<>(3),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.DiscardPolicy());
        for (int i = 0; i < 9; i++) {
                threadPool.execute(() ->System.out.println(Thread.currentThread().getName()+"\t "));
        }*/
/*        ConcurrentHashMap<Integer, Object> keySetView = new ConcurrentHashMap<>();
        keySetView.put(2, 1);
        keySetView.put(3, 1);
        keySetView.put(4, 1);
        keySetView.put(5, 1);*/

        int temp =1;
        while (temp == 10){
            System.out.println(temp);
        }

        double ssd =  2e6;
        double ssp =  1e-8;
        System.out.println(String.valueOf(ssp));
    }

    public static void testHashSet(){
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        list1.forEach(System.out::println);

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        ArrayList<Integer> list = new ArrayList<Integer>();

    }
    public static void isDoubleEqual(double d1,double d2){
        double dis=1e-6;
        System.out.println(d1==d2);             //直接判断为flase
        System.out.println(Math.abs(d1-d2)<dis);    //允许一定的误差范围，判断结果为true
    }
}
