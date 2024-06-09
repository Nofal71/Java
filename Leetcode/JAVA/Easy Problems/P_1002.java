import java.util.ArrayList;
import java.util.List;

public class P_1002 {
    public static List<String> commonChars(String[] words) {
        List<String> common = new ArrayList<>();

        // words[i]
        for (int i = 0; i < words[0].length(); i++) {
            char temp = words[0].charAt(i);
            boolean presesnt = true;
            for (int j = 1; j < words.length; j++) {
                boolean found = false;
                for (int k = 0; k < words[j].length(); k++) {
                    if (temp == words[j].charAt(k)) {
                        found = true;
                        words[j] = words[j].substring(0, k) + words[j].substring(k + 1);
                        break;
                    }
                }
                if (!(found)) {
                    presesnt = false;
                    break;
                }
            }
            if (presesnt) {
                String str = new String();
                str += temp;
                common.add(str);
            }
        }

        return common;
    }

    public static void main(String[] args) {
        String[] words = { "bella", "label", "roller" };
        System.out.println(commonChars(words));
    }
}
