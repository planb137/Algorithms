package nuaa.edu.acwing.basic;

import java.util.Scanner;

/**
 * @author planb
 * @date 2020/9/1 15:51
 * 备注：求组合数 1≤b≤a≤2000 :( c[i][j] = (c[i - 1][j] + c[i - 1][j - 1]))
 */
public class CombinationDemo {
    static int n = 2010;
    static int[][] c = new int[n][n];
    static int mod = (int)1e9 + 7;

    static void init() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    c[i][j] = 1;
                } else {
                    c[i][j] = (c[i - 1][j] + c[i - 1][j - 1])  % mod;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        init();
        while (n-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(c[a][b]);
        }
    }
}
