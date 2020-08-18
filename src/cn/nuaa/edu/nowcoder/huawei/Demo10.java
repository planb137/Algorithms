package nuaa.edu.nowcoder.huawei;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author planb
 * @date 2020/8/18 15:05
 * 备注：每组数据输入一个字符串，字符串最大长度为100，且只包含字母，不可能为空串，区分大小写。
 */
public class Demo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Character> set = new HashSet<>();
        while (sc.hasNext()) {
            StringBuilder sb = new StringBuilder();
            char[] str = sc.nextLine().toCharArray();
            for (int i = 0; i < str.length; i++) {
                if(!set.contains(str[i])){
                    set.add(str[i]);
                    sb.append(str[i]);
                }else {
                    continue;
                }
            }
            System.out.println(sb.toString());
        }
    }
}
