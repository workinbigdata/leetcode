package SymmetricTree;

/**
 * Created by Chen on 2015/11/16.
 */
public class SymmetricTreeTest {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(2);
        root.left = a;
        root.right = b;
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(4);
        TreeNode f = new TreeNode(3);
        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;
        SymmetricTree st = new SymmetricTree();
        System.out.println(st.isSymmetric(root));
    }
}
