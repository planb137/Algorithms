package cn.nuaa.edu.leetcode;

import java.util.Arrays;

/**
 * @author planb
 * @date 2020/7/24 13:41
 * 备注：（最长上升子序列）给定一个无序的整数数组，找到其中最长上升子序列的长度。
 */
public class Leetcode300 {
    public int lengthOfLIS(int[] nums) {
        if(nums.length ==0){
            return 0;
        }
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        for(int i = 1;i<nums.length;i++){
            for(int j = 0; j < i; j++){
                if(nums[j] < nums[i]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int res = 0;
        for(int i = 0 ; i < dp.length; i++){
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}
