package nuaa.edu.acwing;

import java.util.Scanner;

/**
 * @author planb
 * @date 2020/8/28 16:25
 * 备注：acwing - 并查集 1：两个集合的快速合并
 *              2：询问两个元素是不是在同一个集合中
 */
public class MergeDemo {
    static int[] p ;

    //并查集核心方法
    static int find(int x) {
        if (p[x] != x) {
            p[x] = find(p[x]);
        }
        return p[x];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        p = new int[n + 1];
        for (int i = 1; i <=n ; i++) {
            p[i] = i;
        }

        while (m-- > 0) {
            //String s  = sc.next();
            char c = sc.next().charAt(0);
            int a = sc.nextInt(), b = sc.nextInt();
            if (c == 'M') {
                p[find(a)] = find(b);
            } else {
                System.out.print(find(a) == find(b) ? "Yes\n" : "No\n");
            }
        }
    }
}
