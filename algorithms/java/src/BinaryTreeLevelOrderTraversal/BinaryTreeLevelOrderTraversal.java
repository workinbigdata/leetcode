package BinaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Source : https://leetcode.com/problems/binary-tree-level-order-traversal/
// Author : Mark Lin
// Date   : 2015-11-29

/**********************************************************************************
 *
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 *
 * For example:
 * Given binary tree {3,9,20,#,#,15,7},
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * return its level order traversal as:
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 *
 **********************************************************************************/

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        if (root != null) {
            List<TreeNode> queue = new ArrayList<>();
            queue.add(root);
            int i = 0, size = queue.size();
            while (i < size) {
                List<Integer> temp = new LinkedList<>();
                while (i < size) {
                    TreeNode node = queue.get(i);
                    temp.add(node.val);
                    if (node.left != null)
                        queue.add(node.left);
                    if (node.right != null)
                        queue.add(node.right);
                    i ++;
                }
                list.add(temp);
                size = queue.size();
            }
        }
        return list;
    }
}
