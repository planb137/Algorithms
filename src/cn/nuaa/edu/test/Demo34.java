package nuaa.edu.test;

/**
 * @author planb
 * @date 2020/9/20 16:29
 * 备注：字节面试2020年9月20日
 */
class Node2 {
    Node2 left;
    Node2 right;
    int val;

    public Node2() {
    }

    public Node2(int val, Node2 left, Node2 right) {
        this.left = left;
        this.right = right;
        this.val = val;
    }

    @Override
    public String toString() {
        return "Node2 " + val;
    }
}

public class Demo34 {
    public static Node2 lowestCommonAncestor(Node2 root, Node2 p, Node2 q) {

        if (root == null || root == p || root == q) {
            return root;//若节点 p在节点 root 的左（右）子树中，或 p=root ，则称 root是 p的祖先。
        }

        Node2 left = lowestCommonAncestor(root.left, p, q);
        Node2 right = lowestCommonAncestor(root.right, p, q);
        if (left == null && right == null) {
            return null;
        }
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        return root;
    }

    public static Node2 f(Node2 root, Node2 p, Node2 q) {
        if (root == null || p == null || q == null) {
            return root;
        }
        Node2 l = f(root.left, p, q);
        Node2 r = f(root.right, p, q);
        if (l == null && r == null) {
            return null;
        }
        if (l == null) {
            return r;
        }
        if (r == null) {
            return l;
        }
        return root;
    }

    public static void main(String[] args) {
        Node2 node4 = new Node2(4, null, null);
        Node2 node5 = new Node2(5, null, null);
        Node2 node3 = new Node2(3, null, null);
        Node2 node2 = new Node2(2, node4, node5);
        Node2 root = new Node2(1, node2, node3);
        Node2 rs = lowestCommonAncestor(root, node4, node5);
        System.out.println(rs.toString());
    }

}
