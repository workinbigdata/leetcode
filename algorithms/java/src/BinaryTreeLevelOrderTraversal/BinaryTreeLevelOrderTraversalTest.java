package BinaryTreeLevelOrderTraversal;

/**
 * Created by Mark Lin on 2015/11/29.
 */
public class BinaryTreeLevelOrderTraversalTest {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode a = new TreeNode(4);
        TreeNode b = new TreeNode(8);
        root.left = a;
        root.right = b;
        TreeNode c = new TreeNode(1);
        a.left = c;
        TreeNode d = new TreeNode(6);
        TreeNode e = new TreeNode(14);
        b.left = d;
        b.right = e;
        BinaryTreeLevelOrderTraversal levelOrderTraversal = new BinaryTreeLevelOrderTraversal();
        levelOrderTraversal.levelOrder(root);
    }
}
