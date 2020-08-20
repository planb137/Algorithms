package nuaa.edu.acwing.basic;

import java.math.BigDecimal;

/**
 * @author planb
 * @date 2020/8/20 09:13
 * 备注：高精度：BigDecimal
 */
public class HighAccuracy {
    public static void main(String[] args) {
        BigDecimal bd = new BigDecimal("131313131");
        BigDecimal b = bd.add(new BigDecimal("1313131"));
        System.out.println(b.toString());
    }
}
