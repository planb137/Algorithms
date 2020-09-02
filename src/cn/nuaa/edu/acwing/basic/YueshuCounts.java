package nuaa.edu.acwing.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author planb
 * @date 2020/9/2 15:01
 * 备注：870. 约数个数
 */
public class YueshuCounts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long res = 1;
        long mod = (long) 1e9 + 7;
        //存放质因数，以及对应的个数
        Map<Integer, Long> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            for (int j = 2; j <= x / j; j++) {
                while (x % j == 0) {
                    x = x / j;
                    map.put(j, map.getOrDefault(x, 0L) + 1);
                }
            }
            if (x > 1) {
                map.put(x, map.getOrDefault(x, 0L) + 1);
            }
        }
        for (Integer x : map.keySet()) {
            res = res * (map.get(x) + 1) % mod;
        }
        System.out.println(res);
    }

}
