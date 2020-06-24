package cn.nuaa.edu.practice;

import java.util.Arrays;

/**
 * @author planb
 * @date 2020/6/24 16:29
 * 备注：
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int minSum = nums[0]+nums[1]+nums[2];
        int length = nums.length;
        Arrays.sort(nums);
        for (int i = 0 ;i < length ;i++){
            if (nums[i]==nums[i-1]){
                continue;
            }
            int j = i+1;
            int k = length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                int temp = sum-target;
                if (temp==0){
                    minSum = temp;
                    return temp;
                }
                if (temp>0){
                    k--;
                }
                if (temp<0){
                    j++;
                }

            }
        }
        return minSum;
    }
}
