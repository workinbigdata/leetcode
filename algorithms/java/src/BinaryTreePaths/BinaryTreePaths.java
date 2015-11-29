package BinaryTreePaths;

import java.util.LinkedList;
import java.util.List;

// Source : https://leetcode.com/problems/binary-tree-paths/
// Author : Mark Lin
// Date   : 2015-11-29

/**********************************************************************************
 *
 * Given a binary tree, return all root-to-leaf paths.
 *
 * For example, given the following binary tree:
 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 *
 * All root-to-leaf paths are:
 * ["1->2->5", "1->3"]
 *
 **********************************************************************************/

public class BinaryTreePaths {
    private List<String> list = new LinkedList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null)
            return list;
        binaryTreePathsHelper(root, new String());
        return list;
    }

    private void binaryTreePathsHelper(TreeNode root, String s) {
        if (root.left == null && root.right == null) {
            s += root.val;
            list.add(s);
        } else {
            s += root.val;
            if (root.left != null)
                binaryTreePathsHelper(root.left, s + "->");
            if (root.right != null)
                binaryTreePathsHelper(root.right, s + "->");
        }
    }
}
