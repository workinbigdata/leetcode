package BinaryTreeMaximumPathSum;

/**
 * Created by Mark Lin on 2015/11/29.
 */
public class BinaryTreeMaximumPathSumTest {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(3);
        root.left = a;
        // root.right = b;
        BinaryTreeMaximumPathSum pathSum = new BinaryTreeMaximumPathSum();
        pathSum.maxPathSum(root);
    }
}
