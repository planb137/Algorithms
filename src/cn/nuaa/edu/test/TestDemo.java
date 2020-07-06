package cn.nuaa.edu.test;

import java.util.Arrays;
import java.util.List;

/**
 * @author planb
 * @date 2020/7/6 12:32
 * 备注：Arrays.asList注意事项
 */
public class TestDemo {
    public static void main(String[] args) {
        Integer[] arr = {1,4,5,7,8};
        List<Integer> list = Arrays.asList(arr);
        System.out.println(list);
        arr[0]=12;
        list.add(123113);
        System.out.println(list);

    }
}
