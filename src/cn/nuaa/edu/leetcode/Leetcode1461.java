package nuaa.edu.leetcode;

/**
 * @author planb
 * @date 2020/8/27 16:41
 * 备注：数组异或操作
 */
public class Leetcode1461 {
    public int xorOperation(int n, int start) {
        int res = start;
        for (int i = 1; i < n; i++) {
            res ^= (start + 2 * i);
        }
        return res;
    }
}