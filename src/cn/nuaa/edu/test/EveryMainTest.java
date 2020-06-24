package cn.nuaa.edu.test;

import cn.nuaa.edu.practice.ThreeSumClosest;

/**
 * @author planb
 * @date 2020/6/24 21:32
 * 备注：
 */
public class EveryMainTest {
    public static void main(String[] args) {
        int[] nums = {-1,2,3,-4};
        int target = 4;
        ThreeSumClosest threeSumClosest = new ThreeSumClosest();
        System.out.println(threeSumClosest.threeSumClosest(nums,target));
    }
}
