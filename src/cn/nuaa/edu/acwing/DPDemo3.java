package nuaa.edu.acwing;

import java.util.Scanner;

/**
 * @author planb
 * @date 2020/8/24 17:13
 * 备注： 最长上升子序列，并返回序列顺序(每次用数组记录转移的下标)。
 * 7
 * 3 1 2 1 8 5 6
 */
public class DPDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] f = new int[n + 1];
        int[] dp = new int[n + 1];
        int[] g = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            f[i] = sc.nextInt();
        }
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = 1;
            g[i] = 0;
            for (int j = 1; j < i; j++) {
                if (f[j] < f[i]) {
                    if (dp[i] < dp[j] + 1) {
                        dp[i] = dp[j] + 1;
                        g[i] = j;
                    }
                    //dp[i] =  Math.max(dp[i],dp[j] + 1);
                }
            }
        }
        int k = 0;
        for (int i = 0; i <= n; i++) {
            if (dp[k] < dp[i]) {
                k = i;
            }
            // res = Math.max(res,dp[i]);
        }
        System.out.println(dp[k]);//最大长度

        for (int len = dp[k], i = 0; i < len; i++) {
            System.out.print(f[k] + " ");
            k = g[k];
        }
    }
}
