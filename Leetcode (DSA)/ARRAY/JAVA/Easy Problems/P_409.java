import java.util.*;

public class P_409 {
  public static int longestPalindrome(String s) {

    int length = 0;

    Set<Character> hashset = new HashSet<>();

    for (int i = 0; i < s.length(); i++) {
      if (!(hashset.contains(s.charAt(i)))) {
        hashset.remove(s.charAt(i));
        length += 2;
      } else {
        hashset.add(s.charAt(i));
      }
    }

    if (hashset.size() != 0) {
      length++;
    }

    return length;
  }
}
