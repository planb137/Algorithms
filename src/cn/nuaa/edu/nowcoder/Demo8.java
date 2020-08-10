package cn.nuaa.edu.nowcoder;

import java.util.*;

/**
 * @author planb
 * @date 2020/8/8 15:33
 * 备注：nowcoder 字典排列
 */
public class Demo8 {
    public static int find(int[] x,int num){
        int index = -1;

        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        int[] res = new int[n];

        HashSet<Integer> set = new HashSet<>();
        for (int j = 0; j < m; j++) {
            arr[j] = sc.nextInt();
            set.add(arr[j]);
            res[j] = arr[j];
        }
        int pivot = arr[0];
        String s = "asasas";
        System.out.println(s.contains("adad"));

        for (int i = 1; i <= n; i++) {
           if (set.contains(i)){
               continue;
           }else {
               //find();
           }
        }
    }
}
