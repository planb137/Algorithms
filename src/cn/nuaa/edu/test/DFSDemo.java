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
        dfs(s.toCharArray(),0,new boolean[s.length()],new StringBuilder(),rs);
        return rs;
    }

    public static void dfs(char[] s,int index,boolean[] is,StringBuilder sb,ArrayList<String> rs){
        if(sb.length()== s.length){
            rs.add(sb.toString());
            return;
        }
        for (int i = 0; i < s.length; i++) {
            if(!is[i]){
                sb.append(s[i]);
                is[i] = true;

                dfs(s,index+1,is,sb,rs);

                sb.deleteCharAt(sb.length()-1);
                is[i] = false;
            }

        }

    }

    public static void main(String[] args) {
        String str = "ABCDE";
        ArrayList<String> res =  DFSDemo.search(str);
        System.out.println(res.size());
        for (String s :res
             ) {
            System.out.print(s+" ");
        }

    }
}
