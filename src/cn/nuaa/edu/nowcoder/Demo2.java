package cn.nuaa.edu.nowcoder;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author planb
 * @date 2020/8/7 15:08
 * 备注：匈牙利算法：若两个正整数的和为素数，则这两个正整数称之为“素数伴侣”
 */
public class Demo2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            int N = Integer.parseInt(str);
            long[] nums = new long[N];
            String[] str1 = sc.nextLine().split(" ");
            for (int i = 0; i < N; i++) {
                nums[i] = Integer.parseInt(str1[i]);
            }
            // 偶数部分
            ArrayList<Long> evens = new ArrayList<Long>();
            // 奇数部分
            ArrayList<Long> odds = new ArrayList<Long>();
            for (int i = 0; i < N; i++) {
                if (nums[i] % 2 == 0) { // 偶数
                    evens.add(nums[i]);
                } else { // 奇数
                    odds.add(nums[i]);
                }
            }
            long[] evensMatch = new long[evens.size()];
            int result = 0;
            for (int i = 0; i < odds.size(); i++) {
                int[] used = new int[evens.size()];
                if (find(odds.get(i), evens, used, evensMatch)) {
                    result++;
                }
            }
            System.out.println(result);

        }
        sc.close();
    }

    //标准匈牙利算法
    public static boolean find(long x, ArrayList<Long> evens, int[] used, long[] evensMatch) {

        for (int j = 0; j < evens.size(); j++) {
            if (isPrime(x + evens.get(j)) && used[j] == 0) {
                used[j] = 1;
                if (evensMatch[j] == 0 || find(evensMatch[j], evens, used, evensMatch)) {
                    evensMatch[j] = x;
                    return true;
                }
            }
        }
        return false;
    }
    private static boolean isPrime(long num) {
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
            if (num == 1) {
                return false;
            }
        }
        return true;
    }
}
