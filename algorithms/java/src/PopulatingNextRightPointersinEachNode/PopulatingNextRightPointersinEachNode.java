package PopulatingNextRightPointersinEachNode;

// Source : https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
// Author : Mark Lin
// Date   : 2015-11-20

import java.util.LinkedList;

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

public class PopulatingNextRightPointersinEachNode {
    public void connect(TreeLinkNode root) {
        if (root == null)
            return ;
        LinkedList<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
        queue.add(root);
        int i = 0, size = 0;
        while (i < queue.size()) {
            size = queue.size();
            while (i < size) {
                TreeLinkNode node = queue.get(i);
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
                if (i == size - 1) {
                    node.next = null;
                } else {
                    TreeLinkNode next = queue.get(i + 1);
                    node.next = next;
                }
                i ++;
            }
        }
    }
}
