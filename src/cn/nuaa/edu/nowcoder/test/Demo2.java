package nuaa.edu.nowcoder.test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author planb
 * @date 2020/9/1 19:43
 * 备注：
 */
public class Demo2 {
    static long query(long n, long[] x) {
        HashSet<Long> set = new HashSet<>();
        long res = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (i == j) {
                    continue;
                }
                if (x[j] % x[i] == 0) {
                    res += n / x[j];
                } else {
                    res += n / (x[i] * x[j]);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
         //long res = 0;
        Set<Long> set = new HashSet<>();
        long[] arr = new long[m];
        long k = 0;
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextLong();
              k += n / arr[i];
        }

        System.out.println(k - query(n, arr));

    }
}
