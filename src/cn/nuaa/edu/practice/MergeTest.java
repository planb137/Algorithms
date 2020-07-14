package cn.nuaa.edu.practice;

import java.util.Arrays;

/**
 * @author planb
 * @date 2020/7/14 13:15
 * 备注：//
 * // Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1
 * // as one sorted array.
 *
 * // Note:
 *
 * // The number of elements initialized in nums1 and nums2 are m and n respectively.
 * // You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.
 * // Example:
 *
 * // Input:
 * // nums1 = [1,2,3,0,0,0], m = 3
 * // nums2 = [2,5,6],       n = 3
 *
 * //Output: [1,2,2,3,5,6]
 */
public class MergeTest {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int j = 0;
        for(int i = n; i < m+n; i++){

            nums1[i] = nums2[j++];
        }

        Arrays.sort(nums1);
    }
}
