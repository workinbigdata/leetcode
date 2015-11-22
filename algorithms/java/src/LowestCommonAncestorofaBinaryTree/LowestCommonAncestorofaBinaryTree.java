package LowestCommonAncestorofaBinaryTree;

// Source : https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
// Author : Mark Lin
// Date   : 2015-11-22

/**********************************************************************************
 *
 * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
 *
 * According to the definition of LCA on Wikipedia: ¡°The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as
 *
 * descendants (where we allow a node to be a descendant of itself).¡±
 *         _______6______
 *        /              \
 *     ___2__          ___8__
 *    /      \        /      \
 *   0       4       7       9
 *          /  \
 *         3   5
 *
 * return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 *
 **********************************************************************************/

public class LowestCommonAncestorofaBinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        } else {
            if (root == p || root == q)
                return root;
            TreeNode left = lowestCommonAncestor(root.left, p, q);
            TreeNode right = lowestCommonAncestor(root.right, p, q);
            if (left != null && right != null)
                return root;
            else if (left != null)
                return left;
            else if (right != null)
                return right;
            else
                return null;
        }
    }
}
