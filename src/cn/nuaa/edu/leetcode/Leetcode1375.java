package cn.nuaa.edu.leetcode;

/**
 * @author planb
 * @date 2020/8/5 13:08
 * 备注：1375. 灯泡开关 III
 */
public class Leetcode1375 {
    public int numTimesAllBlue(int[] light) {
        int res = 0;
        int max = -1;
        for(int i = 0; i < light.length; i++){
            max = Math.max(max,light[i]);
            if(max == i+1){
                res++;
            }
        }
        return res;
    }
}
