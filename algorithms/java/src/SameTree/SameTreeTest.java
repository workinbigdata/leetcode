package SameTree;

/**
 * Created by Chen on 2015/11/18.
 */
public class SameTreeTest {
    public static void main(String[] args) {
        TreeNode tree1 = new TreeNode(1);
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(3);
        tree1.left = a;
        tree1.right = b;
        TreeNode tree2 = new TreeNode(1);
        TreeNode c = new TreeNode(2);
        TreeNode d = new TreeNode(3);
        tree2.left = c;
        tree2.right = d;
        SameTree same = new SameTree();
        System.out.println(same.isSameTree(tree1, tree2));
    }
}
