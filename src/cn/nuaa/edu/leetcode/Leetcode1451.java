package cn.nuaa.edu.leetcode;

import java.util.*;

/**
 * @author planb
 * @date 2020/8/3 14:10
 * 备注：
 */
public class Leetcode1451 {
    int max = -1;
    public String arrangeWords(String text) {
        StringBuilder sb = new StringBuilder();
        String[] str =text.split(" ");
        Map<Integer, List<String>> map = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            max = Math.max(max,str[i].length());
            if (map.containsKey(str[i].length())){
                List<String> li = map.get(str[i].length());
                li.add(str[i]);
                map.put(str[i].length(),new ArrayList<>(li));
            }else {
                List<String> l2 = new ArrayList<>();
                l2.add(str[i]);
                map.put(str[i].length(),new ArrayList<>(l2));
            }
        }

        for (int i = 1; i <= max; i++) {
            if (map.containsKey(i)) {
                StringBuilder sb1 = new StringBuilder();
                for(String s : map.get(i)){
                    sb1.append(s).append(" ");
                }
                sb.append(sb1.toString());

            }
        }
        char[] array = sb.toString().trim().toLowerCase().toCharArray();
        array[0] = (char)(array[0]-32);
        return new String(array);
    }
}
