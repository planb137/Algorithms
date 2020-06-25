package cn.nuaa.edu.test;

import cn.nuaa.edu.practice.ThreeSumClosest;
import cn.nuaa.edu.practice.WordBreak;
import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.List;

/**
 * @author planb
 * @date 2020/6/24 21:32
 * 备注：
 */
public class EveryMainTest {
    public static void main(String[] args) {
//        int[] nums = {-1,2,3,-4};
//        int target = 4;
//        ThreeSumClosest threeSumClosest = new ThreeSumClosest();
//        System.out.println(threeSumClosest.threeSumClosest(nums,target));
        String s = "leetcode";
        ArrayList<String> list = new ArrayList<>();
        list.add("leet");
        list.add("code");
        System.out.println(new WordBreak().wordBreak(s,list));

    }
}
