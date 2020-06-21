package cn.nuaa.edu.offer;

/**
 * @author planb
 * @date 2020/6/21 10:28
 * 备注：
 */
//题目：请完成一个函数，输入一个二叉树，该函数输出它的镜像。
public class MirrorOfBinaryTree {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    //递归写法
    public void Mirror(TreeNode root) {
        if(root==null) {
            return;
        }
        //左右子结点交换
        TreeNode tempNode = root.left;
        root.left=root.right;
        root.right=tempNode;

        Mirror(root.left);
        Mirror(root.right);
    }
}