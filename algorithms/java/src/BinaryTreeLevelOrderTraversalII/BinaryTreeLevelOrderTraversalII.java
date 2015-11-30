package BinaryTreeLevelOrderTraversalII;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Source : https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
// Author : Mark Lin
// Date   : 2015-11-30

/**********************************************************************************
 *
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
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
 * return its bottom-up level order traversal as:
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 *
 **********************************************************************************/

public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> list = new LinkedList<>();
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
                    i += 1;
                }
                list.addFirst(new LinkedList(temp));
                size = queue.size();
            }
        }
        return list;
    }
}
