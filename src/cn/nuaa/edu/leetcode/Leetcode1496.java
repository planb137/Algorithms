package cn.nuaa.edu.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author planb
 * @date 2020/7/30 20:22
 * 备注：1496. 判断路径是否相交
 */
public class Leetcode1496 {
    public boolean isPathCrossing(String path) {
        Map<Integer,ArrayList<Integer>> map = new HashMap<>();
        ArrayList<Integer> li = new ArrayList<>();
        li.add(0);
        map.put(0,li);
        int x = 0,y = 0;
        char[] arr = path.toCharArray();
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 'N'){
                y++;
            }else if(arr[i] == 'S'){
                y--;
            }else if(arr[i] == 'W'){
                x--;
            }else {
                x++;
            }
            ArrayList<Integer> list2 = new ArrayList<>();
            if(map.containsKey(x)){
                ArrayList<Integer> list = map.get(x);
                if(list.contains(y)){
                    return true;
                }
                list.add(y);
                map.put(x,list);
            }else{
                list2.add(y);
                map.put(x,list2);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Map<Integer,int[]> map = new HashMap<>();
        ArrayList<Integer> li = new ArrayList<>();
        li.add(0);
        map.put(1, new int[]{8});
        int[] x  = map.get(1);
        for(int i = 0;i<x.length;i++){
            System.out.println(x[i]);
        }
    }
}
