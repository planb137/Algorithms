package nuaa.edu.nowcoder.wangyi;

import java.util.Scanner;

/**
 * @author planb
 * @date 2020/8/8 19:23
 * 备注：小易有n\mathit nn根柱子，第i\mathit ii根柱子的高度为hi\mathit h_{i}hi​。一开始小易站在第一根柱子上。小易能从第i\mathit ii根柱子跳到第j\mathit jj根柱子，当且仅当hj≤hih_{j} \leq h_{i}hj​≤hi​且1≤j−i≤k1 \leq j - i \leq k1≤j−i≤k。其中k\mathit kk为指定的一个数字。
 * 另外小易拥有一次释放超能力的机会。这个超能力能让小易从柱子i\mathit ii跳到任意满足1≤j−i≤k1 \leq j - i \leq k1≤j−i≤k的柱子j\mathit jj而无视柱子高度的限制。
 * 现在小易想知道，小易是否能到达第n\mathit nn根柱子。
 */
public class Demo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while ((T--) > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] num = new int[n];
           // ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            int attpmt = 1;
            for (int i = 0; i < n; i++) {
                num[i] = sc.nextInt();
            }
            start:
            for (int i = 0; i < n; ) {
                for (int j = i + 1; j <= i + k; j++) {
                    if (num[j] <= num[i]) {
                        i = j;
                        break ;
                    } else if (num[j] > num[i] && attpmt >= 1) {
                        attpmt--;
                        i = j;
                        break;
                    } else {
                        if (i == n - 1) {
                            System.out.println("YES");
                        } else {
                            System.out.println("NO");
                        }
                        break start;
                    }
                }
            }

        }
    }
}
