public class P_1528 {
    public static String restoreString(String s, int[] indices) {
        String shuffuledString = new String();
        char[] arr = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr[indices[i]] = s.charAt(i);
        }

        for (int i = 0; i < s.length(); i++) {
            shuffuledString += arr[i];
        }

        return shuffuledString;

    }

    public static void main(String[] args) {
        int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
        String s = "codeleet";
        System.out.println(restoreString(s, indices));

    }

}