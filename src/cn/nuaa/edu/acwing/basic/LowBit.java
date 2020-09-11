package nuaa.edu.acwing.basic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author planb
 * @date 2020/8/20 10:40
 * 备注：lowbit （x & -x）: 返回x的最后一位1 例子：求二进制表示中1的个数
 */
public class LowBit {
    //截取一个正整数的二进制表示里的最低位的 111 和它后面的所有的 000
    public static int lowBit(int x) {
        return x & -x;
    }

    public static void main(String[] args) {
       // List<String> list = new ArrayList<>();
        Number x = new Integer(2);
        System.out.println(String.valueOf(x));
        int n = 5;
        int res = 0;
        while (n != 0) {
            n -= lowBit(n);
            //System.out.println(n);
            res++;
        }
        System.out.println(res);
    }
    @Test
    public void testLowBit(){
        System.out.println(LowBit.lowBit(8));
    }

}
