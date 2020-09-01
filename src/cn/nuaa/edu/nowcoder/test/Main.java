package nuaa.edu.nowcoder.test;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author planb
 * @date 2020/9/1 19:43
 * 备注：
 */
public class Main {
/*    static long query(long x, long y) {
        return x / y;
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // long res = 0;
        Set<Long> set = new HashSet<>();
        for (int i = 0; i < m; i++) {
            long x = sc.nextLong();
            long k = n / x;
            for (long j = 1; j <= k; j++) {
                set.add(j * x);
            }
        }
        System.out.println(set.size());

    }
}
