package cn.nuaa.edu.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author planb
 * @date 2020/7/30 19:40
 * 备注：1497. 检查数组对是否可以被 k 整除
 */
public class Leetcode1497 {
    public boolean canArrange(int[] arr, int k) {
        int size = arr.length;
        int[] temp = new int[k];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < size; i++){
            int x = (arr[i] % k +k) % k; //有负数的解决方法
            if(map.containsKey(x)){
                map.put(x,map.get(x) + 1);
            }
            else{
                map.put(x,1);
            }
        }

        for(Integer y : map.keySet()){
            if(y == 0){
                if (map.get(y) % 2 !=0){
                    return false;
                }
            }else if(!map.get(y).equals(map.get(k-y))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {-1,1,-2,2,-3,3,-4,4};
        System.out.println(new Leetcode1497().canArrange(arr, 3));
    }
}
