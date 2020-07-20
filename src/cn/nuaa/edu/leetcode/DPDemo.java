package cn.nuaa.edu.leetcode;

/**
 * @author planb
 * @date 2020/7/18 14:29
 * 备注：递归方式（时间复杂度高）,非递归o(n)*/
public class DPDemo {
    public static int dp_rec(int[] nums,int i){
        if (i == 0){
            return nums[0];
        }
        else if(i == 1){
            return Math.max(nums[0],nums[i]);
        }else {
            int a = dp_rec(nums,i -2)+nums[i];
            int b = dp_rec(nums, i-2);
            return Math.max(a, b);
        }
    }
    public static int dp_noRec(int[] nums){
        int[] opt = new int[nums.length];
        opt[0] = nums[0];
        opt[1] = Math.max(nums[0],nums[1]);
        for (int j = 2; j <nums.length ; j++) {
            int a = opt[j-2]+nums[j];
            int b = opt[j-1];
            opt[j] = Math.max(a, b);
        }
        return opt[nums.length-1];
    }

    public static void main(String[] args) {
        //int[] arr ={1,2,4,1,7,8,3};
        int[] arr ={4,1,1,9,1};
        //System.out.println(dp_rec(arr, arr.length-1));
        //System.out.println(dp_rec(arr, arr.length-1));
        System.out.println(dp_noRec(arr));
    }
}
