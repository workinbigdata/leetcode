package ValidateBinarySearchTree;

// Source : https://leetcode.com/problems/validate-binary-search-tree/
// Author : Mark Lin
// Date   : 2015-11-19

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

public class OptimizedValidateBinarySearchTree {
    Integer last = null;
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        if (!isValidBST(root.left)) return false;
        if (last != null && last >= root.val) return false;
        last = root.val;
        return isValidBST(root.right);
    }
}
