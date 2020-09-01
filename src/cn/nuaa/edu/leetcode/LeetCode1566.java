package nuaa.edu.leetcode;

import org.junit.Test;

/**
 * @author planb
 * @date 2020/9/1 17:08
 * 备注：leetcode1566：重复至少K次且长度为 M 的模式
 */
public class LeetCode1566 {
    public boolean containsPattern(int[] arr, int m, int k) {
        int n = arr.length;
        for (int i = 0; i + m * k <= n; i++) {
            boolean flag = true;
            for (int j = i; j < i + k * m; j++) {
                if (arr[j] != arr[i + (j - i) % m]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return true;
            }
        }
        return false;
    }

    @Test
    public void test() {
        int[] x = {1, 2, 3, 1, 2};
        int m = 2;
        int k = 2;
        System.out.println(new LeetCode1566().containsPattern(x, m, k));
    }
}
