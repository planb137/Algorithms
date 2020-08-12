package cn.nuaa.edu.nowcoder.huawei;

import java.util.Scanner;

/**
 * @author planb
 * @date 2020/8/12 15:43
 * 备注：写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
 */
public class Demo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f = sc.nextFloat();
        String s = String.format("%.1f", f);
        char[] num = s.toCharArray();
        if (num[num.length - 1] >= '5') {
            num[num.length - 3] += 1;
            System.out.println(new String(num).substring(0, num.length - 2));
        } else {
            System.out.println(new String(num).substring(0, num.length - 2));
        }

    }
}
