package ConvertSortedArraytoBinarySearchTree;

// Source : https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
// Author : Mark Lin
// Date   : 2015-11-24

/**********************************************************************************
 *
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 *
 **********************************************************************************/

public class ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBSTHelper(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBSTHelper(int[] nums, int start, int end) {
        if (start > end)
            return null;
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBSTHelper(nums, start, mid - 1);
        node.right = sortedArrayToBSTHelper(nums, mid + 1, end);
        return node;
    }
}
