package cn.nuaa.edu.practice;

/**
 * @author planb
 * @date 2020/6/28 12:08
 * 备注：
 */
public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int length = nums.length;
        for (int i = 0;i<length;i++){
            if (nums[i]<=0){
                nums[i] = length+1;
            }
        }
        for(int i = 0;i<length;i++){
            int num = Math.abs(nums[i]);//这里必须是取绝对值，不然会报错 Index -6 out of bounds for length 4
            if (num <= length){
                nums[num-1] = - Math.abs(nums[num-1]);
            }
        }
        for (int j = 0;j<length;j++){
            if (nums[j]>0){
                return j+1;
            }
        }
        return length+1;
    }
}

