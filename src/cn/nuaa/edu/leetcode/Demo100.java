package cn.nuaa.edu.leetcode;

/**
 * @author planb
 * @date 2020/7/23 12:53
 * 备注：判断两棵树是否相等，leetcode100
 */
public class Demo100 {
    public class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q ==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        return p.val == q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);

    }
}
