package cn.nuaa.edu.leetcode;

import java.util.Arrays;

/**
 * @author planb
 * @date 2020/7/30 13:56
 * 备注：LeetCode1498
 * 给你一个整数数组 nums 和一个整数 target 。
 *
 * 请你统计并返回 nums 中能满足其最小元素与最大元素的 和 小于或等于 target 的 非空 子序列的数目。
 *
 * 由于答案可能很大，请将结果对 10^9 + 7 取余后返回。
 *
 */
public class LeetCode1498 {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int res = 0;
        int mod = (int) (1e9 + 7);
        int k = nums.length;
        int[] p  = new int[k];
        p[0] = 1;
        for (int i = 1;i<k;i++){
            p[i] = p[i-1] * 2 % mod;
        }
        for(int i = 0, j = k-1; i < k ;i++){
            while(i <= j && nums[i] + nums[j] > target) {
                j--;
            }
            if(i <= j && nums[i] + nums[j] <= target){
                res = (res+ p[j-i]) % mod;
            }
        }
        return res;
    }
}
