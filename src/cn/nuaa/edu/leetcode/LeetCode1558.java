package nuaa.edu.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author planb
 * @date 2020/8/27 15:05
 * 备注：得到目标数组的最少函数调用次数
 */
public class LeetCode1558 {
    public int minOperations(int[] nums) {
        int k = 0;
        int one = 0;
        for (int i = 0; i < nums.length; i++) {
            int bits = 0;
            int o = 0;
            while (nums[i] > 0) {
                bits++;
                if ((nums[i] & 1) == 1) {
                    o++;
                }
                nums[i] >>= 1;
            }
            k = Math.max(k, bits);
            one += o;
        }
        return one + k - 1;
    }

    @Test
    public void test() {
        int[] num = {4, 2, 5};
        Assert.assertEquals(6, minOperations(num));
    }

}
