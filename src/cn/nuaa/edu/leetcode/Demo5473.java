package cn.nuaa.edu.leetcode;

/**
 * @author planb
 * @date 2020/7/26 14:24
 * 备注： 灯泡开关 IV
 */
public class Demo5473 {
    public int minFlips(String target) {
        int res = 0;
        char pivot = '0';
        char[] s = new String(target).toCharArray();
        for(int i=0;i<target.length();i++) {
            if(target.charAt(i) != pivot) {
                res++;
                if(pivot == '0'){
                    pivot = '1';
                }else {
                    pivot = '0';
                }
            }
        }
        return res;
    }
}
