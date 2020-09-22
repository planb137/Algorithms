package nuaa.edu.test;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author planb
 * @date 2020/9/21 17:37
 * 备注：招银网络科技面试（层次遍历二叉树）
 */
public class Demo35 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        LinkedList<TreeNode> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        q.addFirst(root);
        while (!q.isEmpty()) {
            TreeNode node = q.removeFirst();
            ArrayList<Integer> le = new ArrayList<>();
            le.add(node.val);
            if (root.left != null) {
                q.addLast(root.left);
            }
            if (root.right != null) {
                q.addLast(root.right);
            }
            res.add(le);
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
