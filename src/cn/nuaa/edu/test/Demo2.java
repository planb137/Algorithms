package cn.nuaa.edu.test;

import java.math.BigDecimal;

/**
 * @author planb
 * @date 2020/7/17 21:12
 * 备注：
 */
public class Demo2 {
    public int numSub(String s) {
        char[] x = s.toCharArray();
        int res = (int)(Math.pow(10, 9) + 7);
        long time = 0;
        long sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if(x[i] == '0'){
                sum+= ((time * (time+1))/2)%res;
                time = 0;
                continue;
            }else {
                time++;
            }
        }
        sum += ((time * (time+1))/2)%res;
        return (int)sum % res;
    }

}
