package nuaa.edu.nowcoder.test;

import java.util.*;

/**
 * @author planb
 * @date 2020/9/4 09:26
 * 备注：阿里巴巴9月4号笔试  砍掉一个树枝后，求树的个数
 * 7
 * 1 2
 * 1 3
 * 2 4
 * 2 5
 * 3 6
 * 3 7
 */
public class Ali2 {
    static int n;
    static int[] h;
    static int[] e;
    static int[] ne;
    static boolean[] used;
    static int idx = 0;

    public static void add(int a, int b) {
        e[idx] = b;
        ne[idx] = h[a];
        h[a] = idx++;
    }

    public static void dfs(int x) {
        used[x] = true;
        for (int i = h[x]; i != -1; i = ne[x]) {
            int j = e[i];
            System.out.println(j + " ");
            if (!used[j]) {
                dfs(j);
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        //int max = 4;
        h = new int[n + 1];
        e = new int[2 * n];
        ne = new int[2 * n];
        used = new boolean[n + 1];
        Arrays.fill(h, -1);

        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            add(a, b);
            //add(b, a);
        }
        dfs(1);
    }
/*

    //删除叶子节点到根节点的一条通路
    public static void remove(Map<Integer, List<Integer>> map, int x, int[] sum) {
        if (x == 1) {
            return;
        }

        for (Integer in : map.keySet()) {
            List<Integer> aa = map.get(in);
            if (aa.contains(x)) {
                sum[0]++;
            }
        }
    }
*/

}
