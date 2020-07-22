package cn.nuaa.edu.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author planb
 * @date 2020/7/22 16:09
 * 备注：
 */
public class Demo17 {
   static char[][] input = new char[][]{
            {},{},
            {'a','b','c'},
            {'d','e','f'},
            {'g','h','i'},
            {'j','k','l'},
            {'m','n','o'},
            {'p','q','r','s'},
            {'t','u','v'},
            {'w','x','y','z'}
    };
    public List<String> letterCombinations(String str){
        ArrayList<String> res = new ArrayList<>();
        if (str.length() == 0){
            return res;
        }
        dfs(str,0,new StringBuilder(),res);
        return res;
    }
    public static void dfs(String str, int index,StringBuilder sb,ArrayList<String> res){
        if(index == str.length()){
            res.add(sb.toString());
        }
        for(char c : input[str.charAt(index) - '0']){
            sb.append(c);
            dfs(str, index+1, sb, res);
            sb.deleteCharAt(sb.length()-1);
        }

    }

}
