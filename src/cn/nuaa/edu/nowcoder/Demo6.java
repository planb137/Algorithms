package cn.nuaa.edu.nowcoder;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author planb
 * @date 2020/8/7 20:05
 * 备注：小易给定你一个长度为的正整数序列，你每次可以使用的代价将某个数加一或者减一，
 *      你希望用最少的代价使得所有数的乘积等于，求最小代价（操作结束后每个数也必须是正整数）。
 */
public class Demo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sc.hasNext()){
            String[] str = sc.nextLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int m = Integer.parseInt(str[1]);
            String[] arr = sc.nextLine().split(" ");
            int [] num = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                num[i] = Integer.parseInt(arr[i]);
            }
           // Arrays.sort(num);
            int max  = 1;
            int index = -1;
            int index2 = -1;
            int maxValue = num[0];
            for (int i = num.length-1; i >=0 ; i--) {
                maxValue = Math.max( num[i], maxValue);
                if(m % num[i] == 0){
                    max = Math.max(num[i], max);
                    index = i;
                    index2 = i;
                }
            }
            if(max == 1){
                for (int i = 0; i < num.length; i++) {
                    if(num[i] == maxValue){
                        sum += Math.abs(m-maxValue);
                        maxValue = -1;
                        continue;
                    }
                    sum += Math.abs(num[i]-1);
                }
            }else {
                int temp = m / max;
                for (int i = 0; i < num.length; i++) {
                    if (i != index){
                        sum += Math.abs(num[i]-temp);
                        index = -1;
                    }
                    if(index2 != i){
                        sum += (num[i]-1);
                    }

                }
            }
        }
        System.out.println(sum);
    }
}
