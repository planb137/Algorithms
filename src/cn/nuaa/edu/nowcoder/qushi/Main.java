package nuaa.edu.nowcoder.qushi;

import java.util.*;

/**
 * @author planb
 * @date 2020/9/5 13:01
 * 备注：趋势科技笔试 - 拓扑序列（bfs 优先队列实现）
 */
public class Main {
    static int N = 100010;
    static int[] e = new int[N];
    static int[] ne = new int[N];
    static int[] h = new int[N];
    static int[] d = new int[N];
    static int n = 0;
    static int idx = 0;
    static PriorityQueue<Integer> q = new PriorityQueue<>();
    //static LinkedList<Integer> q = new LinkedList<>();

    static void add(int a, int b) {
        e[idx] = b;
        ne[idx] = h[a];
        h[a] = idx++;
    }

    static String topSort() {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (d[i] == 0) {
                q.add(i);
                //q.addLast(i);
            }
        }
        while (!q.isEmpty()) {
            //int s = q.peekFirst();
            // q.pollFirst();
            int s = q.poll();
            res.append(s).append(",");
            for (int i = h[s]; i != -1; i = ne[i]) {
                int j = e[i];
                d[j]--;
                if (d[j] == 0) {
                    q.add(j);
                    // q.addLast(j);
                }
            }
        }
        return res.toString();
    }

    public static String test(String s) {
        Arrays.fill(h, -1);
        String[] s1 = s.split(",");

        n = s1.length;
        for (int i = 0; i < s1.length; i++) {
            if (Integer.parseInt(s1[i]) >= 0) {
                add(Integer.parseInt(s1[i]), i);
                d[i]++;
            }
        }
        String str = topSort();
        return str.substring(0, str.length() - 1);

    }

    public static void main(String[] args) {
        System.out.println(Main.test("1,2,-1,1"));
    }
}
