package nuaa.edu.acwing;

import java.util.Scanner;

/**
 * @author planb
 * @date 2020/8/19 16:04
 * 备注：acwing -quickSort
 */
public class QucikSort {
    public static void sort(int[] num, int l, int r) {
        if (l >= r) {
            return;
        }
        int x = num[l], i = l, j = r;

        while (i < j) {
            while (num[i] < x) {
                i++;
            }
            while (num[j] > x) {
                j--;
            }

            if (i < j) {
                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;
            }
        }
        sort(num, l, j);
        sort(num, j + 1, r);

    }

    public static void main(String[] args) {
        // int[] num = {3, 4, 1, -2, 0, 8};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        sort(num, 0, n - 1);
        for (int x : num) {
            System.out.print(x + " ");
        }
    }

}
