package SumRoottoLeafNumbers;

// Source : https://leetcode.com/problems/sum-root-to-leaf-numbers/
// Author : Mark Lin
// Date   : 2015-11-17

/**********************************************************************************
 *
 * Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.
 *
 * An example is the root-to-leaf path 1->2->3 which represents the number 123.
 *
 * Find the total sum of all root-to-leaf numbers.
 *
 * For example,
 *     1
 *    / \
 *   2   3
 *
 * The root-to-leaf path 1->2 represents the number 12.
 * The root-to-leaf path 1->3 represents the number 13.
 *
 * Return the sum = 12 + 13 = 25.
 *
 **********************************************************************************/

public class SumRoottoLeafNumbers {
    private int ret = 0;
    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        helper(root, 0);
        return ret;
    }

    private void helper(TreeNode root, int sum) {
        if (root.left == null && root.right == null) {
            ret += sum * 10 + root.val;
        } else {
            if (root.left != null) {
                helper(root.left, sum * 10 + root.val);
            }
            if (root.right != null) {
                helper(root.right, sum * 10 + root.val);
            }
        }
    }
}
