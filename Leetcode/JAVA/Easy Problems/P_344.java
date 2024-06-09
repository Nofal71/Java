public class P_344 {
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {  
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            
            right--;
            left++;
        }

        for (char x : s) {
            System.out.print(x);
        }
    }

    public static void main(String[] args) {
        char[] s = { 'H', 'a', 'n', 'n', 'a' , 'h'};
        reverseString(s);
    }
}
