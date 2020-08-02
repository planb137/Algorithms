package cn.nuaa.edu.leetcode;

import java.util.*;

/**
 * @author planb
 * @date 2020/8/1 15:33
 * 备注：String[] str =(String []) res.toArray();
 *      String[] str2 = res.toArray(new String[res.size()]);
 */
public class Leetcode14932 {
    public int longestSubarray(int[] nums) {
        int k = nums.length;
        int res = 0;
        for(int i = 0;i < k; i++){
            int z = 0;
            if(nums[i] == 0){
                z++;
            }
            for (int j = i+1; j < k; j++) {
                if(nums[j] == 0){
                    z++;
                }
                if (j == k-1){
                    res = Math.max(res, j - i);
                    break;
                }
                if (z == 2 ){
                    res = Math.max(res, j - i -1);
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,0,1};
        System.out.println(" === "+new Leetcode14932().longestSubarray(nums));
        String s = "add";
        String s1 = "fsf";
        String xs = s+s1;
        List<String> res = new ArrayList<>();
        res.add("qsa");
        res.add("qka");
        res.add("qga");
        //String[] str =(String []) res.toArray();
        String[] str2 = res.toArray(new String[res.size()]);
        Map<String,Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        System.out.println(map.get("a"));
        Set<String> set = map.keySet();
        for (String s2 :map.keySet()) {
            System.out.println(s2+map.get(s2));
        }
        //System.out.println(map.containsKey("b"));
        List<String> list = new ArrayList<>();
        list.add("asa");
        list.add("asac");
        list.add("afa");
        System.out.println(list.get(0));

    }

}
