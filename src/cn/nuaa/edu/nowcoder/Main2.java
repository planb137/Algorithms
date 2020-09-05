package nuaa.edu.nowcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author planb
 * @date 2020/9/5 15:27
 * 备注：输入数组，构建二叉树并判断是否是二叉搜索树
 */
public class Main2 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {
        }
    }

    static boolean flag = true;
    static TreeNode pre = null;

    public static boolean isValidBST(TreeNode root) {
        dfs(root);
        return flag;
    }

    private static void dfs(TreeNode root) {
        if (root != null) {
            dfs(root.left);
            if (pre != null && root.val <= pre.val) {
                flag = false;
            }
            pre = root;
            dfs(root.right);
        }
    }

    public static TreeNode arrayToBTree(int[] arrs) {
        if (arrs == null || arrs.length == 0) {
            return new TreeNode();
        }

        List<TreeNode> nodes = new ArrayList<>(arrs.length);
        for (int a : arrs) {
            TreeNode treeNode = new TreeNode();
            treeNode.val = a;
            nodes.add(treeNode);
        }

        for (int i = 0; i < arrs.length / 2 - 1; i++) {
            TreeNode node = nodes.get(i);
            node.left = nodes.get(i * 2 + 1);
            node.right = nodes.get(i * 2 + 2);
        }
        // 只有当总节点数是奇数时，最后一个父节点才有右子节点
        int lastPNodeIndex = arrs.length / 2 - 1;
        TreeNode lastPNode = nodes.get(lastPNodeIndex);
        lastPNode.left = nodes.get(lastPNodeIndex * 2 + 1);
        if (arrs.length % 2 != 0) {
            lastPNode.right = nodes.get(lastPNodeIndex * 2 + 2);
        }

        return nodes.get(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] num = sc.nextLine().split(" ");
        int[] t = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            t[i] = Integer.parseInt(num[i]);
        }
        TreeNode treeNode = arrayToBTree(t);
        if (isValidBST(treeNode)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
