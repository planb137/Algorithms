package cn.nuaa.edu.leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author planb
 * @date 2020/7/28 09:31
 * 备注：满足不等式的最大值(滑动窗口求最值)
 * 给你一个数组 points 和一个整数 k 。数组中每个元素都表示二维平面上的点的坐标，并按照横坐标 x 的值从小到大排序。也就是说 points[i] = [xi, yi] ，
 * 并且在 1 <= i < j <= points.length 的前提下， xi < xj 总成立。
 * 请你找出 yi + yj + |xi - xj| 的 最大值，其中 |xi - xj| <= k 且 1 <= i < j <= points.length。
 * 题目测试数据保证至少存在一对能够满足 |xi - xj| <= k 的点。
 */
public class LeetCode1499 {
    public int findMaxValueOfEquation(int[][] points, int k) {
        Deque<Integer> dq = new LinkedList<>();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < points.length; i++) {
            int x = points[i][0];
            int y = points[i][1];

            while(!dq.isEmpty() && x - points[dq.peekFirst()][0] > k) {
                dq.removeFirst();
            }

            if (!dq.isEmpty()) {
                int t = dq.peekFirst();
                max = Math.max(max, x + y + points[t][1] - points[t][0]);
            }

            while (!dq.isEmpty() &&  y - x >= points[dq.peekLast()][1] - points[dq.peekLast()][0]) {
                dq.removeLast();
            }

            dq.addLast(i);

        }
        return max;
    }
}
