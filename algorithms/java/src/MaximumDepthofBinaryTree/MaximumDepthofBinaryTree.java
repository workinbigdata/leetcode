package MaximumDepthofBinaryTree;

// Source : https://leetcode.com/problems/maximum-depth-of-binary-tree/
// Author : Mark Lin
// Date   : 2015-11-21

/**********************************************************************************
 *
 * Given a binary tree, find its maximum  depth.
 *
 * TThe maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 **********************************************************************************/

public class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return 1;
        } else if (root.left == null) {
            return maxDepth(root.right) + 1;
        } else if (root.right == null) {
            return maxDepth(root.left) + 1;
        } else {
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
    }
}
