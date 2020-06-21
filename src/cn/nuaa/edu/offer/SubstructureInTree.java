package cn.nuaa.edu.offer;

/**
 * @author planb
 * @date 2020/6/21 10:08
 * 备注：
 */
//题目：输入两棵二叉树A和B，判断B是不是A的子结构。
public class SubstructureInTree {
    public class TreeNode{
        double val;
        TreeNode left = null;
        TreeNode right =null;
        public TreeNode(int val) {
            this.val=val;
        }
    }

    /*
     * 主程序，对每个结点遍历判断
     */
    public boolean hasSubtree(TreeNode root1,TreeNode root2) {
        if(root1==null || root2==null){
            return false;
        }
        return doesTree1HasTree2(root1, root2)|| hasSubtree(root1.left, root2)
                ||hasSubtree(root1.right, root2);
    }

    /*
     * 判断root结点开始的子树中各个结点是否相同
     */
    private boolean doesTree1HasTree2(TreeNode root1,TreeNode root2) {
        if(root2==null) {
            return true;
        }
        if(root1==null) {
            return false;
        }
        return equal(root1.val, root2.val) && doesTree1HasTree2(root1.left, root2.left)
                && doesTree1HasTree2(root1.right, root2.right);
    }

    /*
     * 判断两个浮点数是否相等
     */
    private boolean equal(double num1,double num2) {
        double precision = 1e-7;
        if(Math.abs(num1-num2)<precision) {
            return true;
        }
        return false;
    }
}
