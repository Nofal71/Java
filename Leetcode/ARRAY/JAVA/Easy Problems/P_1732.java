public class P_1732 {

    // LEETCODE PROBLEM 1732 :- Highest altitude in given array as gain is net , and
    // first point has zero altitude :-

    public static int largestAltitude(int[] gain) {

        int highest = 0;
        int[] altitude = new int[gain.length + 1]; // As one extra itration , so preventing from out of bounds
                                                   // exeptions....

        altitude[0] = 0; // first point will be zero as in statement

        for (int i = 1; i <= gain.length; i++) {

            // as current altitude is zero
            // to extract altitude from net gain : current altitude = current net gain + prev altitude : -

            altitude[i] = altitude[i - 1] + gain[i - 1];

            // Extracting Highest altitude

            if (highest < altitude[i]) {
                highest = altitude[i];
            }

        }

        // return highest altitude :

        return highest;

    }

    public static void main(String[] args) {
        // Test Case :-
        int[] gain = { -5, 1, 5, 0, -7 };

        // Output :- 1 is LARGEST Altitude ....

        System.out.println(largestAltitude(gain));
    }
}
