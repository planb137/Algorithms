package cn.nuaa.edu.nowcoder.huawei;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author planb
 * @date 2020/8/10 15:36
 * 备注：明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，他先用计算机生成了N个1到1000之间的随机整数（N≤1000）
 */
public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            //HashSet<Integer> set = new HashSet<>();
            TreeSet<Integer> set = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                //num[i] = (int) (Math.random() * 1000);
                //System.out.println(num[i]);
                set.add(sc.nextInt());
            }
            Iterator<Integer> iterator = set.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }

        }
    }
}
