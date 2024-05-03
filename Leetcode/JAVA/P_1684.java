public class P_1684 {
    public static int countConsistentStrings(String allowed, String[] words) {
        int ans = 0;

        for (int i = 0; i < words.length; i++) {
            boolean consistent = true; 

            for (int j = 0; j < words[i].length(); j++) {
                if (allowed.indexOf(words[i].charAt(j)) == -1) {
                    consistent = false; 
                    break; 
                }
            }

            if (consistent) {
                ans++; 
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
