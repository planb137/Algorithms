package nuaa.edu.nowcoder.wangyi;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author planb
 * @date 2020/8/7 12:28
 * 备注：实现删除字符串中出现次数最少的字符，若多个字符出现次数一样，则都删除。输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序。
 */
public class Demo1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.next();
            dealStr(str);
        }

        sc.close();
    }

    public static void dealStr(String str){
        int[] upper = new int[26];
        int[] lower = new int[26];
        int len = str.length();
        //统计各字母出现的次数并放进对应的 大写/小写 统计数组中
        for(int i = 0; i < len; i++){
            char c = str.charAt(i);
            if(c >= 'a' && c <= 'z'){
                lower[c - 'a']++;
            }else{
                upper[c - 'A']++;
            }
        }
        //找出最少的次数
        int min = 65536;
        for(int i = 0; i < lower.length; i++){
            if(lower[i] >0 && lower[i] < min){
                min = lower[i];
            }
            if(upper[i] >0 && upper[i] < min){
                min = upper[i];
            }
        }
        //将出现次数为最少次数的字符加入进hs中
        HashSet<Character> hs = new HashSet<Character>();
        for(int i = 0; i < lower.length; i++){
            if(lower[i] == min){
                hs.add((char)(i + 'a'));
            }
            if(upper[i] == min){
                hs.add((char)(i + 'A'));
            }
        }
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < len; i++){
            char c = str.charAt(i);
            if(!hs.contains(c)){
                sb.append(c);
                //后面多出zzzz？（之前用这种多出了zzzz）
                //  System.out.print(c);
            }
        }
        System.out.println(sb.toString());
    }
}
