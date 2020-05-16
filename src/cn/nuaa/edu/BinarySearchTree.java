package cn.nuaa.edu;

/**
 * @author planb
 * @date 2020/5/16 15:11
 * 备注：
 */
public class BinarySearchTree {
    private static Node root;
    public static void main(String[] args) {
        insert(2);
        insert(5);
        insert(1);
        insert(7);
        insert(3);
        insert(11);
        inOrder(root);
    }
    public static  void insert(int data) {
        Node  newNode = new Node();
        newNode.val = data;
        if(root == null) {
            //如果是第一个节点，也就是根节点为null,直接创建一个新的节点即可　
            root = newNode;
        }
        else {
            Node current = root;
            //current节点的父节点
            Node parent;
            //循环查找插入的位置
            while(true) {
                parent = current;
                //如果插入的值小于当前节点的值，从左子树查找
                if(data < current.val) {
                    current = current.leftChild;
                    //直到当前节点为null
                    if(current == null) {
                        //设置当前节点的父节点的左子节点为新创建的节点
                        parent.leftChild = newNode;
                        return;
                    }

                }
                //如果插入的值大于当前节点的值，从右子树查找
                else {
                    current = current.rightChild;
                    //直到当前节点为null
                    if(current == null) {
                        //设置当前节点的父节点的右子节点为新创建的节点
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }// end of while(true)
        }
    }
    public static void inOrder(Node root)
    { // 中序遍历,"左中右"
        if (root != null)
        {
            inOrder(root.leftChild);
            System.out.print(root.val + " ");
            inOrder(root.rightChild);
        }
    }
}
 class Node {
    int   val;
    Node  leftChild;
    Node  rightChild;

    public void  printNode() {
        System.out.println(val);
    }
}
