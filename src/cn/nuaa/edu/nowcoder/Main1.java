package nuaa.edu.nowcoder;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author planb
 * @date 2020/9/5 15:18
 * 备注：输出缺失的第一个正整数
 */
public class Main1 {
    static int find(int[] nums){
        int i = 0, k, m = 0;
        while(i < nums.length){
            if(nums[i] >= 1 && nums[i] <= nums.length && nums[k=nums[i]-1] != nums[i]){
                nums[k] ^= nums[i];
                nums[i] ^= nums[k];
                nums[k] ^= nums[i];
            }else {++i; }
        }
        for(i = 0; i < nums.length; ++i){
            if(nums[i] - m == 1){ m = nums[i]; }
        }
        return m+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] num = sc.nextLine().split(" ");
        int[] t = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            t[i] =Integer.parseInt(num[i]);
        }
        Arrays.sort(t);
        System.out.println(find(t));
    }
}
