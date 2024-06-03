public class P_2486 {
    public static int appendCharacters(String s, String t) {
        int s_index = 0;
        int t_index = 0;

        while (s_index < s.length()) {

            if (s.charAt(s_index) == t.charAt(t_index)) {
                s_index++;
                t_index++;
                if (t.length() == t_index) {
                    break;
                }
            } else {
                s_index++;
            }
        }

        return t.length() - t_index;
    }

    public static void main(String[] args) {
        String s = "abcde", t = "a";
        System.out.println(appendCharacters(s, t));
    }
}
