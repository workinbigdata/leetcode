package WordSearch;// Source : https://leetcode.com/problems/3sum/
// Author : Mark Lin
// Date   : 2015-12-6

/**********************************************************************************
 *
 * Given a 2D board and a word, find if the word exists in the grid.
 *
 * The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.
 *
 * For example,
 *
 * Given board =
 *
 * [
 *   ['A','B','C','E'],
 *   ['S','F','C','S'],
 *   ['A','D','E','E']
 * ]
 *
 * word = "ABCCED", -> returns true,
 * word = "SEE", -> returns true,
 * word = "ABCB", -> returns false.
 *
 **********************************************************************************/

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i ++) {
            for (int j = 0; j < board[i].length; j ++) {
                if (search(board, i, j, word, 0) == true) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean search(char[][] board, int x, int y, String word, int cursor) {
        if (cursor == word.length())
            return true;
        if (x >= 0 && x < board.length && y >= 0 && y < board[x].length) {
            if (board[x][y] == word.charAt(cursor)) {
                char temp = board[x][y];
                board[x][y] = ' ';
                boolean ret = search(board, x, y + 1, word, cursor + 1) ||
                        search(board, x + 1, y, word, cursor + 1) ||
                        search(board, x, y - 1, word, cursor + 1) ||
                        search(board, x - 1, y, word, cursor + 1);
                board[x][y] = temp;
                return ret;
            }
        }
        return false;
    }
}
