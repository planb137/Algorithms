package nuaa.edu.acwing;

import java.util.Scanner;

/**
 * @author planb
 * @date 2020/8/19 18:49
 * 备注：acwing mergesort
 */
public class MergeSort {
    public static int[] temp;

    public static void sort(int[] num, int l, int r) {
        if (l >= r) {
            return;
        }
        int mid = l + r >> 1;
        sort(num, l, mid);
        sort(num, mid + 1, r);
        //开始merge
        int k = 0, i = l, j = mid + 1;
        while (i <= mid && j <= r) {
            if (num[i] <= num[j]) {
                temp[k++] = num[i++];
            } else {
                temp[k++] = num[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = num[i++];
        }
        while (j <= r) {
            temp[k++] = num[j++];
        }

        for (int m = l, n = 0; m <= r;) {
            num[m++] = temp[n++];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        temp = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        sort(num, 0, n - 1);

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }

    }
}
