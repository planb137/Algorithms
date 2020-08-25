package nuaa.edu.acwing;

import java.util.Scanner;

/**
 * @author planb
 * @date 2020/8/25 10:53
 * 备注：acwingTes - 注意sc.nextLine() 与 sc.next()的区别
 */
public class ACWingTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //注意这里不能用sc.nextLine()，最好多加一个字符;
        String s1 = " " + sc.nextLine();
        String s2 = " " + sc.nextLine();
        String s3 = " " + sc.nextLine();
        System.out.println(s1 + "===" + s1.length());
        System.out.println(s2 + "===" + s2.length());
        System.out.println(s3 + "===" + s3.length());
    }
}
