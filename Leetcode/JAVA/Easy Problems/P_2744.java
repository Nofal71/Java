public class P_2744 {
    public static int maximumNumberOfStringPairs(String[] words) {
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            String temp = new String();
            for (int k = words[i].length() - 1; k >= 0; k--) {
                temp += words[i].charAt(k);
            }
            for (int j = i+1; j < words.length; j++) {
                if (words[j].equals(temp) ) {
                    count++;
                    break;
                }
            }

        }

        return count;
    }

    public static void main(String[] args) {
        String[] words = { "cd", "ac", "dc", "ca", "zz" };
        System.out.println(maximumNumberOfStringPairs(words));
    }
}
