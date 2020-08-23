package nuaa.edu.acwing;

import java.util.Scanner;

/**
 * @author planb
 * @date 2020/8/23 19:45
 * 备注：acwing - 完全背包问题
 */
public class KnaspackTotal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] v = new int[n + 1];
        int[] w = new int[n + 1];
        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            v[i] = sc.nextInt();
            w[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                for (int k = 0; k * v[i] <= j; k++) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - k * v[i]] + k * w[i]);
                }
            }
        }

        System.out.println(dp[n][m]);
    }
}
