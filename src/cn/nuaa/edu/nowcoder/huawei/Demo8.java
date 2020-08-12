package cn.nuaa.edu.nowcoder.huawei;

import java.util.Scanner;

/**
 * @author planb
 * @date 2020/8/12 15:36
 * 备注：huawei笔试：字符串分隔
 */
public class Demo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            int mod = s.length() % 8;
            if(mod != 0){
                for (int i = 1; i <= 8 - mod; i++) {
                    s = s + "0";
                }
            }
            while (s.length()>0){
                System.out.println(s.substring(0,8));
                s = s.substring(8);
            }

        }
    }
}
