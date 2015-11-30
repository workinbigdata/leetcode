package BinarySearchTreeIterator;

import java.util.Stack;

// Source : https://leetcode.com/problems/binary-search-tree-iterator/
// Author : Mark Lin
// Date   : 2015-11-30

/**********************************************************************************
 *
 * Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.
 *
 * Calling next() will return the next smallest number in the BST.
 *
 * Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.
 *
 **********************************************************************************/

public class BinarySearchTreeIterator {
    private Stack<TreeNode> stack = null;
    TreeNode node = null;

    public BinarySearchTreeIterator(TreeNode root) {
        node = root;
        stack = new Stack<>();
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return (!stack.isEmpty() || node != null);
    }


    /** @return the next smallest number */
    public int next() {
        while(node != null) {
            stack.push(node);
            node = node.left;
        }
        TreeNode t = stack.pop();
        node = t.right;
        return t.val;
    }
}
