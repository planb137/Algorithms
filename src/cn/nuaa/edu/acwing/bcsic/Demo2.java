package nuaa.edu.acwing.bcsic;

import java.util.Scanner;

/**
 * @author planb
 * @date 2020/8/19 20:25
 * 备注：（浮点数二分）二分法求平方很
 */
public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double l = 0, r = x;
        while (r - l > 1e-10) {
            double mid = (l + r) / 2.0d;
            if(mid * mid > x){
                r = mid;
            }else {
                l = mid;
            }
        }
        System.out.println(r);
    }
}
