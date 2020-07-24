package cn.nuaa.edu.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author planb
 * @date 2020/7/23 14:49
 * 备注：剑指offer12，矩阵路径
 */
public class Offer12 {
    //解法一：
    public boolean exist(char[][] p, String word) {
        boolean[] res = new boolean[1];
        boolean[][] pb = new boolean[p.length][p[0].length];
        for(int i = 0;i < p.length ;i ++){
            for(int j = 0 ;j< p[0].length ; j++){
                if(p[i][j] == word.charAt(0)){
                    pb[i][j] = true;
                    dfs(p,pb,1,i,j,word,res);
                    pb[i][j] = false;
                }
                if(res[0]){
                    return true;
                }
            }
        }
        return false;
    }

    void dfs(char[][] p,boolean[][] pb,int index,int i, int j, String word,boolean[] res){
        //截止条件
        if(index == word.length()){
            res[0] = true;
            return;
        }
        //候选节点
        for(int[] loc : getNear(i,j,p.length,p[0].length)){
            if(!pb[loc[0]][loc[1]] && p[loc[0]][loc[1]] == word.charAt(index)){
                pb[loc[0]][loc[1]] = true;
                dfs(p,pb,index+1,loc[0],loc[1],word,res);
                pb[loc[0]][loc[1]] = false;
            }
        }

    }

    List<int[]> getNear(int i, int j, int x, int y){
        List<int[]> loc = new ArrayList<>();
        if(i-1>=0) {
            loc.add(new int[]{i-1,j});
        }
        if(j+1<y) {
            loc.add(new int[]{i,j + 1});
        }
        if(i+1<x) {
            loc.add(new int[]{i+1,j});
        }

        if(j-1>=0) {
            loc.add(new int[]{i,j-1});
        }
        return loc;
    }

    //解法二：推荐
    public boolean exist2(char[][] board, String word) {
        char[] words = word.toCharArray();
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(dfs2(board, words, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
    boolean dfs2(char[][] board, char[] word, int i, int j, int k) {
        if (i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != word[k])
        { return false;}
        if (k == word.length - 1) { return true;}

          char tmp = board[i][j];
          board[i][j] = '/';
          boolean res = dfs2(board, word, i + 1, j, k + 1) || dfs2(board, word, i - 1, j, k + 1) ||
                        dfs2(board, word, i, j + 1, k + 1) || dfs2(board, word, i, j - 1, k + 1);
          board[i][j] = tmp;
           return res;
    }

}