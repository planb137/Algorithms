package nuaa.edu.leetcode;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author planb
 * @date 2020/9/5 14:21
 * 备注：leetcode 207 课程表（拓扑排序）
 * 你这个学期必须选修 numCourse 门课程，记为 0 到 numCourse-1 。
 * <p>
 * 在选修某些课程之前需要一些先修课程。 例如，想要学习课程 0 ，你需要先完成课程 1
 * <p>
 * 我们用一个匹配来表示他们：[0,1]，给定课程总量以及它们的先决条件，请你判断是否可能完成所有课程的学习？
 */
public class LeetCode207 {
    static int N = 100010;
    static int[] e = new int[N];
    static int[] ne = new int[N];
    static int[] h = new int[N];
    static int[] d = new int[N];
    static int idx = 0;
    static int times = 0;
    static int n = 0;
    static LinkedList<Integer> q = new LinkedList<>();

    static void add(int a, int b) {
        e[idx] = b;
        ne[idx] = h[a];
        h[a] = idx++;
    }

    static boolean topSort() {
        for (int i = 0; i < n; i++) {
            if (d[i] == 0) {
                q.addLast(i);
            }
        }
        while (!q.isEmpty()) {
            int t = q.pollFirst();
            times++;
            for (int i = h[t]; i != -1; i = ne[i]) {
                int j = e[i];
                d[j]--;
                if (d[j] == 0) {
                    q.addLast(j);
                }
            }
        }
        return times == n;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        n = numCourses;
        Arrays.fill(h, -1);
        for (int i = 0; i < prerequisites.length; i++) {
            int[] temp = prerequisites[i];
            add(temp[1], temp[0]);
            d[temp[0]]++;
        }
        return topSort();
    }

    public static void main(String[] args) {
        int x = 2;
        int[][] n = {{1, 0}, {0, 1}};
        System.out.println(new LeetCode207().canFinish(x, n));
    }
}
