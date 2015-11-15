/**
 * Created by Chen on 2015/11/15.
 */
public class ValidateBinarySearchTreeTest {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode a = new TreeNode(2);
        root.left = a;
        TreeNode b = new TreeNode(3);
        root.right = b;
        TreeNode c = new TreeNode(4);
        b.left = c;
        TreeNode d = new TreeNode(5);
        c.right = d;
        ValidateBinarySearchTree validate = new ValidateBinarySearchTree();
        System.out.println(validate.isValidBST(root));
    }
}
