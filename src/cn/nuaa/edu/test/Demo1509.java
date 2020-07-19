package cn.nuaa.edu.test;

import java.util.Arrays;

/**
 * @author planb
 * @date 2020/7/19 19:59
 * 备注：
 */
public class Demo1509 {
    public int minDifference(int[] nums) {
        Arrays.sort(nums);
        if(nums.length <= 3){
            return 0;
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0,j = 3; i < 3; i++,j--) {
            res = Math.min(res, nums[nums.length-j-1]-nums[i]);
        }
        return res;
    }
}
