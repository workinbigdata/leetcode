// Source : https://leetcode.com/problems/add-and-search-word-data-structure-design/
// Inspired by : http://www.jiuzhang.com/solutions/find-peak-element/
// Author : Mark Lin
// Date   : 2015-11-14

/**********************************************************************************
 *
 * Design a data structure that supports the following two operations:
 *
 * void addWord(word)
 * bool search(word)
 *
 * search(word) can search a literal word or a regular expression string containing only letters a-z or .. A . means it can represent any one letter.
 *
 * For example:
 *
 * addWord("bad")
 * addWord("dad")
 * addWord("mad")
 * search("pad") -> false
 * search("bad") -> true
 * search(".ad") -> true
 * search("b..") -> true
 *
 * Note:
 * You may assume that all words are consist of lowercase letters a-z.
 *
 **********************************************************************************/

public class WordDictionary {

    class TrieTreeNode {
        char c;
        boolean isLeaf;
        TrieTreeNode[] children = new TrieTreeNode[26];

        TrieTreeNode() {}

        TrieTreeNode(char c) {
            this.c = c;
        }
    }

    private TrieTreeNode root = new TrieTreeNode();

    // Adds a word into the data structure.
    public void addWord(String word) {
        TrieTreeNode node = root;
        for (int i = 0; i < word.length(); i ++) {
            TrieTreeNode child = node.children[word.charAt(i) - 'a'];
            if (child != null) {
                node = child;
            } else {
                TrieTreeNode newNode = new TrieTreeNode(word.charAt(i));
                if (i == word.length() - 1) {
                    newNode.isLeaf = true;
                }
                node.children[word.charAt(i) - 'a'] = newNode;
                node = newNode;
            }
        }
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        TrieTreeNode node = root;
        return searchHelper(word, node, 0);
    }

    private boolean searchHelper(String word, TrieTreeNode node, int start) {
        for (int i = start; i < word.length(); i ++) {
            if (word.charAt(i) != '.') {
                TrieTreeNode child = node.children[word.charAt(i) - 'a'];
                if (child == null) {
                    return false;
                } else {
                    node = child;
                }
            } else {
                Boolean ret = false;
                for (int j = 0; j < 26; j ++) {
                    TrieTreeNode child = node.children[j];
                    if (child != null) {
                        ret = ret || searchHelper(word, child, i + 1);
                    }
                }
                return ret;
            }
        }
        if (node.isLeaf == true)
            return true;
        else
            return false;
    }
}
