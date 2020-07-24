package cn.nuaa.edu.leetcode;

/**
 * @author planb
 * @date 2020/7/24 15:59
 * 备注：(零钱兑换)给定不同面额的硬币和一个总金额。写出函数来计算可以凑成总金额的硬币组合数。假设每一种面额的硬币有无限个
 */
public class Leetcode518 {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n+1][amount+1];
        for(int i = 0;i<=n ;i++){
            dp[i][0] = 1;
        }
        for(int i = 1;i<=n;i++){
            for (int j = 1; j <= amount; j++){
                if(j-coins[i-1]>=0){
                    dp[i][j] = dp[i-1][j] + dp[i][j - coins[i-1]];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }

        }
        return dp[n][amount];
    }
}
