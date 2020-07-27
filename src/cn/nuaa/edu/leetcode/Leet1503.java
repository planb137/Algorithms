package cn.nuaa.edu.leetcode;

/**
 * @author planb
 * @date 2020/7/27 15:15
 * 备注：所有蚂蚁掉下来前的最后一刻
 */
public class Leet1503 {
    public int getLastMoment(int n, int[] left, int[] right) {
        int max = -1;
        for(int i = 0; i < left.length; i++){
            max = Math.max(left[i],max);
        }
        for(int i = 0; i < right.length; i++){
            max = Math.max(n - right[i],max);
        }

        return max;
    }
}
