package nuaa.edu.acwing;

import java.util.Scanner;

/**
 * @author planb
 * @date 2020/8/28 09:12
 * 备注：石子合并 (区间DP)
 */
public class StoneMerge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            s[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            s[i] += s[i - 1];
        }
        int[][] dp = new int[n + 1][n + 1];
        for (int len = 2; len <= n; len++) {
            for (int i = 1; i + len - 1 <= n; i++) {
                int l = i;
                int r = i + len - 1;
                dp[l][r] = (int) 1e8;
                for (int k = l; k < r; k++) {
                    dp[l][r] = Math.min(dp[l][r], dp[l][k] + dp[k + 1][r] + s[r] - s[l - 1]);
                }
            }
        }
        System.out.println(dp[1][n]);
    }
}
