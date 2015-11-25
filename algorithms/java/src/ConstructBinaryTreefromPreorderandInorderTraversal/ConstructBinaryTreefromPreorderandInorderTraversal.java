package ConstructBinaryTreefromPreorderandInorderTraversal;

// Source : https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
// Author : Mark Lin
// Date   : 2015-11-25

/**********************************************************************************
 *
 * Given preorder and inorder traversal of a tree, construct the binary tree.
 *
 * Note:
 * You may assume that duplicates do not exist in the tree.
 *
 **********************************************************************************/

public class ConstructBinaryTreefromPreorderandInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 && inorder.length == 0)
            return null;
        return buildTreeHelper(preorder, inorder, 0, 0, preorder.length - 1);
    }

    private TreeNode buildTreeHelper(int[] preorder, int[] inorder, int idx, int start, int end) {
        if (start > end)
            return null;
        TreeNode root = new TreeNode(preorder[idx]);
        int newIdx = computeIdx(inorder, preorder[idx]);
        root.left = buildTreeHelper(preorder, inorder, idx + 1, start, newIdx - 1);
        root.right = buildTreeHelper(preorder, inorder, idx + newIdx - start + 1, newIdx + 1, end);
        return root;
    }

    private int computeIdx(int[] inorder, int target) {
        for (int i = 0; i < inorder.length; i ++) {
            if (inorder[i] == target)
                return i;
        }
        return -1;
    }
}
