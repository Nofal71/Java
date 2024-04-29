public class P_2180 {
    public static String firstPalindrome(String[] words) {

        String ans = new String();

        for (int i = 0; i < words.length; i++) {
            String temp = new String();
            for (int j = words[i].length() - 1; j >= 0; j--) {
                temp += words[i].charAt(j);
            }

            if (temp.equals(words[i])) {
                ans += temp;
                break;
            }

        }

        return ans;

    }

    public static void main(String[] args) {
        String[] words = { "abc", "car", "ada", "racecar", "cool" };
        System.out.println(firstPalindrome(words));
    }
}
