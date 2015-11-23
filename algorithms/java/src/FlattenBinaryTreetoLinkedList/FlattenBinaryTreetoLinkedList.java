package FlattenBinaryTreetoLinkedList;

// Source : https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
// Author : Mark Lin
// Date   : 2015-11-23

import java.util.Stack;

/**********************************************************************************
 *
 * Given a binary tree, flatten it to a linked list in-place.
 *
 * For example,
 *
 * Given
 *          1
 *         / \
 *        2   5
 *       / \   \
 *      3   4   6
 *
 * The flattened tree should look like:
 *    1
 *     \
 *      2
 *       \
 *        3
 *         \
 *          4
 *           \
 *            5
 *             \
 *              6
 *
 **********************************************************************************/

public class FlattenBinaryTreetoLinkedList {
    public void flatten(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode last = null;
        while (root != null) {
            if (root.left == null) {
                last = root;
                root = root.right;
            } else {
                if (root.right != null)
                    stack.push(root.right);
                root.right = root.left;
                root.left = null;
                root = root.right;
            }
            if (root == null && !stack.isEmpty()) {
                last.right = stack.peek();
                root = stack.pop();
            }
        }
    }
}
