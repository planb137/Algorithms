package nuaa.edu.nowcoder.test;

import java.util.Scanner;

/**
 * @author planb
 * @date 2020/9/1 18:59
 * 备注：
 */
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        if (n % 2 == 1) {
            int k = n / 2;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j > k && (i < k) && (j + i < n - 1) && (i < j) && (j != k) && (i != k)) {
                        arr[i][j] = 1;
                    } else if (j < k && (i < k) && (j + i < n - 1) && (i < j) && (j != k) && (i != k)) {
                        arr[i][j] = 2;
                    } else if (j < k && (i < k)&& (j + i < n - 1) && (i > j) && (j != k) && (i != k)) {
                        arr[i][j] = 3;
                    } else if (i > k && (j < k)&& (j + i < n - 1) && (i > j) && (j != k) && (i != k)) {
                        arr[i][j] = 4;
                    } else if (j < k && (i > k)&& (j + i > n - 1) && (i > j) && (j != k) && (i != k)) {
                        arr[i][j] = 5;
                    } else if (j > k && (i > k)&& (j + i > n - 1) && (i > j) && (j != k) && (i != k)) {
                        arr[i][j] = 6;
                    } else if (j > k && (i > k)&& (j + i > n - 1) && (i < j) && (j != k) && (i != k)) {
                        arr[i][j] = 7;
                    } else if (j > k && (i < k)&& (j + i > n - 1) && (i < j) && (j != k) && (i != k)) {
                        arr[i][j] = 8;
                    }
                }
            }
        } else {
            double k = n / 2  - 0.5;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j > k && (i < k) && (j + i < n - 1) && (i < j) && (j != k) && (i != k)) {
                        arr[i][j] = 1;
                    } else if (j < k && (i < k) && (j + i < n - 1) && (i < j) && (j != k) && (i != k)) {
                        arr[i][j] = 2;
                    } else if (j < k && (i < k)&& (j + i < n - 1) && (i > j) && (j != k) && (i != k)) {
                        arr[i][j] = 3;
                    } else if (i > k && (j < k)&& (j + i < n - 1) && (i > j) && (j != k) && (i != k)) {
                        arr[i][j] = 4;
                    } else if (j < k && (i > k)&& (j + i > n - 1) && (i > j) && (j != k) && (i != k)) {
                        arr[i][j] = 5;
                    } else if (j > k && (i > k)&& (j + i > n - 1) && (i > j) && (j != k) && (i != k)) {
                        arr[i][j] = 6;
                    } else if (j > k && (i > k)&& (j + i > n - 1) && (i < j) && (j != k) && (i != k)) {
                        arr[i][j] = 7;
                    } else if (j > k && (i < k)&& (j + i > n - 1) && (i < j) && (j != k) && (i != k)) {
                        arr[i][j] = 8;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
