package cn.nuaa.edu.leetcode;

/**
 * @author planb
 * @date 2020/8/1 15:33
 * 备注：
 */
public class Leetcode14932 {
    public int longestSubarray(int[] nums) {
        int k = nums.length;
        int res = 0;
        for(int i = 0,j = i+1;i < k; i++){
            int z = 0;
            if (nums[i] == 0) { z ++;}
            while(z <= 1){
                //z -= !nums[j++]
                //int temp = nums
                if(nums[++j] == 0 ) {
                    z++;
                }
            }
            res = Math.max(res, j - i -1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,1,1,0,1,1,0,1};
        System.out.println(" === "+new Leetcode14932().longestSubarray(nums));
    }

}
