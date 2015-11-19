package RecoverBinarySearchTree;

// Source : https://leetcode.com/problems/recover-binary-search-tree/
// Author : Mark Lin
// Date   : 2015-11-19

import java.util.Stack;

/**********************************************************************************
 *
 * Two elements of a binary search tree (BST) are swapped by mistake.
 *
 * Recover the tree without changing its structure.
 *
 * Note:
 *
 * A solution using O(n) space is pretty straight forward. Could you devise a constant space solution?
 *
 **********************************************************************************/

public class RecoverBinarySearchTree {
    private TreeNode last = null;
    private TreeNode first = null, second = null;
    public void recoverTree(TreeNode root) {
        if (root == null)
            return ;
        recoverTreeHelper(root);
        swap(first, second);
    }

    private void recoverTreeHelper(TreeNode root) {
        if (root != null) {
            recoverTreeHelper(root.left);
            if (last != null && last.val > root.val) {
                if (first == null) {
                    first = last;
                    second = root;
                } else {
                    second = root;
                }
            }
            last = root;
            recoverTreeHelper(root.right);
        }
    }

    private void swap(TreeNode n1, TreeNode n2) {
        int temp = n1.val;
        n1.val = n2.val;
        n2.val = temp;
    }
}
