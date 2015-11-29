package BinaryTreeMaximumPathSum;

// Source : https://leetcode.com/problems/binary-tree-maximum-path-sum/
// Author : Mark Lin
// Date   : 2015-11-29

/**********************************************************************************
 *
 * Given a binary tree, find the maximum path sum.
 *
 * For this problem, a path is defined as any sequence of nodes from some starting node to any node in the tree along the parent-child connections. The path does not need to
 *
 * go through the root.
 *
 * For example:
 *
 * Given the below binary tree,
 *        1
 *       / \
 *      2   3
 *
 * Return 6.
 *
 **********************************************************************************/

public class BinaryTreeMaximumPathSum {
    private int sum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if (root == null)
            return 0;
        maxPathSumHelper(root);
        return sum;
    }

    private int maxPathSumHelper(TreeNode root) {
        if (root == null)
            return 0;
        int left = maxPathSumHelper(root.left);
        int right = maxPathSumHelper(root.right);
        if (left + right + root.val > sum)
            sum = left + right + root.val;
        if (Math.max(left, right) + root.val > 0)
            return Math.max(left, right) + root.val;
        else
            return 0;
    }
}
