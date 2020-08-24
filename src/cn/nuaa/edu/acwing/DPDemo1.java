package nuaa.edu.acwing;

import java.util.Scanner;

/**
 * @author planb
 * @date 2020/8/24 17:13
 * 备注： 最长上升子序列（给定一个长度为N的数列，求数值严格单调递增的子序列的长度最长是多少。
 */
public class DPDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] f = new int[n + 1];
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            f[i] = sc.nextInt();
        }
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = 1;
            for (int j = 1; j < i; j++) {
                if (f[j] < f[i]) {
                    dp[i] =  Math.max(dp[i],dp[j] + 1);
                }
            }
        }
        int res = 0;
        for (int i = 0; i <=n ; i++) {
            res = Math.max(res,dp[i]);
        }
        System.out.println(res);
    }
}
