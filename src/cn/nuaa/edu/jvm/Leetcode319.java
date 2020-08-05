package cn.nuaa.edu.jvm;

/**
 * @author planb
 * @date 2020/8/5 12:41
 * 备注：319. 灯泡开关
 */
public class Leetcode319 {

    public int bulbSwitch(int n) {
        int res = 0;
        for(int i = 1; i <= n; i++){
            double x = Math.sqrt(i);
            double y = x;
            if ((int)y == x){
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Leetcode319().bulbSwitch(99999));
    }
}
