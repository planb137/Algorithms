package nuaa.edu.leetcode;

/**
 * @author planb
 * @date 2020/9/1 16:45
 * 备注：leetcode1567:乘积为正数的最长子数组长度
 */
public class LeetCode1567 {
    public int getMaxLen(int[] nums) {
        int n = nums.length;
        int[] f = new int[n];
        int[] g = new int[n];
        if (nums[0] > 0) {
            f[0] = 1;
        } else if (nums[0] < 0){
            g[0] = 1;
        }
        int res = f[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] > 0) {
                f[i] = f[i - 1] + 1;
                if (g[i - 1] > 0) {
                    g[i] = g[i - 1] + 1;
                }
            } else if (nums[i] < 0) {
                g[i] = f[i - 1] + 1;
                if (g[i - 1] > 0) {
                    f[i] = g[i - 1] + 1;
                }
            }
            res = Math.max(res, f[i]);
        }
        return res;
    }
}
