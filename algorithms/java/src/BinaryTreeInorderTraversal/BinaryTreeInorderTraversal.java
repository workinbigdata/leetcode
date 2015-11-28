package BinaryTreeInorderTraversal;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

// Source : https://leetcode.com/problems/binary-tree-inorder-traversal/
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
 * return [1,3,2].
 * Note: Recursive solution is trivial, could you do it iteratively?
 *
 **********************************************************************************/

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null) {
            stack.push(root);
            root = root.left;
            while (root == null && !stack.isEmpty()) {
                list.add(stack.peek().val);
                root = stack.pop().right;
            }
        }
        return list;
    }
}
