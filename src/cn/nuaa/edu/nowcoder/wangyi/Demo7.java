package nuaa.edu.nowcoder.wangyi;


import java.util.Scanner;

/**
 * @author planb
 * @date 2020/8/8 15:02
 * 备注：数组素数拆分个数
 */
public class Demo7 {
    public static long count(long x) {
        long sum = 0;
        if (x <= 1) {
            return 0;
        } else if (x == 2 || x == 3) {
            return 1;
        } else {
            if (x % 2 == 0) {
                sum = x / 2;
                return sum;
            } else {
                sum ++;
                sum += (x - 3) / 2;
                return sum;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int j = 0; j < n ; j++) {
            arr[j] = sc.nextLong();
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += count(arr[i]);
        }
        System.out.println(sum);
    }
}
