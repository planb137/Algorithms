package cn.nuaa.edu.nowcoder;

import java.util.*;

/**
 * @author planb
 * @date 2020/8/8 15:33
 * 备注：nowcoder 字典排列
 */
public class Demo8 {
    public static int max(int[] x){
        int max = -1;
        for (int i = 0; i < x.length; i++) {
            max = Math.max(max,x[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        LinkedList<Integer> list = new LinkedList<>();
        ArrayList<Integer> li = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int j = 0; j < m; j++) {
            arr[j] = sc.nextInt();
            set.add(arr[j]);
            li.add(arr[j]);
            list.addLast(arr[j]);
        }
        int pivot = arr[0];
        Collections.sort(li);
        for (int i = 1; i <= n; i++) {
            if (set.contains(i)){
                continue;
            }else {
                if (i<pivot){
                    list.add(0, list.peekFirst());
                }else {

                }

            }
        }
    }
}
