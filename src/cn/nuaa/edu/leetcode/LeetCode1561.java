package nuaa.edu.leetcode;

import java.util.Arrays;

/**
 * @author planb
 * @date 2020/8/25 19:20
 * 备注：1561. 你可以获得的最大硬币数目
 */
public class LeetCode1561 {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int res = 0;
        for (int i = 0, j = piles.length - 1; i < j; i++) {
            res += piles[--j];
            j--;
        }
        return res;
    }
}
