package nuaa.edu.acwing.basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author planb
 * @date 2020/9/4 16:33
 * 备注：链表的实现-用数组模拟单链表-邻接表（作用：存储图的树）
 */
public class AdjacencyList {
    static Scanner in = new Scanner(System.in);
    static final int N = (int) 1e5 + 10;
    static int h[] = new int[N];//头结点的下标
    static int e[] = new int[N * 2]; //表示节点的值
    static int ne[] = new int[N * 2]; //表示节点i next的指针（存储的是下标）
    static int idx = 0; //当前已经用到了哪一个点的下标

    // 添加邻接表的边
    static void add(int a, int b) {
        e[idx] = b;
        ne[idx] = h[a];
        h[a] = idx++;
    }

    public static void main(String[] args) {

        int n = in.nextInt();
        Arrays.fill(h, -1);
        for (int i = 0; i < n - 1; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            add(a, b);
            add(b, a);
        }
    }


}
