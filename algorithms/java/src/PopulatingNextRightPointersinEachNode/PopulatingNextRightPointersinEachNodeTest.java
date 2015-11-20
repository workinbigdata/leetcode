package PopulatingNextRightPointersinEachNode;

/**
 * Created by Chen on 2015/11/20.
 */
public class PopulatingNextRightPointersinEachNodeTest {
    public static void main(String[] args) {
        TreeLinkNode root = new TreeLinkNode(1);
        TreeLinkNode a = new TreeLinkNode(2);
        TreeLinkNode b = new TreeLinkNode(3);
        root.left = a;
        root.right = b;
        PopulatingNextRightPointersinEachNode populating = new PopulatingNextRightPointersinEachNode();
        populating.connect(root);
    }
}
