package nuaa.edu.acwing.basic;

/**
 * @author planb
 * @date 2020/8/20 10:40
 * 备注：lowbit （x & -x）: 返回x的最后一位1 例子：求二进制表示中1的个数
 */
public class LowBit {
    public static int lowBit(int x) {
        return x & -x;
    }

    public static void main(String[] args) {
        int n = 5;
        int res = 0;
        while (n != 0) {
            n -= lowBit(n);
            //System.out.println(n);
            res++;
        }
        System.out.println(res);
    }
}
