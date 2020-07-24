package cn.nuaa.edu.test;

import java.util.ArrayList;

/**
 * @author planb
 * @date 2020/7/21 16:45
 * 备注：dfs 写全排列
 */
public class DFSDemo {
    public static ArrayList<String> search(String s){
        ArrayList<String> rs = new ArrayList<>();
        dfs(s.toCharArray(),new boolean[s.length()],new StringBuilder(),rs);
        return rs;
    }

    public static void dfs(char[] s,boolean[] is,StringBuilder sb,ArrayList<String> rs){
        if(sb.length()== s.length){
            rs.add(sb.toString());
            return;
        }
        for (int i = 0; i < s.length; i++) {
            if(!is[i]){
                sb.append(s[i]);
                is[i] = true;

                dfs(s,is,sb,rs);

                sb.deleteCharAt(sb.length()-1);
                is[i] = false;
            }

        }

    }

    public static void main(String[] args) {
        String str = "ABC";
        ArrayList<String> res =  DFSDemo.search(str);
        System.out.println(res.size());
        for (String s :res
             ) {
            System.out.print(s+" ");
        }
   /*     ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(5);
        System.out.println(list.toString());*/
 /*      StringBuilder s = new StringBuilder("19216801");
        System.out.println(s.delete(7,Integer.MAX_VALUE));*/
       // System.out.println(s);


    }
}
