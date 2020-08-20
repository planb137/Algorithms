package nuaa.edu.acwing.basic;

import java.util.Scanner;

/**
 * @author planb
 * @date 2020/8/20 17:17
 * 备注：DFS全排列
 */
public class DFSDemo {
    public static int n;
    public static int[] path = new int[10];
    public static boolean[] used = new boolean[10];

    public static void dfs(int u) {
        if (u == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(path[i]+" ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!used[i]) {
                path[u] = i;
                used[i] = true;
                dfs(u + 1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dfs(0);
    }
}
