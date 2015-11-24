package CountCompleteTreeNodes;

// Source : https://leetcode.com/problems/count-complete-tree-nodes/
// Author : Mark Lin
// Date   : 2015-11-24

/**********************************************************************************
 *
 * Given a complete binary tree, count the number of nodes.
 *
 * Definition of a complete binary tree from Wikipedia:
 *
 * In a complete binary tree every level, except possibly the last, is completely filled, and all nodes in the last level are as far left as possible. It can have between 1 and 2^h
 *
 * nodes inclusive at the last level h.
 *
 **********************************************************************************/

public class CountCompleteTreeNodes {

    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        if (root.right == null && root.left == null)
            return 1;
        int right = computeHeight(root.right);
        int left = computeHeight(root.left);
        if (right == left)
            return (1 << left) + countNodes(root.right);
        else
            return  (1 << right) + countNodes(root.left);
    }

    private int computeHeight(TreeNode root) {
        int height = 0;
        while (root != null) {
            root = root.left;
            height += 1;
        }
        return height;
    }
}
