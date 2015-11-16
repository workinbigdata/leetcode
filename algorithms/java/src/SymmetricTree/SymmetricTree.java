package SymmetricTree;

// Source : https://leetcode.com/problems/symmetric-tree/
// Author : Mark Lin
// Date   : 2015-11-16

/**********************************************************************************
 *
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 *
 * For example, this binary tree is symmetric:
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 *
 * But the following is not:
 *    1
 *   / \
 *  2   2
 *   \   \
 *   3    3
 **********************************************************************************/

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return helper(root.left, root.right);
    }

    private boolean helper(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        else if (left == null || right == null)
            return false;
        else if (left.val == right.val)
            return helper(left.left, right.right) && helper(left.right, right.left);
        else
            return false;
    }
}
