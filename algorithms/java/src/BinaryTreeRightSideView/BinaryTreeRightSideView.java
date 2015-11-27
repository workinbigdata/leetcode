package BinaryTreeRightSideView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Source : https://leetcode.com/problems/binary-tree-right-side-view/
// Author : Mark Lin
// Date   : 2015-11-27

/**********************************************************************************
 *
 * Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
 *
 * For example:
 * Given the following binary tree,
 *    1            <---
 *  /   \
 * 2     3         <---
 *  \     \
 *   5     4       <---
 *
 * You should return [1, 3, 4].
 *
 **********************************************************************************/

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if (root != null) {
            ArrayList<TreeNode> queue = new ArrayList<>();
            queue.add(root);
            int i = 0, size = queue.size();
            while (i < size) {
                while (i < size) {
                    TreeNode node = queue.get(i);
                    if (i == size - 1)
                        list.add(node.val);
                    if (node.left != null)
                        queue.add(node.left);
                    if (node.right != null)
                        queue.add(node.right);
                    i += 1;
                }
                size = queue.size();
            }
        }
        return list;
    }
}
