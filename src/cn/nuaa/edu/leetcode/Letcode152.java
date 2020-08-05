package cn.nuaa.edu.leetcode;

/**
 * @author planb
 * @date 2020/8/5 16:22
 * 备注：152. 乘积最大子数组
 */
public class Letcode152 {
    public int maxProduct(int[] nums) {
        int res = nums[0];
        int f = nums[0], g = nums[0];
        for(int i = 1; i < nums.length; i++){
            int a = nums[i];
            int fa = f * a;
            int ga = g * a;
            f = Math.max(a,Math.max(fa,ga));
            g = Math.min(a,Math.min(fa,ga));
            res = Math.max(res,f);
        }
        return res;
    }
}
