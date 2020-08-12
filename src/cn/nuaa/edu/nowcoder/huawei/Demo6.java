package cn.nuaa.edu.nowcoder.huawei;

import java.util.Scanner;

/**
 * @author planb
 * @date 2020/8/12 14:55
 * 备注：
 */
public class Demo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.nextLine().toUpperCase().toCharArray();
        char[] temp = sc.nextLine().toCharArray();
        char c = temp[0];
        int sum = 0;
        for (int i = 0; i <s.length ; i++) {
            if(c == s[i] || c == (char)(s[i] + 32) ){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
