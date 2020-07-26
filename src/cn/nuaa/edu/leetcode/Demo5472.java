package cn.nuaa.edu.leetcode;

/**
 * @author planb
 * @date 2020/7/26 14:14
 * 备注：
 */
public class Demo5472 {
    public String restoreString(String s, int[] indices) {
        char[] str = new char[s.length()];
        int i = 0;
        for (char c: s.toCharArray()) {
            str[indices[i++]] = c;
        }
        return new String(str);
    }
}
