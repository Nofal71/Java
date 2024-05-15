public class P_2114 {
    public static int mostWordsFound(String[] sentences) {
        int spaceCount = 0, maxWords = 0;

        for (int i = 0; i < sentences.length; i++) {
            int length = sentences[i].length();
            for (int j = 0; j < length; j++) {
                if (sentences[i].charAt(j) == ' ') {
                    spaceCount++;

                    if (maxWords < spaceCount) {
                        maxWords = spaceCount;
                    }

                }
            }
            spaceCount = 0;
        }
        return maxWords + 1;
    }

    public static void main(String[] args) {
        String[] sentences = { "please wait", "continue to fight", "continue to win" };
        System.out.println(mostWordsFound(sentences));

    }
}
