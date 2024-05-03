public class P_1684 {
    public static int countConsistentStrings(String allowed, String[] words) {
        int ans = 0;

        // for (int i = 0; i < allowed.length() - 1; i++) { // Loop for allowed
        //     for (int j = 0; j < words.length; j++) { // Loop for words array index

        //         Boolean temp1 = false;
        //         Boolean temp2 = false;

        //         for (int k = 0; k < words[j].length(); k++) { // Loop for indexed word length

        //                 temp1 = false;
        //                 temp2 = false;
        //                 break;
        //             }

        //                 temp1 = true;
        //                 temp2 = true;
        //             }

        //         }
        //             ans++;
        //         }
        //     }
        // }


        for (int i = 0; i < words.length; i++) {
            boolean consistent = true; // Assume the word is consistent until proven otherwise

            for (int j = 0; j < words[i].length(); j++) {
                if (allowed.indexOf(words[i].charAt(j)) == -1) {
                    consistent = false; // If any character is not allowed, mark the word as inconsistent
                    break; // No need to continue checking this word
                }
            }

            if (consistent) {
                ans++; // If the word is consistent, increment the count
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
