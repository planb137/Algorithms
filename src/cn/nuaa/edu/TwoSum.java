package cn.nuaa.edu;

import java.util.HashMap;

/**
 * @author planb
 * @date 2020/5/16 13:48
 * 备注：
 */
public class TwoSum {
    public static void main(String[] args) {
        int input[] = {2, 7, 11, 15};
        int target = 9;
        int rs[] = sum(input, target);
        for (int j = 0;j<rs.length;j++){
            System.out.println(rs[j]);
        }
    }

    public static int[] sum(int[] x, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < x.length; i++) {
            map.put(x[i], i);
        }
        for (int i = 0; i < x.length; i++) {
            int temp = target - x[i];
            if (map.containsKey(temp) && map.get(temp) != i) {
                return new int[]{map.get(temp), i};
            }
        }
        throw new IllegalArgumentException("NO TWO SUM SOLUTION");
    }
}
