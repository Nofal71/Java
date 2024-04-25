public class P_1816 {
    public static String truncateSentence(String s, int k) {
        String ans = "";
        String[] split = s.split(" ");

        for (int i = 0; i < split.length && i < k ; i++) {
            if (k == 1) {
                ans += split[0];
                break;
            } else {
                    ans += (split[i] + " ");
            }
        }

        return ans.trim();
    }

    public static void main(String[] args) {

        String sentence = "What is the solution to this problem";
        int k = 4;
        String ans = truncateSentence(sentence, k);
        System.out.println(ans);

    }

}
