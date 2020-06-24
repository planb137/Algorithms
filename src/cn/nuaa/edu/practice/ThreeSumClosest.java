package cn.nuaa.edu.practice;

import java.util.Arrays;

/**
 * @author planb
 * @date 2020/6/24 16:29
 * 备注：
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int minSum = 10000000;
        int length = nums.length;
        Arrays.sort(nums);
        for (int i = 0 ;i < length ;i++){
            if (i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j = i+1;
            int k = length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                int temp = sum-target;
                if (temp==0){
                    return temp;
                }
                if(Math.abs(sum-target)<Math.abs(minSum-target)){
                        minSum = sum;
                }
                if (temp>0){
                    int k0 = k-1;
                    while (j<k0 && nums[k0]==nums[k]){
                        k0--;
                    }
                    k = k0;
                } else {
                    int j0 =j+1;
                    while(j0<k && nums[j] == nums[j0]){
                        j0++;
                    }
                    j=j0;
                }
            }
        }
        return minSum;
    }
}
