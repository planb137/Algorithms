package nuaa.edu.nowcoder.wangyi;

import java.util.Scanner;

/**
 * @author planb
 * @date 2020/8/8 21:02
 * 备注：(AC 90%)
 * 小易给定你数字A,B(A<B)\mathit A,B(A < B)A,B(A<B)和系数p,q\mathit p,qp,q。
 * 每次操作你可以将A\mathit AA变成A+p\mathit A+pA+p或者将p\mathit pp变成p×q\mathit p \times qp×q。
 * 问至少几次操作使得B≤AB \leq AB≤A。
 */
public class Demo11 {
    public static int check(int[] x) {
        int sum = 1;
        int a = x[0];
        int b = x[1];
        int p = x[2];
        int q = x[3];

        while (a + p < b) {
            p = p * q;
            sum++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- != 0) {
            int[] num = new int[4];
            for (int i = 0; i < 4; i++) {
                num[i] = sc.nextInt();
            }
            System.out.println(check(num));
            System.out.println("======");
        }
    }
}
