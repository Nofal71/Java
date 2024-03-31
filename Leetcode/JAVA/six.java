import java.util.ArrayList;
import java.util.List;

public class six {
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> requiredIndex = new ArrayList<>();
        
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].charAt(j) == x) {
                    requiredIndex.add(i);
                    break;
                }
            }
        }

        return requiredIndex;
    }

    public static void main(String[] args) {
        String[] array = { "nofal", "Hassaan" , "Leet" , "code" , "problem Solving"};
        char toFind = 'n';
        List<Integer> result = findWordsContaining(array, toFind);
        System.out.println("Required Character is At Index of : " + result);
    }

}
