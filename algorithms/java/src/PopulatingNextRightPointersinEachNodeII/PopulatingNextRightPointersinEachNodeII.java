package PopulatingNextRightPointersinEachNodeII;

// Source : https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/
// Author : Mark Lin
// Date   : 2015-11-20

/**********************************************************************************
 *
 * Follow up for problem "Populating Next Right Pointers in Each Node".
 *
 * What if the given tree could be any binary tree? Would your previous solution still work?
 *
 * Note:
 * You may only use constant extra space.
 *
 * For example,
 *
 * Given the following binary tree,
 *          1
 *        /  \
 *       2    3
 *      / \    \
 *     4   5    7
 *
 * After calling your function, the tree should look like:
 *           1 -> NULL
 *         /  \
 *        2 -> 3 -> NULL
 *       / \    \
 *      4-> 5 -> 7 -> NULL
 *
 **********************************************************************************/

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
