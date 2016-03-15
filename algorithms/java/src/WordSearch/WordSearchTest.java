package WordSearch;

/**
 * Created by Mark Lin on 2016/3/15.
 */
public class WordSearchTest {
    public static void main(String[] args) {
        WordSearch ws = new WordSearch();
        char[][] board = {{'a', 'b', 'c'}, {'a', 'd', 'e'}};
        System.out.println(ws.exist(board, "abd"));
    }
}
