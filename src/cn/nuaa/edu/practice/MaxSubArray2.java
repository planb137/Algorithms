package cn.nuaa.edu.practice;

/**
 * @author planb
 * @date 2020/6/23 14:45
 * 备注：
 */
public class MaxSubArray2 {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return 0;
        }
        int sum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (sum < 0) {
                sum = nums[i];
            }
            else {
                sum += nums[i];
            }
            if (sum > maxSum)
            {
                maxSum = sum;
            }
        }
        return maxSum;
    }
}
