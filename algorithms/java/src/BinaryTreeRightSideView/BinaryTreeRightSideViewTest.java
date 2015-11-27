package BinaryTreeRightSideView;

/**********************************************************************************
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           1   6  14
 **********************************************************************************/

public class BinaryTreeRightSideViewTest {
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
        BinaryTreeRightSideView sideView = new BinaryTreeRightSideView();
        System.out.println(sideView.rightSideView(root));
    }
}
