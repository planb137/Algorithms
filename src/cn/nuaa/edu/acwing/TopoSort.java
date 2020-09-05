package nuaa.edu.acwing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author planb
 * @date 2020/9/5 13:01
 * 备注：输出所有拓扑序列（bfs队列实现）
 */
public class TopoSort {
    static int N = 100010;
    static int[] e = new int[N];
    static int[] ne = new int[N];
    static int[] h = new int[N];
    static int[] d = new int[N];
    static int n = 0;
    static int idx = 0;
    static LinkedList<Integer> q = new LinkedList<>();
    static ArrayList<Integer> res = new ArrayList<>();

    static void add(int a, int b) {
        e[idx] = b;
        ne[idx] = h[a];
        h[a] = idx++;
    }

    static boolean topSort() {
        for (int i = 1; i <= n; i++) {
            if (d[i] == 0) {
                q.addLast(i);
            }
        }
        while (!q.isEmpty()) {
            int s = q.peekFirst();
            q.pollFirst();
            res.add(s);
            for (int i = h[s]; i != -1; i = ne[i]) {
                int j = e[i];
                d[j]--;
                if (d[j] == 0) {
                    q.addLast(j);
                }
            }
        }
        return res.size() == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        Arrays.fill(h, -1);
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            add(a, b);
            d[b]++;
        }
        if (topSort()) {
            for (Integer ac : res) {
                System.out.print(ac + " ");
            }
        } else {
            System.out.println("-1");
        }
    }
}
