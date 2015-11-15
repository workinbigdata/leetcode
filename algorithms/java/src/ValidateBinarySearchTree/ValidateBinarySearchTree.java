// Source : https://leetcode.com/problems/validate-binary-search-tree/
// Author : Mark Lin
// Date   : 2015-11-15

/**********************************************************************************
 *
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 *
 * Assume a BST is defined as follows:
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 *
 **********************************************************************************/

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean helper(TreeNode root, long min, long max) {
        if (root.val > min && root.val < max) {
            if (root.left == null && root.right == null) {
                return true;
            } else if (root.left == null) {
                if (root.val < root.right.val)
                    return helper(root.right, root.val, max);
                else
                    return false;
            } else if (root.right == null) {
                if (root.val > root.left.val)
                    return helper(root.left, min, root.val);
                else
                    return false;
            } else {
                if (root.val > root.left.val && root.val < root.right.val)
                    return helper(root.left, min, root.val) && helper(root.right, root.val, max);
                else
                    return false;
            }
        } else {
            return false;
        }
    }
}
