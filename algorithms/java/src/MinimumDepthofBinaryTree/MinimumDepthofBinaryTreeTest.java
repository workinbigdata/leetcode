package MinimumDepthofBinaryTree;

/**********************************************************************************
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \      \
 *         7    2      1
 **********************************************************************************/

public class MinimumDepthofBinaryTreeTest {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode a = new TreeNode(4);
        TreeNode b = new TreeNode(8);
        root.left = a;
        root.right = b;
        TreeNode c = new TreeNode(11);
        a.left = c;
        TreeNode d = new TreeNode(13);
        TreeNode e = new TreeNode(4);
        b.left = d;
        b.right = e;
        TreeNode f = new TreeNode(7);
        TreeNode g = new TreeNode(2);
        TreeNode h = new TreeNode(1);
        c.left = f;
        c.right = g;
        e.right = h;
        MinimumDepthofBinaryTree depth = new MinimumDepthofBinaryTree();
        System.out.println(depth.minDepth(root));
    }
}
