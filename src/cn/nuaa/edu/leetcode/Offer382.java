package cn.nuaa.edu.leetcode;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author planb
 * @date 2020/7/20 14:08
 * 备注：
 */
public class Offer382 {

    public static ArrayList<String> res;
    public static int i = 0;

   public String[] permutation(String s) {
       ArrayList<String> characters = new ArrayList<>();
       //backtrace(s,characters);
       return res.toArray(new String[res.size()]);
    }
    public static int calc(int x){
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result =  result * i;
        }
        return result;
    }
    public static void backtrace(HashSet<Character> set, ArrayList<Character> list ){
        if (list.size() == set.size()){
           // String.valueOf(list).split(",").toString();
            StringBuilder builder = new StringBuilder();
            for (Character c1 :list) {
                builder.append(c1);
            }
            //res[i++] = new String(builder);
            return;
        }
        for (Character c :set ) {
            if (list.contains(c)){
                continue;
            }
            list.add(c);
            backtrace(set,list);
            list.remove(c);
        }
    }

    public static void main(String[] args) {
       new Offer382().permutation("aab");
     /*   for (int j = 0; j < res.length; j++) {
            System.out.print(res[j]+" ");
        }*/
    }
}
