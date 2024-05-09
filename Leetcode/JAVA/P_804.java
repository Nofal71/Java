public class P_804 {
    public static int uniqueMorseRepresentations(String[] words) {
        int diffWords = 0;
        String[] morseCode = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

        char[] alphabets = {
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        };

        String[] temp = new String[words.length];

        for (String x : words) {
            String concat = new String();
            for (int i = 0; i < x.length(); i++) {
                for (int j = 0; j < alphabets.length; j++) {
                    char word = x.charAt(i);
                    if (word == alphabets[j]) {
                        concat += morseCode[j];
                        break;
                    }
                }
            }

            boolean c = true;

            for(int i = 0 ; i < diffWords ; i ++){
                if(temp[i] != null && temp[i].equals(concat)){
                    c = false;
                    break;
                }
            }

            if (c) {
                temp[diffWords++] = concat; 
            }
        }
        return diffWords;
    }

    public static void main(String[] args) {
        String[] words = { "zocd", "gjkl", "hzqk", "hzgq", "gjkl" };
        System.out.println(uniqueMorseRepresentations(words));
    }

}
