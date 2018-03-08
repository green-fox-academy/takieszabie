import java.util.Arrays;

public class Anagram {
  public static boolean anagramChecker(String word1, String word2) {
    char[] char1 = word1.toCharArray();
    char[] char2 = word2.toCharArray();
    Arrays.sort(char1);
    Arrays.sort(char2);
    String word1Sorted = new String(char1);
    String word2Sorted = new String(char2);

    if (word1.length() != word2.length()) {
      return false;
    } else if(word1Sorted.equals(word2Sorted)) {
      return true;
    } else {
      return false;
    }
  }
}