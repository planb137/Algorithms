package cn.nuaa.edu.offer;

import java.util.Random;

/**
 * @author planb
 * @date 2020/6/29 14:05
 * 备注：
 */
public class FndKthLargest {
    Random random = new Random();
    public static int index;

    public int findKthLargest(int[] nums, int k) {
        index = nums.length - k;
        return quickSelect(nums, 0, nums.length - 1);
    }

    public int quickSelect(int[] a, int l, int r) {
        int q = randomPartition(a, l, r);
        if (q == index) {
            return a[q];
        } else {
            return q < index ? quickSelect(a, q + 1, r) : quickSelect(a, l, q - 1);
        }
    }

    public int randomPartition(int[] a, int l, int r) {
        int i = random.nextInt(r - l + 1) + l;
        swap(a, i, r);
        return partition(a, l, r);
    }

    public int partition(int[] a, int l, int r) {
        int x = a[r], i = l - 1;
        for (int j = l; j < r; ++j) {
            if (a[j] <= x) {
                swap(a, ++i, j);
            }
        }
        swap(a, i + 1, r);
        return i + 1;
    }

    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
