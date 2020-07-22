package cn.nuaa.edu.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author planb
 * @date 2020/7/22 16:30
 * 备注：
 */
public class Demo39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(candidates,target,new ArrayList<>(),res);
        return res;
    }

    void dfs(int[] candidates, int target,List<Integer> list,List<List<Integer>> res){

        if(0 == target){
            List<Integer> list1 = new ArrayList<>(list);
            Collections.sort(list1);
            if (!res.contains(list1)){
                res.add(list1);
            }
            return;
        }else if (target < 0) {
            return;
        }

        for (int i = 0; i < candidates.length; i++) {
                list.add(candidates[i]);
                dfs(candidates, target -candidates[i], list, res);
                list.remove(list.size()-1);
            }
        }
}
