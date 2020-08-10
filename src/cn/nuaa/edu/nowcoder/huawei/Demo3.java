package cn.nuaa.edu.nowcoder.huawei;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author planb
 * @date 2020/8/10 16:01
 * 备注： 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。（多组同时输入 ）
 */
public class Demo3 {

    static Map<Character,Integer> map =  new HashMap<Character,Integer>();
    public static void main(String[] args) {
        map.put('A', 10);
        map.put('B', 11);
        map.put('C', 12);
        map.put('D', 13);
        map.put('E', 14);
        map.put('F', 15);

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
           // StringBuilder rs = new StringBuilder();
            String str = s.substring(2);
            char[] arr = str.toCharArray();
           // System.out.println(new String(arr));
            int j = 0;
            long sum = 0;
            for (int i = arr.length - 1; i >= 0; i--) {
                if(!map.containsKey(arr[i])){
                    sum += Math.pow(16,j++) * (arr[i] - '0');
                }else {
                    sum += Math.pow(16,j++) * map.get(arr[i]);
                }
            }
            System.out.println(sum+"");
        }
    }
}
