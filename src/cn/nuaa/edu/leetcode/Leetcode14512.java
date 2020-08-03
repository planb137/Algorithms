package cn.nuaa.edu.leetcode;

import java.util.Arrays;

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
}
