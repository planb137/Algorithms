package nuaa.edu.acwing;

import java.util.LinkedList;

/**
 * @author planb
 * @date 2020/9/5 10:28
 * 备注：bfs 模板
 */
public class BFSDemo {
    static int[] h;
    static int[] e;
    static int[] ne;
    static boolean[] st;

    static LinkedList<Integer> q = new LinkedList<>();

    static void bfs() {
        while (!q.isEmpty()) {
            int t = q.peekFirst();
            q.pollFirst();

            for (int i = h[t]; i != -1; i = ne[i]) {
                int j = e[i];
                if (!st[j]) {
                    st[j] = true; // 表示点j已经被遍历过
                    q.addLast(j);
                }
            }
        }
    }

    public static void main(String[] args) {
        q.addLast(1);
        st[1] = true;
        bfs();
    }
}

