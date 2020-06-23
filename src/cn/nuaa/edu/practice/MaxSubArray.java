package cn.nuaa.edu.practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author planb
 * @date 2020/6/23 14:15
 * 备注：
 */
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        Arrays.sort(nums);
        int max =nums[nums.length-1];
        for (int i =0;i<nums.length;i++){
            if(nums[i]<=0){
                continue;
            }
            int sum = nums[i];
            max = max < sum ? sum : max;
            for (int j=i+1;j<nums.length;j++){
                sum+=nums[j];
                if(max<sum){
                    max = sum;
                }
                if (sum<0){
                    i = j;
                    break;
                }

            }

        }
        return max;
    }
}
