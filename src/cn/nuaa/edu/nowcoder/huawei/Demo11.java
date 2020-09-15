package nuaa.edu.nowcoder.huawei;

import java.util.HashMap;

/**
 * @author planb
 * @date 2020/9/15 10:37
 * 备注：华为面试题
 */
public class Demo11 {
    static int f(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "aaa";
        System.out.println(Demo11.f(s));

    }
}
