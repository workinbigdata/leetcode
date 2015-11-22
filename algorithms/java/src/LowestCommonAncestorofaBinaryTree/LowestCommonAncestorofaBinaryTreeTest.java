package LowestCommonAncestorofaBinaryTree;

/**********************************************************************************
 *               37
 *              /  \
 *           -34   -48
 *             \   /  \
 *          -100 -100 48
 *                   /
 *                 -54
 *                 /  \
 *               -71  -22
 *                      \
 *                       8
 **********************************************************************************/

public class LowestCommonAncestorofaBinaryTreeTest {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(37);
        TreeNode a = new TreeNode(-34);
        TreeNode b = new TreeNode(-48);
        root.left = a;
        root.right = b;
        TreeNode c = new TreeNode(-100);
        a.right = c;
        TreeNode d = new TreeNode(-100);
        TreeNode e = new TreeNode(48);
        b.left = d;
        b.right = e;
        TreeNode f = new TreeNode(-54);
        e.left = f;
        TreeNode g = new TreeNode(-71);
        TreeNode h = new TreeNode(-22);
        f.left = g;
        f.right = h;
        TreeNode i = new TreeNode(8);
        h.right = i;
        LowestCommonAncestorofaBinaryTree lca = new LowestCommonAncestorofaBinaryTree();
        System.out.println(lca.lowestCommonAncestor(root,d,g).val);
    }
}
