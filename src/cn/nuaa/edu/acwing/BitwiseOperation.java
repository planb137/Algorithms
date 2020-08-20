package nuaa.edu.acwing;

/**
 * @author planb
 * @date 2020/8/20 10:25
 * 备注：n的二进制表示中第k为是多少 n >> k & 1
 */
public class BitwiseOperation {
    public static void main(String[] args) {
        int n = 10;
        for (int k = 3; k >= 0 ; k--) {
            System.out.print((n >> k & 1)+" ");
        }

        System.out.println("--------------");
        System.out.println(Integer.toBinaryString(10));
    }
}
