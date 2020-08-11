package cn.nuaa.edu.test;


import java.util.HashMap;
import java.util.Map;

/**
 * @author planb
 * @date 2020/8/10 16:42
 * 备注：
 */
public class UnitTest {
    static Map<Character,Integer> map =  new HashMap<Character,Integer>();
    public static void hex() {
        map.put('A', 10);
        map.put('B', 11);
        map.put('C', 12);
        map.put('D', 13);
        map.put('E', 14);
        map.put('F', 15);

        String s = "0xA";
        String str = s.substring(2);
        char[] arr = str.toCharArray();
        System.out.println(new String(arr));
        int j = 0;
        long sum = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if(!map.containsKey(arr[i])){
                sum += Math.pow(16,j++) * arr[i];
            }else {
                sum += Math.pow(16,j++) * map.get(arr[i]);
            }
        }
        System.out.println(sum+"");
    }

    public static void main(String[] args) {
        System.out.println(Integer.parseInt("10101010101", 2));
        System.out.println(Integer.decode("0xA"));
    }
}

