package cn.nuaa.edu.leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author planb
 * @date 2020/7/27 21:10
 * 备注：滑动窗口的最大值
 */
public class LeetCode239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n  = nums.length;
        if(n == 0){
            return new int[]{};
        }
        Deque<Integer> dq = new LinkedList<>();
        int[] res = new int[n - k +1];
        int j = 0;

        for(int i = 0; i < n; i++){
            int index = i - k + 1;
            if (dq.isEmpty()){
                dq.addLast(i);
            }
            if (index > dq.peekFirst()){
                dq.removeFirst();
            }

            while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]){
                dq.removeLast();
            }
            dq.addLast(i);

            if(index >= 0){
                res[j++] = nums[dq.peekFirst()];
            }
        }
        return res;
    }
}
