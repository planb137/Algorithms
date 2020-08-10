package cn.nuaa.edu.practice;

import java.util.Arrays;

/**
 * @author planb
 * @date 2020/7/14 20:02
 * 备注：插入排序
 */
public class InsertSort {
    public static void insertSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    swap(nums, j, j - 1);
                }
            }
        }

    }

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] a = {3, 6, 1, 9, 3, 6, 8, 0, 1};
        insertSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
