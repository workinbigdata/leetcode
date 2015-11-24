package CountCompleteTreeNodes;

/**
 * Created by Chen on 2015/11/24.
 */
public class CountCompleteTreeNodesTest {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(3);
        root.left = a;
        root.right = b;
        TreeNode c = new TreeNode(4);
        a.left = c;
        CountCompleteTreeNodes count = new CountCompleteTreeNodes();
        count.countNodes(root);
    }
}
