package PopulatingNextRightPointersinEachNode;

// Source : https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
// Author : Mark Lin
// Date   : 2015-11-20

/**********************************************************************************
 *
 * Given a binary tree
 *     struct TreeLinkNode {
 *       TreeLinkNode *left;
 *       TreeLinkNode *right;
 *       TreeLinkNode *next;
 *     }
 *
 * Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
 *
 * Initially, all next pointers are set to NULL.
 *
 * Note:
 * You may only use constant extra space.
 * You may assume that it is a perfect binary tree (ie, all leaves are at the same level, and every parent has two children).
 *
 * For example,
 *
 * Given the following perfect binary tree,
 *          1
 *        /  \
 *       2    3
 *      / \  / \
 *     4  5  6  7
 *
 * After calling your function, the tree should look like:
 *          1 -> NULL
 *        /  \
 *       2 -> 3 -> NULL
 *      / \  / \
 *     4->5->6->7 -> NUL
 *
 **********************************************************************************/

public class OptimizedPopulatingNextRightPointersinEachNode {
    public void connect(TreeLinkNode root) {
        while (root != null && root.left != null) {
            TreeLinkNode first = root.left;
            TreeLinkNode last = null;
            while (root != null) {
                if (last != null)
                    last.right.next = root.left;
                root.left.next = root.right;
                last = root;
                root = root.next;
            }
            root = first;
        }
    }
}
