package cn.nuaa.edu.nowcoder.huawei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author planb
 * @date 2020/8/12 15:04
 * 备注：连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 */
public class Demo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            char[] s = sc.nextLine().toCharArray();
            String str = new String(s);
            int x = s.length / 8;
            int mod = s.length % 8;
            int start = 0;
            if (x > 0) {
                for (int i = 1; i <= x; i++) {
                    char[] c = new char[8];
                    Arrays.fill(c, '0');
                    System.out.println(str.substring(start, start + 8));
                    start = start + 8;
                }
                if (mod > 0) {
                    char[] c = new char[8];
                    Arrays.fill(c, '0');
                    for (int i = 0; i < mod; i++) {
                        c[i] = s[ x * 8 + i];
                    }
                    System.out.println(new String(c));
                }
            } else {
                char[] c = new char[8];
                Arrays.fill(c, '0');
                for (int i = 0; i < s.length; i++) {
                    c[i] = s[i];
                }
                System.out.println(new String(c));
            }

        }
    }
}
