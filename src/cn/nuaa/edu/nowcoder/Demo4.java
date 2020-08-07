package cn.nuaa.edu.nowcoder;

import java.util.Scanner;

/**
 * @author planb
 * @date 2020/8/7 18:26
 * 备注： 把M个同样的苹果放在N个同样的盘子里，允许有的盘子空着不放，问共有多少种不同的分法?
 */
public class Demo4 {
    public static int f(int n, int m) {
        if (n == 0 || m == 1) {
            return 1;
        }
        if (n < m) {
            return f(n, n);
        }
        return f(n, m - 1) + f(n - m, m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(f(n, m));
        }
    }
}
