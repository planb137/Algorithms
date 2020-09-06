package nuaa.edu.acwing;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author planb
 * @date 2020/9/4 16:22
 * 备注：acwing - 树的重心（邻接表存储）
 * 给定一颗树，树中包含n个结点（编号1~n）和n-1条无向边。
 * 请你找到树的重心，并输出将重心删除后，剩余各个连通块中点数的最大值。
 * 重心定义：重心是指树中的一个结点，如果将这个点删除后，剩余各个连通块中点数的最大值最小，
 * 那么这个节点被称为树的重心。
 */
public class TreeCenter {
    static Scanner in = new Scanner(System.in);
    static final int N = (int) 1e5 + 10;
    static int h[] = new int[N], e[] = new int[N * 2], ne[] = new int[N * 2], idx = 0;
    static int ans = N;
    static boolean st[] = new boolean[N];
    static int n = 0;

    // 添加邻接表的边
    static void add(int a, int b) {
        e[idx] = b;
        ne[idx] = h[a];
        h[a] = idx++;
    }

    static int dfs(int u) {
        st[u] = true;
        int sum = 1, size = 0;
        for (int i = h[u]; i != -1; i = ne[i]) {
            int j = e[i];
            if (!st[j]) {
                int s = dfs(j);  
                size = Math.max(size, s);
                sum += s;
            }
        }
        size = Math.max(size, n - sum);
        ans = Math.min(ans, size);
        return sum;
    }

    public static void main(String[] args) {
        n = in.nextInt();
        Arrays.fill(h, -1);
        for (int i = 0; i < n - 1; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            add(a, b);
            add(b, a);
        }
        dfs(1);
        System.out.println(ans);
    }

}
