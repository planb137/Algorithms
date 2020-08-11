package cn.nuaa.edu.test;

/**
 * @author planb
 * @date 2020/8/11 12:55
 * 备注：gcd辗转相除法
 */
public class GcdDemo {
    public static int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        } else {
            return gcd(b,a%b);
        }

    }
    public static void main(String[] args) {
        System.out.println(gcd(500,300 ));
    }

}
