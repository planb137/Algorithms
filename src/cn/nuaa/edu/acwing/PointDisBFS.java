package nuaa.edu.acwing;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author planb
 * @date 2020/9/5 12:05
 * 备注：acwing - 图中点的层次，BFS求最短距离(bfs借助队列实现)
 * 给定一个n个点m条边的有向图，图中可能存在重边和自环。 所有边的长度都是1，点的编号为1~n。
 * 请你求出1号点到n号点的最短距离，如果从1号点无法走到n号点，输出-1。
 */
public class PointDisBFS {
    static int n;
    static int N = 100010;
    static int[] e = new int[N];
    static int[] h = new int[N];
    static int[] d = new int[2 * N];
    static int[] ne = new int[2 * N];
    static LinkedList<Integer> q = new LinkedList<>();
    static int idx = 0;

    static void add(int x, int y) {
        e[idx] = y;
        ne[idx] = h[x];
        h[x] = idx++;
    }

    static int bfs() {
        d[1] = 0;
        while (!q.isEmpty()) {
            int t = q.peekFirst();
            q.pollFirst();
            for (int i = h[t]; i != -1; i = ne[i]) {
                int s = e[i];
                if (d[s] == -1) {
                    d[s] = d[t] + 1;
                    q.addLast(s);
                }
            }
        }
        return d[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        Arrays.fill(h, -1);
        Arrays.fill(d, -1);
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            add(a, b);
        }
        q.addLast(1);
        System.out.println(bfs());
    }
}
