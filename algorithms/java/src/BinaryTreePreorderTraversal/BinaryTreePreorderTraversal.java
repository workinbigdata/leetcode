package BinaryTreePreorderTraversal;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

// Source : https://leetcode.com/problems/binary-tree-preorder-traversal/
// Author : Mark Lin
// Date   : 2015-11-28

/**********************************************************************************
 *
 * Given a binary tree, return the preorder traversal of its nodes' values.
 *
 * For example:
 * Given binary tree {1,#,2,3},
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 * return [1,2,3].
 * Note: Recursive solution is trivial, could you do it iteratively?
 *
 **********************************************************************************/

public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new LinkedList<>();
        while (root != null) {
            list.add(root.val);
            if (root.right != null)
                stack.push(root.right);
            root = root.left;
            if (root == null && !stack.isEmpty())
                root = stack.pop();
        }
        return list;
    }
}
