public class P_2180 {

    // LEETCODE PROBLEM #2180 IN ARRAY SECTION

    public static String firstPalindrome(String[] words) {

    // Initialization of an empty String to store Required answer and return then ...
        String ans = new String();


        for (int i = 0; i < words.length; i++) {

            // temporary variable to concat characters of each element, check logics , refresh value in each itration..
            String temp = new String();

            for (int j = words[i].length() - 1; j >= 0; j--) {

            // Example : string "ABC" will be "CBA" here , reversing process..
                temp += words[i].charAt(j);
            }
            
            // if reverse string equal to orignal then return this required string ..

            if (temp.equals(words[i])) {
                ans += temp;
                break;
            }

        }

        return ans;

    }

    public static void main(String[] args) {

        // Test Case :-
        String[] words = { "abc", "car", "ada", "racecar", "cool" };

        // OUTPUT :-  "ada"
        System.out.println(firstPalindrome(words));
        
    }
}
