package BinaryTreeZigzagLevelOrderTraversal;

/**
 * Created by Chen on 2015/11/27.
 */
public class BinaryTreeZigzagLevelOrderTraversalTest {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode a = new TreeNode(2);
        root.left = a;
        BinaryTreeZigzagLevelOrderTraversal zigzag = new BinaryTreeZigzagLevelOrderTraversal();
        zigzag.zigzagLevelOrder(root);
    }
}
