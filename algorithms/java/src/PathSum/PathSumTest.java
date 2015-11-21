package PathSum;

/**
 * Created by Chen on 2015/11/21.
 */
public class PathSumTest {
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
        PathSum sum = new PathSum();
        System.out.println(sum.hasPathSum(root, 22));
    }
}
