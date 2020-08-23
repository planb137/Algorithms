package nuaa.edu.acwing;

import java.util.Scanner;

/**
 * @author planb
 * @date 2020/8/23 18:52
 * 备注：acwing 01背包问题
 */
public class Knaspack01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v = sc.nextInt();

        int[] vol = new int[n + 1];
        int[] val = new int[n + 1];
        int[][] dp = new int[n + 1][v + 1];

        for (int i = 1; i <= n; i++) {
            vol[i] = sc.nextInt();
            val[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= v; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j >= vol[i]) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - vol[i]] + val[i]);
                }
            }
        }
        System.out.println(dp[n][v]);


    }
}
