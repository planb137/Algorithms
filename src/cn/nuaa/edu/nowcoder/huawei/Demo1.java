package cn.nuaa.edu.nowcoder.huawei;

import java.util.Scanner;

/**
 * @author planb
 * @date 2020/8/10 15:14
 * 备注：(华为：汽水瓶)
 * 有这样一道智力题：“某商店规定：三个空汽水瓶可以换一瓶汽水。小张手上有十个空汽水瓶，她最多可以换多少瓶汽水喝？”答案是5瓶，
 */
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 10;
        while (T-- != 0) {
            int n = sc.nextInt();
            if (n == 0) {
              break;
            }
            int sum = 0;
            while (n>=2){
                if(n == 2){
                    sum++;
                    n = 0;
                    break;
                }
                int a = n / 3;
                sum += a;
                n = a + n % 3;//剩余空瓶
            }
            System.out.println(sum);
        }
    }
}
