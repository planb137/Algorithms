package cn.nuaa.edu.nowcoder.huawei;

import java.util.Scanner;

/**
 * @author planb
 * @date 2020/8/12 14:35
 * 备注：计算字符串最后一个单词的长度，单词以空格隔开。
 */
public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split(" ");
        System.out.println(s1[s1.length-1].length());
    }
}


