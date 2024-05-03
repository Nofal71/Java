public class P_1684 {
    public static int countConsistentStrings(String allowed, String[] words) {
        int ans = 0;

        for (int i = 0; i < allowed.length() - 1; i++) { // Loop for allowed
            for (int j = 0; j < words.length; j++) { // Loop for words array index

                Boolean temp1 = false;
                Boolean temp2 = false;

                for (int k = 0; k < words[j].length(); k++) { // Loop for indexed word length

                    if (words[j].charAt(k) != allowed.charAt(0) && words[j].charAt(k) != allowed.charAt(1)) {
                        temp1 = false;
                        temp2 = false;
                        break;
                    }

                    if (allowed.charAt(i) == words[j].charAt(k)) {
                        temp1 = true;
                    } else if (allowed.charAt(i + 1) == words[j].charAt(k)) {
                        temp2 = true;
                    }

                }
                if (temp1 == true && temp2 == true) {
                    ans++;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = { "ad", "bd", "aaab", "baa", "badab" };
        System.out.println(countConsistentStrings(allowed, words));
    }
}
