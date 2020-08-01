package cn.nuaa.edu.leetcode;

/**
 * @author planb
 * @date 2020/8/1 14:27
 * 备注：Leetcode1493
 */
public class Leetcode1493 {
    public int longestSubarray(int[] nums) {
        int k = nums.length;
        int res = 0;
        for(int i = 0,j = 0,z = 0;i < k; i++){
            if (nums[i] == 0) { z++;}
            while(z > 1 ){
                //z -= !nums[j++];
                if(nums[j++] == 0){
                    z--;
                }
            }
            res = Math.max(res,j - i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,1,1,0,1,1,0,1};
        System.out.println(new Leetcode1493().longestSubarray(nums));
    }

}
