package cn.nuaa.edu.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author planb
 * @date 2020/7/23 12:57
 * 备注：leetcode 113
 */
public class Leetcode113 {
    public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        List<Integer> chain = new ArrayList<>();
        chain.add(root.val);
        dfs(root,sum - root.val,chain,res);
        return res;
    }

    void dfs(TreeNode p,int left,List<Integer> chain,List<List<Integer>> res ){
        //截止条件
        if(p.left == null && p.right == null){
            if(left == 0){
                res.add(new ArrayList<>(chain));
                return;
            }
            return;
        }
        //候选节点
        if(p.left != null){
            chain.add(p.left.val);
            dfs(p.left,left - p.left.val,chain,res);
            chain.remove(chain.size()-1);
        }
        if(p.right!=null){
            chain.add(p.right.val);
            dfs(p.right,left - p.right.val,chain,res);
            chain.remove(chain.size()-1);
        }

    }
}
