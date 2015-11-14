/**
 * Created by Chen on 2015/11/14.
 */
public class WordDictionaryTest {

    public static void  main(String[] args) {
        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("abc");
        System.out.println(wordDictionary.search("ab"));
        System.out.println(wordDictionary.search("ab."));
        System.out.println(wordDictionary.search("abcd"));
    }
}
