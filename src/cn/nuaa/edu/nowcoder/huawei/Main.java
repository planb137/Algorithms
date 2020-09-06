package nuaa.edu.nowcoder.huawei;

import java.util.Scanner;

/**
 * @author planb
 * @date 2020/9/6 19:12
 * 备注：2020/9/6 华为笔试30%
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();
        String[] s = str.split(";");
        String[] s0 =s[0].split(" ");
        String[] s1 =s[1].split(" ");
       // int n = s.length;
        char[] end = s[1].toCharArray();
        int dot = 0;
        for (int i = 0; i < end.length; i++) {
            if (end[i] == ',' || end[i] == '.' || end[i] == '?') {
                dot++;
            }
        }
        int num = s1.length + dot;
        int dif= 0;
        int j = 0;
        for (int i = 0; i < s0.length-1; i++) {
            if (s0[i].equals(s1[j])){
                continue;
            }else {
                dif+=2;
            }
            j++;
        }
        System.out.println("("+dif+","+num+")");
    }
}
