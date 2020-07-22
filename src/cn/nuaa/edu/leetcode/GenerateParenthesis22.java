package cn.nuaa.edu.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author planb
 * @date 2020/7/22 17:41
 * 备注：GenerateParenthesis22
 */
public class GenerateParenthesis22 {
    public List<String> generateParenthesis(int n) {
        char[] p = new char[]{'(',')'};
        int[] pb = new int[]{n,n};
        List<String> res = new ArrayList<>();
        dfs(n,p,pb,"",res);
        return res;
    }
    void dfs(int size,char[]p ,int[] pb,String s,List<String> res){
        if(s.length() == 2 * size){
            res.add(s);
            return;
        }
        if(pb[0]>0){
            pb[0]--;
            dfs(size,p,pb,s+p[0],res);
            pb[0]++;
        }
        if(pb[1]>0 && pb[0]!=pb[1]){
            pb[1]--;
            dfs(size,p,pb,s+p[1],res);
            pb[1]++;
        }
    }
}
