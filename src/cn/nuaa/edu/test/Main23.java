package nuaa.edu.test;

import com.sun.deploy.util.StringUtils;

import java.util.StringJoiner;

/**
 * @author planb
 * @date 2020/10/6 22:06
 * 备注：测试StringJoiner
 */
public class Main23 {
    public static void main(String[] args) {
        int x = 2;
        System.out.println(x+Integer.MAX_VALUE);
        int[] a = {1,2,33,4,4,4};
        StringJoiner joiner = new StringJoiner(",");
        for (int s1 :a) {
            joiner.add(String.valueOf(s1));
        }
        String string = joiner.toString();
        System.out.println(string);
        //-2147483648
    }

}
