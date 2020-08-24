package nuaa.edu.acwing;

import java.util.Scanner;

/**
 * @author planb
 * @date 2020/8/24 14:11
 * 备注：acwing - 数字三角形
 */
public class DPDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int INF = (int) 1e9;
        int[][] f = new int[n + 1][n + 1];
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                f[i][j] = sc.nextInt();
            }
        }
        // Arrays.fill(dp, -INF);
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i + 1; j++) {
                dp[i][j] = -INF;
            }
            dp[1][1] = f[1][1];

            for (i = 2; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    dp[i][j] = Math.max(dp[i - 1][j - 1] + f[i][j], dp[i - 1][j] + f[i][j]);
                }
            }

            int max = -INF;
            for (int j = 1; j <= n; j++) {
                max = Math.max(max, dp[n][j]);
            }
            System.out.println(max);
        }
    }
}
