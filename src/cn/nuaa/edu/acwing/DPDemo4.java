package nuaa.edu.acwing;

import java.util.Scanner;

/**
 * @author planb
 * @date 2020/8/25 09:38
 * 备注：acwing - 最长公共子序列(注意next()与nextLine()的区别)
 */
public class DPDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //注意这里不能用sc.nextLine()，最好多加一个字符;
        String s1 = " " + sc.next();
        String s2 = " " + sc.next();
        int[][] dp = new int[s1.length()][s2.length()];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                if (s1.charAt(i) == s2.charAt(j)) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1] + 1);
                }
            }
        }
        System.out.println(dp[n][m]);
    }
}
