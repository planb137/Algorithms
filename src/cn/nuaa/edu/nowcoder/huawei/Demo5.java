package cn.nuaa.edu.nowcoder.huawei;


import java.util.Scanner;

/**
 * @author planb
 * @date 2020/8/12 14:39
 * 备注：写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
 */
public class  Demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.nextLine().toUpperCase().toCharArray();
        char[] temp = sc.nextLine().toCharArray();
        int c = (int)temp[0];
        int sum = 0;
        for (int i = 0; i <s.length ; i++) {
            if(c == (int)s[i] || c == (int)s[i] +32 ){
                sum++;
            }
        }
        System.out.println(sum);
    }
}

