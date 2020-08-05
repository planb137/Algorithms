package cn.nuaa.edu.leetcode;

/**
 * @author planb
 * @date 2020/8/5 17:06
 * 备注：153. 寻找旋转排序数组中的最小值
 */
public class Leetcode153 {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        if (nums[l] <= nums[r]) {
            return nums[l];
        }
        while (l < r) {
            int mid = l + r >> 1;
            if (nums[mid] < nums[0]) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return nums[r];
    }
}
