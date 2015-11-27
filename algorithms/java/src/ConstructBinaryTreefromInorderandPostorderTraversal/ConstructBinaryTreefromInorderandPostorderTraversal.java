package ConstructBinaryTreefromInorderandPostorderTraversal;

// Source : https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
// Author : Mark Lin
// Date   : 2015-11-27

/**********************************************************************************
 *
 * Given inorder and postorder traversal of a tree, construct the binary tree.
 *
 * Note:
 * You may assume that duplicates do not exist in the tree.
 *
 **********************************************************************************/

public class ConstructBinaryTreefromInorderandPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0 && postorder.length == 0)
            return null;
        return buildTreeHelper(inorder, postorder, inorder.length - 1, 0, inorder.length - 1);
    }

    private TreeNode buildTreeHelper(int[] inorder, int[] postorder, int idx, int start, int end) {
        if (start > end)
            return null;
        TreeNode root = new TreeNode(postorder[idx]);
        int newIdx = computeIdx(inorder, postorder[idx]);
        root.left = buildTreeHelper(inorder, postorder, idx - end + newIdx - 1, start, newIdx - 1);
        root.right = buildTreeHelper(inorder, postorder, idx - 1, newIdx + 1, end);
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
