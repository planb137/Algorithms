package cn.nuaa.edu.leetcode;

import java.util.ArrayList;

/**
 * @author planb
 * @date 2020/7/17 20:58
 * 备注：
 */
public class Demo1 {
    public int numIdenticalPairs(int[] nums) {
        int time =0;
        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]  && (i<j)){
                    time++;
                }
            }
        }
        return time;
    }

    public static void main(String[] args) {
        ArrayList<String> res = new ArrayList<>();
        res.add("abc");
        res.add("acb");
        res.add("cab");
        //res.toArray();
        res.toArray(new String[res.size()]);
        // res.toArray(new String[res.size()]);
        //res.toArray(new String[res.size()]);
        //res.toArray(new String[res.size()]);

    }
}
