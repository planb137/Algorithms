package nuaa.edu.acwing;

/**
 * @author planb
 * @date 2020/9/2 16:55
 * 备注：最大公约数gcd，最小公倍数lcm
 */
public class GcdDemo {
    //最小公倍数lcm
    public static long lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    //最大公约数gcd
    public static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(gcd(6, 8));
        System.out.println(lcm(6, 8));
    }
}
