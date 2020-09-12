package nuaa.edu.nowcoder.qushi;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author planb
 * @date 2020/9/12 19:40
 * 备注：趋势科技笔试
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        boolean flag = true;
        while (k != 0) {
            for (int i = 0; i < s.length()-1; i++) {
                if (s.charAt(i) > s.charAt(i + 1)) {
                    s = s.substring(0, i) + s.substring(i + 1 );
                    flag = false;
                    break;
                }
            }
            if (flag) {
                s = s.substring(0, s.length() - k);
            }
            k -= 1;
        }
        System.out.println(new BigInteger(s).toString());
    }

}
