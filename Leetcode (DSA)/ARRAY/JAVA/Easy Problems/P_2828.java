import java.util.Arrays;
import java.util.List;

public class P_2828 {
    public static boolean isAcronym(List<String> words, String s) {

        boolean isAcronym = false;
        String temp = new String();

        // Concating First characters of words list into one String

        for (int i = 0; i < words.size(); i++) {
            temp += words.get(i).charAt(0);
        }

        // comparing both "s" and String of Fist Characters of words , As I created
        // Above .....

        for (int i = 0; i < s.length(); i++) {
            if (temp.equals(s)) {
                isAcronym = true;
            }
        }

        // Return if String is Acronym
        return isAcronym;

    }

    public static void main(String[] args) {
        // test case :

        List<String> words = Arrays.asList("alice", "bob", "charlie");
        String s = "abc";

        // Output will be "TRUE" .... because : alice first is 'a', bob is 'b' , charlie is 'c' which are equals to string s "abc";

        System.out.println(isAcronym(words, s));
    }
}
