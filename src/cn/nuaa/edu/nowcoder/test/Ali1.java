package nuaa.edu.nowcoder.test;

import java.util.Scanner;

/**
 * @author planb
 * @date 2020/9/4 08:55
 * 备注：阿里巴巴9月4号笔试 ac 70%
 */
public class Ali1 {
    static int[][] cp;

    public static void init(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    cp[i][j] = 1;
                } else {
                    cp[i][j] = cp[i - 1][j] + cp[i - 1][j - 1];
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        long mod = 998244353;
        cp = new int[(N+1) * (N+1)][(N+1)*(N+1)];
        init((N+1) * (N+1));
        long res = 0;
        res = (cp[N * N][a]% mod) * (cp[N * N - a][b]% mod) * (cp[N * N - a - b][c]) % mod;
        System.out.println(res);
    }
}
