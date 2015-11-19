package RecoverBinarySearchTree;

/**
 * Created by Chen on 2015/11/19.
 */
public class RecoverBinarySearchTreeTest {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        TreeNode a = new TreeNode(3);
        TreeNode b = new TreeNode(1);
        root.left = a;
        root.right = b;
        RecoverBinarySearchTree recover = new RecoverBinarySearchTree();
        recover.recoverTree(root);
    }
}
