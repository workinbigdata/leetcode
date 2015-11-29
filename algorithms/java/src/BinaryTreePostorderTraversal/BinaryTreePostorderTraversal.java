package BinaryTreePostorderTraversal;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

// Source : https://leetcode.com/problems/binary-tree-postorder-traversal/
// Author : Mark Lin
// Date   : 2015-11-29

/**********************************************************************************
 *
 * Given a binary tree, return the postorder traversal of its nodes' values.
 *
 * For example:
 * Given binary tree {1,#,2,3},
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 * return [3,2,1].
 *
 * Note: Recursive solution is trivial, could you do it iteratively?
 *
 **********************************************************************************/

public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null) {
            list.addFirst(root.val);
            if (root.left != null)
                stack.push(root.left);
            root = root.right;
            if (root == null && !stack.isEmpty())
                root = stack.pop();

        }
        return list;
    }
}
