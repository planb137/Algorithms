package nuaa.edu.nowcoder.wangyi;

import java.util.Scanner;

/**
 * @author planb
 * @date 2020/8/7 16:55
 * 备注：质数因子
 */
public class Demo3 {
    public static void isPrim(long x){
        while(x != 1){
            for(int i =2; i <= x; i++){
                if(x % i == 0){
                    x = x/i;
                    System.out.print(i+" ");
                    break;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        isPrim(n);
    }
}
