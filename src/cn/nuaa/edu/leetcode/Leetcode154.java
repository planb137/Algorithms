package cn.nuaa.edu.leetcode;

/**
 * @author planb
 * @date 2020/8/5 17:25
 * 备注：154. 寻找旋转排序数组中的最小值 II
 */
public class Leetcode154 {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        while(l < r && nums[0] == nums[r]){
            r--;
        }

        if (nums[l] <= nums[r]) {
            return nums[0];
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
