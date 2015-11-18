package SerializeandDeserializeBinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;

// Source : https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
// Author : Mark Lin
// Date   : 2015-11-18

/**********************************************************************************
 *
 * Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer, or transmitted across a network
 *
 * connection link to be reconstructed later in the same or another computer environment.
 *
 * Design an algorithm to serialize and deserialize a binary tree. There is no restriction on how your serialization/deserialization algorithm should work. You just need to ensure
 *
 * that a binary tree can be serialized to a string and this string can be deserialized to the original tree structure.
 *
 * For example, you may serialize the following tree
 *
 *     1
 *    / \
 *   2   3
 *      / \
 *     4   5
 *
 * as "[1,2,3,null,null,4,5]", just the same as how LeetCode OJ serializes a binary tree. You do not necessarily need to follow this format, so please be creative and come
 *
 * up with different approaches yourself.
 *
 * Note: Do not use class member/global/static variables to store states. Your serialize and deserialize algorithms should be stateless.
 *
 **********************************************************************************/

public class SerializeandDeserializeBinaryTree {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null)
            return new String();
        LinkedList<TreeNode> queue = new LinkedList<>();
        ArrayList<String> bf = new ArrayList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int i = 0, size = queue.size();
            while (i < size) {
                TreeNode node = queue.poll();
                if (node != null) {
                    bf.add(String.valueOf(node.val));
                    queue.offer(node.left);
                    queue.offer(node.right);
                } else {
                    bf.add(null);
                }
                i ++;
            }
            size = queue.size();
        }
        return bf.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.length() == 0)
            return null;
        String[] nums = data.substring(1, data.length() - 1).split(", ");
        ArrayList<TreeNode> queue = new ArrayList<>();
        queue.add(new TreeNode(Integer.parseInt(nums[0])));
        int i = 0, j = 1;
        while (j < nums.length) {
            TreeNode parent = queue.get(i);
            if (!nums[j].equals("null") ) {
                TreeNode left = new TreeNode(Integer.parseInt(nums[j]));
                parent.left = left;
                queue.add(left);
            } else {
                parent.left = null;
            }
            j ++;
            if (!nums[j].equals("null")) {
                TreeNode right = new TreeNode(Integer.parseInt(nums[j]));
                parent.right = right;
                queue.add(right);
            } else {
                parent.right = null;
            };
            j ++;
            i ++;
        }
        return queue.get(0);
    }
}
