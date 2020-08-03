package cn.nuaa.edu.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author planb
 * @date 2020/8/3 14:32
 * 备注：重新排列句子中的单词(解法二;使用自定义的比较器排序)
 */
public class Leetcode14512 {
    public String arrangeWords(String text) {
        String[] str =text.toLowerCase().split(" ");
        Arrays.sort(str, (o1,o2)->{
            return o1.length() - o2.length();
        });
        StringBuilder sb = new StringBuilder();
       // str[0].replace(str[0].charAt(0), (char)(str[0].charAt(0)-32));

        for (int i = 0; i < str.length; i++) {
           sb.append(str[i]).append(" ");
        }
        char[] chars = sb.toString().trim().toCharArray();
        chars[0] = (char) (chars[0]-32);
        return new String(chars);
    }
    public String arrangeWords2(String text) {
        String[] str =text.toLowerCase().split(" ");
        List<String> list2 = new ArrayList<>();
        Arrays.sort(str, (o1,o2)-> o1.length() - o2.length());

        for (int i = 0; i < str.length; i++) {
            list2.add(str[i]);
        }
        String res = String.join(" ", list2);
        return res.substring(0, 1).toUpperCase()+res.substring(1);
    }

}
