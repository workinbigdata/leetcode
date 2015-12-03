package UniqueBinarySearchTreesII;

import java.util.LinkedList;
import java.util.List;

// Source : https://leetcode.com/problems/unique-binary-search-trees-ii/
// Author : Mark Lin
// Date   : 2015-12-3

/**********************************************************************************
 *
 * Given n, generate all structurally unique BST's (binary search trees) that store values 1...n.
 *
 * For example,
 * Given n = 3, your program should return all 5 unique BST's shown below.
 *
 *    1         3     3      2      1
 *     \       /     /      / \      \
 *      3     2     1      1   3      2
 *     /     /       \                 \
 *    2     1         2                 3
 *
 **********************************************************************************/

public class UniqueBinarySearchTreesII {
    public List<TreeNode> generateTrees(int n) {
        if (n <= 0)
            return new LinkedList<TreeNode>();
        return generateTreesHelper(1, n);
    }

    private List<TreeNode> generateTreesHelper(int start, int end) {
        List<TreeNode> list = new LinkedList<>();
        if (start > end) {
            list.add(null);
            return list;
        }
        for (int i = start; i <= end; i ++) {
            List<TreeNode> left = generateTreesHelper(start, i - 1);
            List<TreeNode> right = generateTreesHelper(i + 1, end);
            for (TreeNode m : left)
                for (TreeNode n : right) {
                    TreeNode node = new TreeNode(i);
                    node.left = m;
                    node.right = n;
                    list.add(node);
                }
        }
        return list;
    }
}
