package PopulatingNextRightPointersinEachNodeII;

/**
 * Created by Chen on 2015/11/20.
 */
public class PopulatingNextRightPointersinEachNodeII {
    public void connect(TreeLinkNode root) {
        while (root != null) {
            if (root.left != null || root.right != null) {
                TreeLinkNode first = null;
                TreeLinkNode last = null;
                if (root.left != null)
                    first = root.left;
                else
                    first = root.right;
                while (root != null) {
                    if (root.left != null && root.right != null) {
                        root.left.next = root.right;
                        if (last != null)
                            last.next = root.left;
                        last = root.right;
                    } else if (root.left != null) {
                        if (last != null)
                            last.next = root.left;
                        last = root.left;
                    } else if (root.right != null) {
                        if (last != null)
                            last.next = root.right;
                        last = root.right;
                    }
                    root = root.next;
                }
                root = first;
            } else {
                root = root.next;
            }
        }
    }
}
