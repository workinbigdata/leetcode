package KthSmallestElementinaBST;

// Source : https://leetcode.com/problems/kth-smallest-element-in-a-bst/
// Author : Mark Lin
// Date   : 2015-11-22

/**********************************************************************************
 *
 * Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.
 *
 * Note:
 *
 * You may assume k is always valid, 1 ¡Ü k ¡Ü BST's total elements.
 *
 *
 **********************************************************************************/

public class KthSmallestElementinaBST {
    private int ret = 0;
    public int kthSmallest(TreeNode root, int k) {
        kthSmallestHelper(root, k);
        return ret;
    }

    private int kthSmallestHelper(TreeNode root, int k) {
        if (root == null)
            return 0;
        else {

            int left = kthSmallestHelper(root.left, k);
            int right = kthSmallestHelper(root.right, k - left - 1);
            if (left == k - 1)
                ret = root.val;
            return left + right + 1;
        }
    }
}
