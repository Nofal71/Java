public class P_3110 {
    public static int scoreOfString(String s) {
        int score = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int current = s.charAt(i);
            int next = s.charAt(i + 1);
            score += Math.abs(current - next);
        }

        return score;

    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(scoreOfString(s));
    }
}
