package nuaa.edu.acwing.basic;

import java.util.Scanner;

/**
 * @author planb
 * @date 2020/8/20 18:48
 * 备注：n-皇后问题 (dfs)
 */
public class EightQueen {
    private static int N = 20;
    public static int n;
    public static char[][] path = new char[N][N];
    public static boolean[] col = new boolean[N];
    public static boolean[] dg = new boolean[N];
    public static boolean[] udg = new boolean[N];

    public static void dfs(int u) {
        if (u == n) {
            for (int i = 0; i < n; i++) {
                System.out.println(path[i]);
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!col[i] && !dg[i + u] && !udg[i - u + n]) {
                path[i][u] = 'Q';
                col[i] = dg[i + u] = udg[i - u + n] = true;
                dfs(u + 1);
                col[i] = dg[i + u] = udg[i - u + n] = false;
                path[i][u] = '.';
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                path[i][j] = '.';
            }
        }
        dfs(0);
    }
}
