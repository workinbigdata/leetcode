package BalancedBinaryTree;

// Source : https://leetcode.com/problems/balanced-binary-tree/
// Author : Mark Lin
// Date   : 2015-11-26

/**********************************************************************************
 *
 * Given a binary tree, determine if it is height-balanced.
 *
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 *
 **********************************************************************************/

public class BalancedBinaryTree {
    private boolean isBalanced = true;

    public boolean isBalanced(TreeNode root) {
        isBalancedHelper(root);
        return isBalanced;
    }

    private int isBalancedHelper(TreeNode root) {
        if (root == null)
            return 0;
        int left = isBalancedHelper(root.left);
        int right = isBalancedHelper(root.right);
        if (Math.abs(left - right) > 1)
            isBalanced = false;
        return Math.max(left, right) + 1;
    }
}
