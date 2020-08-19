package nuaa.edu.leetcode;

import java.util.HashMap;

/**
 * @author planb
 * @date 2020/8/19 08:58
 * 备注：厨房里总共有 n 个橘子，你决定每一天选择如下方式之一吃这些橘子：
 *     吃掉一个橘子。
 *     如果剩余橘子数 n 能被 2 整除，那么你可以吃掉 n/2 个橘子。
 *     如果剩余橘子数 n 能被 3 整除，那么你可以吃掉 2*(n/3) 个橘子。
 *
 * 每天你只能从以上 3 种方案中选择一种方案。
 * 请你返回吃掉所有 n 个橘子的最少天数。
 *
 */
public class LeetCode1553 {
    HashMap<Integer, Integer> map = new HashMap<>();

    public int minDays(int n) {
        return getDays(n);
    }

    public int getDays(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n == 3) {
            return 2;
        }
        if (map.containsKey(n)) {
            return map.get(n);
        }
        int m = getDays(n / 2) + n % 2;
        int t = getDays(n / 3) + n % 3;

        int min = Math.min(m, t)+1;
        map.put(n,min);
        return min;
    }

}
