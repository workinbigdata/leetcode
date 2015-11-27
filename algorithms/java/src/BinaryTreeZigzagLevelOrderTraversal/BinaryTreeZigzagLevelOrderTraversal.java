package BinaryTreeZigzagLevelOrderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Source : https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
// Author : Mark Lin
// Date   : 2015-11-27

/**********************************************************************************
 *
 * Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).
 *
 * For example:
 * Given binary tree {3,9,20,#,#,15,7},
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * return its zigzag level order traversal as:
 * [
 *   [3],
 *   [20,9],
 *   [15,7]
 * ]
 * 
 **********************************************************************************/

public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root != null) {
            ArrayList<TreeNode> queue = new ArrayList<>();
            queue.add(root);
            int i = 0, size = queue.size();
            boolean isReversed = false;
            while (i < size) {
                LinkedList<Integer> temp = new LinkedList<>();
                while (i < size) {
                    TreeNode node = queue.get(i);
                    if (isReversed == true)
                        temp.addFirst(node.val);
                    else
                        temp.add(node.val);
                    if (node.left != null)
                        queue.add(node.left);
                    if (node.right != null)
                        queue.add(node.right);
                    i ++;
                }
                isReversed = !isReversed;
                list.add(new LinkedList(temp));
                size = queue.size();
            }
        }
        return list;
    }
}
