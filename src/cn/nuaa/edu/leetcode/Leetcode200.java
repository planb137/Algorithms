package cn.nuaa.edu.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author planb
 * @date 2020/7/23 14:04
 * 备注：(岛屿数量)给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
 *
 * 岛屿总是被水包围，并且每座岛屿只能由水平方向或竖直方向上相邻的陆地连接形成。
 *
 * 此外，你可以假设该网格的四条边均被水包围。
 *
 */
public class Leetcode200 {
    public int numIslands(char[][] grid) {
        if(grid.length == 0 ){
            return 0;
        }
        int res = 0;

        boolean[][] pb = new boolean[grid.length][grid[0].length];
        for(int i = 0 ; i < grid.length ;i++){
            for(int j = 0 ; j < grid[0].length ; j++){
                if(grid[i][j] == '1' && !pb[i][j]){
                    dfs(grid,pb,i,j);
                    res++;
                }
            }
        }
        return res;
    }

    void dfs(char[][] p,boolean[][] pb,int i,int j){
        //截止条件
        //候选节点
        for(int[]  loc: getNear(i,j,p.length,p[0].length)){
            if(p[loc[0]][loc[1]] == '1' && !pb[loc[0]][loc[1]]){
                pb[loc[0]][loc[1]] = true;
                dfs(p,pb,loc[0],loc[1]);
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


}
